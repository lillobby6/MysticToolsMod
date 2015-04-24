package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MysticIngot extends Item{
	public MysticIngot(){
		this.setUnlocalizedName("MysticIngot");
	    this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
	    this.setTextureName(StringLibrary.MODID + ":mystic_ingot");
	    this.setMaxStackSize(48);
	}
}
