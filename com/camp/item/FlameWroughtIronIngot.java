package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class FlameWroughtIronIngot extends Item{
	public FlameWroughtIronIngot(){
		this.setUnlocalizedName("FlameWroughtIronIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		this.setTextureName(StringLibrary.MODID + ":flamewrought_iron_ingot");
	}
}