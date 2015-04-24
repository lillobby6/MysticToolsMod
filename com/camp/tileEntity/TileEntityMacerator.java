package com.camp.tileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.oredict.OreDictionary;

import com.camp.block.Macerator;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityMacerator extends TileEntity implements ISidedInventory{

	private String localizedName;
	
	private  final int[] slots_top = new int[]{0};
	private  final int[] slots_bottom = new int[]{2, 1};
	private  final int[] slots_sides = new int[]{1};
	
	private ItemStack[] slots = new ItemStack[3];
	
	/**Furnace Speed*/
	public int maceratingSpeed = 70;
	
	
	/**How long this furnace will continue to burn.*/
	public  int power;
	
	public int maxPower = 10000;
	
	/**How much time left before item cooked.*/
	public int cookTime;
	
	public int getSizeInventory()
	{
		return this.slots.length;
	}
	
	public String getInventoryName()
	{
		return this.hasCustomInventoryName() ?  this.localizedName : "Macerator";
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
		
		this.power = nbt.getShort("Power");
		this.cookTime = nbt.getShort("CookTime");
		this.maxPower = nbt.getShort("MaxPower");
		
		if(nbt.hasKey("MaceratorCont"))
		{
			this.localizedName = nbt.getString("MaceratorCont");
		}
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		
		nbt.setShort("Power", (short)this.power);
		nbt.setShort("CookTime", (short)this.cookTime);
		nbt.setShort("MaxPower", (short)this.maxPower);
		
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
			nbt.setString("MaceratorCont", this.localizedName);
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
	
	public boolean hasPower()
	{
		return this.power > 0;
	}
	
	
	@Override
	public void updateEntity()
    {
        boolean flag = this.power > 0;
        boolean flag1 = false;

        if (this.hasPower() && this.isMacerating())
        {
            this.power--;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.hasItemPower(this.slots[1]) && this.power <= (this.maxPower - this.getPower(this.slots[1])))
            {
            	this.power += getPower(this.slots[1]);
            	
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
            if(this.hasPower() && this.canMacerate())
            {
            	this.cookTime++;
            	
            	if(this.cookTime == this.maceratingSpeed)
            	{
            		this.cookTime = 0;
            		this.macerateItem();
            		flag1 = true;
            	}
            }
            else
            {
            	this.cookTime = 0;
            }
            
            if(flag != this.hasPower())
            {
            	flag1 = true;
            	Macerator.updateMaceratorBlockState(this.hasPower(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }

        }

        if (flag1)
        {
            this.markDirty();
        }
    }	
	
	String[] ores = OreDictionary.getOreNames();	
	
	private boolean isOre(ItemStack itemStack) {
		
		
		if(itemStack.getDisplayName().contains("Ore"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean canMacerate()
	{
		
		if (this.slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
            if (itemstack == null) return false;
            if (!this.isOre(this.slots[0])) return false;
            if (this.slots[2] == null) return true;
            if (!this.slots[2].isItemEqual(itemstack)) return false;
            int result = slots[2].stackSize + itemstack.stackSize * 2;
            return result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
	}
	
	

	public void macerateItem()
	{
		
		if (this.canMacerate())
        {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null)
            {
                this.slots[2] = itemstack.copy();
                this.slots[2].stackSize*=2;
            }
            else if (this.slots[2].getItem() == itemstack.getItem())
            {
                this.slots[2].stackSize += itemstack.stackSize*2; // Forge BugFix: Results may have multiple items
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0)
            {
                this.slots[0] = null;
            }
        }
		
	}
	
	/**Gets the time in tick in which the item burns.*/
	 public static int getPower(ItemStack itemstack)
	    {
	        if (itemstack == null)
	        {
	            return 0;
	        }
	        else
	        {
	            Item item = itemstack.getItem();

	            if (item == Items.redstone) return 5;
	            if (item == Item.getItemFromBlock(Blocks.redstone_block)) return 45;
	            return 0;
	        }
	    }
	 
	public boolean isMacerating()
	{
		return this.cookTime > 0;
	}
	
	public static boolean hasItemPower(ItemStack itemstack)
	{
		return getPower(itemstack) > 0;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return i == 2 ? false : (i == 1 ? hasItemPower(itemstack) : true);
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
	public int getPowerRemainingScaled(int i) {
		if(this.maxPower == 0)
		{
			this.maxPower = this.maceratingSpeed;
		}
		return this.power * i / this.maxPower;
	}

	@SideOnly(Side.CLIENT)
	public int getMacerationProgressScaled(int i)
	{
		return this.cookTime * i / this.maceratingSpeed;
	}
}
