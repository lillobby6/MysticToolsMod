package com.camp.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

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
	public String getInventoryName() {
        return this.chest.hasCustomInventoryName() ? this.chest.getInventoryName() : this.name;
	}

	@Override
	public boolean hasCustomInventoryName() {
        return this.chest.hasCustomInventoryName();
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
	public void openInventory() {
		this.chest.openInventory();
	}

	@Override
	public void closeInventory() {
		this.chest.closeInventory();
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		return true;
	}

}
