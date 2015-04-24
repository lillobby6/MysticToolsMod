package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightflameIngot extends Item{
		public BrightflameIngot(){
			this.setUnlocalizedName("BrightflameIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			this.setTextureName(StringLibrary.MODID + ":brightflame_ingot");
		}
}
