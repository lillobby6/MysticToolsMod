package com.camp.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;

public class InventoryMysticChest implements IInventory{

	/** Name of the chest. */
    private String name;
    
    private IInventory chest;
	public InventoryMysticChest(String string, IInventory p_i1559_2_, IInventory p_i1559_3_)
	{
		this.name = string;

        if (p_i1559_2_ == null)
        {
            p_i1559_2_ = p_i1559_3_;
        }

        if (p_i1559_3_ == null)
        {
            p_i1559_3_ = p_i1559_2_;
        }
	}
	
	@Override
	public int getSizeInventory() {
		return 54;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
        return i >= this.chest.getSizeInventory() ? this.chest.getStackInSlot(i) : this.chest.getStackInSlot(i);
	}

	@Override
	public ItemStack decrStackSize(int i, int i1) {
        return i >= this.chest.getSizeInventory() ? this.chest.decrStackSize(i, i1) : this.chest.decrStackSize(i, i1);
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
        return i >= this.chest.getSizeInventory() ? this.chest.getStackInSlotOnClosing(i) : this.chest.getStackInSlotOnClosing(i);
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack stack) {
		if (i >= this.chest.getSizeInventory())
        {
            this.chest.setInventorySlotContents(i, stack);
        }
	}

	@Override
	public String getName() {
        return this.chest.hasCustomName() ? this.chest.getName() : this.name;
	}

	@Override
	public boolean hasCustomName() {
        return this.chest.hasCustomName();
	}

	@Override
	public int getInventoryStackLimit() {
        return this.chest.getInventoryStackLimit();
	}

	@Override
	public void markDirty() {
		this.chest.markDirty();
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return this.chest.isUseableByPlayer(p_70300_1_);
	}

	@Override
	public void openInventory(EntityPlayer player) {
		this.chest.openInventory(player);
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		this.chest.closeInventory(player);
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		return true;
	}

	@Override
	public IChatComponent getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getField(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFieldCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
