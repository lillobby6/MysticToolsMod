package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class FlameWroughtGoldIngot extends Item{
	public FlameWroughtGoldIngot(){
		this.setUnlocalizedName("FlameWroughtGoldIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		this.setTextureName(StringLibrary.MODID + ":flamewrought_gold_ingot");
	}

}
