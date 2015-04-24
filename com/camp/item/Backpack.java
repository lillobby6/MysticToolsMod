package com.camp.item;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.camp.container.ContainerBackpack;

public class Backpack extends ItemArmor {

	public Backpack(ArmorMaterial armorMaterials, int renderIndex, int armorType)
	{
		super(armorMaterials, armorType, armorType);
		this.setMaxStackSize(1);
		//this.setHasSubtypes(true);
	}
	
	public void func_77624_a(ItemStack itemStack, EntityPlayer player, List list, boolean p_77624_4_)
	{
	    list.add("WIP");
	}
	
	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type)
	{
	return null;
	}
	
	public void onArmorTake(World world, EntityPlayer player, ItemStack itemStack)
	{
		if(world.isRemote)
			return;
		
		//TODO: Add Container Backpack check
		if(player.openContainer == null || player.openContainer instanceof ContainerPlayer)
			return;
		
		if(!(itemStack.getItem() instanceof Backpack))
			return;
		
		//int containerType = containerMatchesItem(player.openContainer)
	
		if(ContainerBackpack.class.isAssignableFrom(player.openContainer.getClass()))
		{
			ContainerBackpack backpack = (ContainerBackpack) player.openContainer;
			if(backpack.updateState)
			{
				backpack.saveToNBT(itemStack);
				backpack.updateState = false;
			}
		}
	}
	
	 
	
	
	
}
