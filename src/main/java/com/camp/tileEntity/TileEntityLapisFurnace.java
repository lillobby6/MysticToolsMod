package com.camp.tileEntity;

import com.camp.block.LapisFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
	
	private int totalCookTime;
	
	public int getSizeInventory()
	{
		return this.slots.length;
	}
	
	@Override
	public String getName()
	{
		return this.hasCustomName() ?  this.localizedName : "container.lapisFurnace";
	}
	
	@Override
	public boolean hasCustomName()
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
	public void setInventorySlotContents(int index, ItemStack stack) {
        boolean flag = stack != null && stack.isItemEqual(this.slots[index]) && ItemStack.areItemStackTagsEqual(stack, this.slots[index]);
        this.slots[index] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        if (index == 0 && !flag)
        {
            this.totalCookTime = this.getFurnaceBurnTime(stack);
            this.cookTime = 0;
            this.markDirty();
        
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
		this.totalCookTime = nbt.getShort("TotalCookTime");
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
		nbt.setShort("CookTimeTotal", (short)this.totalCookTime);
		
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
		
		if(this.hasCustomName())
		{
			nbt.setString("CustomName", this.localizedName);
		}
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player)
    {
        return this.worldObj.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
    }

	//@Override
	public void openInventory() {}

	//@Override
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
	

	public void update()
    {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning())
        {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (!this.isBurning() && (this.slots[1] == null || this.slots[0] == null))
            {
                if (!this.isBurning() && this.cookTime > 0)
                {
                    this.cookTime = MathHelper.clamp_int(this.cookTime - 2, 0, this.totalCookTime);
                }
            }
            else
            {
                if (!this.isBurning() && this.canSmelt())
                {
                	this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                    if (this.isBurning())
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

                    if (this.cookTime == this.totalCookTime)
                    {
                        this.cookTime = 0;
                        this.totalCookTime = this.getFurnaceBurnTime(this.slots[0]);
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }

            if (flag != this.isBurning())
            {
                flag1 = true;
                BlockFurnace.setState(this.isBurning(), this.worldObj, this.pos);
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
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);
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
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null)
            {
                this.slots[2] = itemstack.copy();
            }
            else if (this.slots[2].getItem() == itemstack.getItem())
            {
                this.slots[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            if (this.slots[0].getItem() == Item.getItemFromBlock(Blocks.sponge) && this.slots[0].getMetadata() == 1 && this.slots[1] != null && this.slots[1].getItem() == Items.bucket)
            {
                this.slots[1] = new ItemStack(Items.water_bucket);
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0)
            {
                this.slots[0] = null;
            }
        }
		
	}
	
	/**
     * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't
     * fuel
     */
    public static int getItemBurnTime(ItemStack p_145952_0_)
    {
        if (p_145952_0_ == null)
        {
            return 0;
        }
        else
        {
            Item item = p_145952_0_.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
            {
               Block block = Block.getBlockFromItem(item);
/*
                if (block == Blocks.wooden_slab)
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

            //if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
            //if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
            //if (item instanceof ItemHoe && ((ItemHoe)item).getMaterialName().equals("WOOD")) return 200;
            //if (item == Items.stick) return 100;
            //if (item == Items.coal) return 1600;
           // if (item == Items.lava_bucket) return 20000;
            //if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return net.minecraftforge.fml.common.registry.GameRegistry.getFuelValue(p_145952_0_);
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

	//@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		return var1 == 0 ? slots_bottom : (var1 == 1 ? slots_top : slots_sides);
	}

	//@Override
	public boolean canInsertItem(int i, ItemStack  itemstack,
			int j) {
			
		return this.isItemValidForSlot(i, itemstack);
	}

	//@Override
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

	@Override
	public void openInventory(EntityPlayer player) {}

	@Override
	public void closeInventory(EntityPlayer player) {}

	@Override
	public int getField(int id) {
		switch (id)
        {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentItemBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
	}

	@Override
	public void setField(int id, int value) {
		switch (id)
        {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentItemBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
	}

	@Override
	public int getFieldCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.slots.length; ++i)
        {
            this.slots[i] = null;
        }
	}

	

	@Override
	public IChatComponent getDisplayName() {
		return null;
	}

	@Override
	public int[] getSlotsForFace(EnumFacing side) {
		return side == EnumFacing.DOWN ? slots_bottom : (side == EnumFacing.UP ? slots_top : slots_top);
	}

	@Override
	/**
     * Returns true if automation can insert the given item in the given slot from the given side. Args: slot, item,
     * side
     */
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction)
    {
        return this.isItemValidForSlot(index, itemStackIn);
    }

	@Override
	public boolean canExtractItem(int index, ItemStack stack,
			EnumFacing direction) {
		if (direction == EnumFacing.DOWN && index == 1)
        {
            Item item = stack.getItem();

            if (item != Items.water_bucket && item != Items.bucket)
            {
                return false;
            }
        }

        return true;
	}
	
	public static int getFurnaceBurnTime(ItemStack stack)
	{
		return 200;
	}
	
}

