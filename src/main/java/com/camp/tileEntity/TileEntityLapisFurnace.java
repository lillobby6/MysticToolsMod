package com.camp.tileEntity;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

import com.camp.block.LapisFurnace;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityLapisFurnace extends TileEntity implements ISidedInventory{

	private String localizedName;
	
	private static final int[] slots_top = new int[]{0};
	private static final int[] slots_bottom = new int[]{2, 1};
	private static final int[] slots_sides = new int[]{1};
	
	private ItemStack[] slots = new ItemStack[3];
	
	/**Furnace Speed*/
	public int furnaceSpeed = 200;
	
	
	/**How long this furnace will continue to burn.*/
	public int burnTime;
	
	/**The start time for this fuel.*/
	public int currentItemBurnTime;
	
	/**How much time left before item cooked.*/
	public int cookTime;
	
	public int getSizeInventory()
	{
		return this.slots.length;
	}
	
	public String getInventoryName()
	{
		return this.hasCustomInventoryName() ?  this.localizedName : "container.lapisFurnace";
	}
	

	public boolean hasCustomInventoryName()
	{
		return this.localizedName != null && this.localizedName.length() > 0;
	}
	
	public void setGuiDisplayName(String displayName) {
			this.localizedName = displayName;
		
	}

	@Override
	public ItemStack getStackInSlot(int i) {

		return this.slots[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {

		if (this.slots[i] != null)
        {
            ItemStack itemstack;

            if (this.slots[i].stackSize <= j)
            {
                itemstack = this.slots[i];
                this.slots[i] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.slots[i].splitStack(j);

                if (this.slots[i].stackSize == 0)
                {
                    this.slots[i] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {

		if (this.slots[i] != null)
        {
            ItemStack itemstack = this.slots[i];
            this.slots[i] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		this.slots[i] = itemstack;

        if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit())
        {
            itemstack.stackSize = this.getInventoryStackLimit();
        }
		
	}
	
	@Override
	public int getInventoryStackLimit() {

		return 64;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		
		NBTTagList list = nbt.getTagList("items", 10);
		this.slots = new ItemStack[this.getSizeInventory()];
		
		for(int i = 0; i < list.tagCount(); i++)
		{
			NBTTagCompound compound = (NBTTagCompound) list.getCompoundTagAt(i);
			byte b = compound.getByte("Slot");
			
			if(b >= 0 && b < this.slots.length)
			{
				this.slots[b] = ItemStack.loadItemStackFromNBT(compound);
			}
			
		}
		
		this.burnTime = nbt.getShort("BurnTime");
		this.cookTime = nbt.getShort("CookTime");
		this.currentItemBurnTime = getItemBurnTime(this.slots[1]);
		
		if(nbt.hasKey("CustomName"))
		{
			this.localizedName = nbt.getString("CustomeName");
		}
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		
		nbt.setShort("BurnTime", (short)this.burnTime);
		nbt.setShort("CookTime", (short)this.cookTime);
		
		NBTTagList list = new NBTTagList();
		
		for(int i = 0; i < this.slots.length; i++)
		{
			if(this.slots[i] != null)
			{
				NBTTagCompound compound = new NBTTagCompound();
				compound.setByte("Slot", (byte) i );
				this.slots[i].writeToNBT(compound);
				list.appendTag(compound);
			}
		}
		
		nbt.setTag("items", list);
		
		if(this.hasCustomInventoryName())
		{
			nbt.setString("CustomName", this.localizedName);
		}
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {

		 return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entityplayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}
	
	public boolean isBurning()
	{
		return this.burnTime > 0;
	}
	
	/**@Override
	public void updateEntity()
	{
		
		boolean flag = this.burnTime > 0;
		boolean flag1 = false;
		
		if(this.burnTime > 0)
		{
			this.burnTime--;
		}

		if(!this.worldObj.isRemote)
		{
			if(this.burnTime == 0 && this.canSmelt())
			{
				this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);
				
				if(this.burnTime > 0)
				{
					flag1 = true;
					if(this.slots[1] != null)
					{
						this.slots[1].stackSize--;
						
						if(this.slots[1].stackSize == 0)
						{
							this.slots[1] = this.slots[1].getItem().getContainerItem(this.slots[1]);
						}
					}
				}
			}
			
			if(this.isBurning() && this.canSmelt())
			{
				this.cookTime++;
				
				if(this.cookTime == this.furnaceSpeed)
				{
					this.cookTime = 0;
					this.smeltItem();
					flag1 = true;
				}
				
			}
			else
			{
				this.cookTime = 0;
			}
			
			if(flag != this.burnTime > 0)
			{
				flag1 = true;
				LapisFurnace.updateLapisFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
			}
		}
		if(flag1)
		{
			this.markDirty();
		}
		
	}*/
	@Override
	public void updateEntity()
    {
        boolean flag = this.burnTime > 0;
        boolean flag1 = false;

        if (this.burnTime > 0)
        {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.burnTime != 0 || this.slots[1] != null && this.slots[0] != null)
            {
                if (this.burnTime == 0 && this.canSmelt())
                {
                    this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                    if (this.burnTime > 0)
                    {
                        flag1 = true;

                        if (this.slots[1] != null)
                        {
                            --this.slots[1].stackSize;

                            if (this.slots[1].stackSize == 0)
                            {
                                this.slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt())
                {
                    ++this.cookTime;

                    if (this.cookTime == 200)
                    {
                        this.cookTime = 0;
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }

            if (flag != this.burnTime > 0)
            {
                flag1 = true;
                LapisFurnace.updateLapisFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }	
	
	private boolean canSmelt()
	{
		if (this.slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
            if (itemstack == null) return false;
            if (this.slots[2] == null) return true;
            if (!this.slots[2].isItemEqual(itemstack)) return false;
            int result = slots[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
	}
	
	public void smeltItem()
	{
		if (this.canSmelt())
        {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null)
            {
                this.slots[2] = itemstack.copy();
            }
            else if (this.slots[2].getItem() == itemstack.getItem())
            {
                this.slots[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0)
            {
                this.slots[0] = null;
            }
        }
		
	}
	
	/**Gets the time in tick in which the item burns.*/
	 public static int getItemBurnTime(ItemStack itemstack)
	    {
	        if (itemstack == null)
	        {
	            return 0;
	        }
	        else
	        {
	            Item item = itemstack.getItem();

	            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
	            {
	                Block block = Block.getBlockFromItem(item);

	               /* if (block == Blocks.wooden_slab)
	                {
	                    return 150;
	                }

	                if (block.getMaterial() == Material.wood)
	                {
	                    return 300;
	                }*/

	                if (block == Blocks.redstone_block)
	                {
	                    return 16000;
	                }
	            }

	            /**if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
	            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
	            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) return 200;
	            if (item == Items.stick) return 100;
	            if (item == Items.coal) return 1600;
	            if (item == Items.lava_bucket) return 20000;
	            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
	            if (item == Items.blaze_rod) return 2400;*/
	            if (item == Items.redstone) return 1600;
	            return GameRegistry.getFuelValue(itemstack);
	        }
	    }
	
	public static boolean isItemFuel(ItemStack itemstack)
	{
		return getItemBurnTime(itemstack) > 0;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return i == 2 ? false : (i == 1 ? isItemFuel(itemstack) : true);
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		return var1 == 0 ? slots_bottom : (var1 == 1 ? slots_top : slots_sides);
	}

	@Override
	public boolean canInsertItem(int i, ItemStack  itemstack,
			int j) {
			
		return this.isItemValidForSlot(i, itemstack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack,
			int j) {

		return j != 0 || i != 1 || itemstack.getItem() == Items.bucket;
	}

	@SideOnly(Side.CLIENT)
	public int getBurnTimeRemainingScaled(int i) {
		if(this.currentItemBurnTime == 0)
		{
			this.currentItemBurnTime = this.furnaceSpeed;
		}
		return this.burnTime * i / this.currentItemBurnTime;
	}

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(int i)
	{
		return this.cookTime * i / this.furnaceSpeed;
	}
}

