package com.camp.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Corruption extends ItemSword {
	
	public static final String name = "Corruption";

	

	public Corruption(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
		GameRegistry.registerItem(this, name);
	}
	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase owner) {
		Entity bolt = new EntityLightningBolt(owner.worldObj, target.posX, target.posY, target.posZ);
	    owner.worldObj.addWeatherEffect(bolt);
	    return true;
    }
	
	public static String getName()
	{
		return name;
	}

}