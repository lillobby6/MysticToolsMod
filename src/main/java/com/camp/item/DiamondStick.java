package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class DiamondStick extends Item{
	public DiamondStick(){
		this.setUnlocalizedName("DiamondStick");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		this.setTextureName(StringLibrary.MODID + ":diamond_stick");
	}
}
