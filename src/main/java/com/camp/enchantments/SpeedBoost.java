package com.camp.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class SpeedBoost extends Enchantment {

	protected SpeedBoost(int id, int rarity) {
		super(id, null, rarity, EnumEnchantmentType.ARMOR_FEET);
		this.setName("SpeedBoost");
		
		
	}
	
	public int getMinEnchantablility(int par1)
	{
		return 5 + (par1 - 1) * 10; 
	}

	public int getMaxEnchantability(int par1)
	{
		return this.getMinEnchantability(par1) + 30;
	}
	
	public int getMaxLevel()
	{
		return 4;
	}
	
}
