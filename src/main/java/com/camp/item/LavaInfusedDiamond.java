package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class LavaInfusedDiamond extends Item{
	public LavaInfusedDiamond(){
		this.setUnlocalizedName("LavaInfusedDiamond");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":lava_infused_diamond");
	}
}