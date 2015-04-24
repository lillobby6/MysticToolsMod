package com.camp.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class Justice extends ItemSword {

	public Justice(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}
	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase owner) {
		Entity bolt = new EntityLightningBolt(owner.worldObj, target.posX, target.posY, target.posZ);
	    owner.worldObj.addWeatherEffect(bolt);
	    return true;
    }

}
