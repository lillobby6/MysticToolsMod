package com.camp.item;

import com.camp.lib.StringLibrary;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BrightflameArmor extends ItemArmor{

	public BrightflameArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType)
	{
		super(material, renderIndex, armorType);
	
		this.setUnlocalizedName(unlocalizedName);
	}
	
	

	/*public BrightflameArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return StringLibrary.MODID + ":textures/models/armor/brightflame_layer_2.png";
		}
		return StringLibrary.MODID + ":textures/models/armor/brightflame_layer_1.png";
	}*/

}
