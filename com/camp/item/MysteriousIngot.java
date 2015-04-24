package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MysteriousIngot extends Item{
		public MysteriousIngot(){
			this.setUnlocalizedName("MysteriousIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			this.setTextureName(StringLibrary.MODID + ":mysterious_ingot");
		}
}
