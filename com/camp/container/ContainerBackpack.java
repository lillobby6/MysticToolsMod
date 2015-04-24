package com.camp.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.camp.inventory.InventoryBackpack;

public class ContainerBackpack extends Container{
	
	public boolean updateState;
	InventoryBackpack backpack;

	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {

		return false;
	}
	
	public void saveToNBT(ItemStack itemStack)
	{
		if(!itemStack.hasTagCompound())
		{
			itemStack.setTagCompound(new NBTTagCompound());
		}
		
		backpack.writeToNBT(itemStack.getTagCompound());
	}
	
	
	
	

}
