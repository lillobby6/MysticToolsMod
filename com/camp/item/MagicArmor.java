package com.camp.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

import com.camp.lib.StringLibrary;

public class MagicArmor extends ItemArmor{
	public MagicArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return StringLibrary.MODID + ":textures/models/armor/magic_layer_2.png";
		}
		return StringLibrary.MODID + ":textures/models/armor/magic_layer_1.png";
	}
}
