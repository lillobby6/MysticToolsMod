package com.camp.enchantments;

import net.minecraft.enchantment.Enchantment;

public class EnchantmentManager {
	public static void mainRegistry() {
		initializeEnchantment();
		
	}
	
	public static Enchantment speedBoost;
	
	public static void initializeEnchantment()
	{
		speedBoost = new SpeedBoost(255, 5);
	}
}
