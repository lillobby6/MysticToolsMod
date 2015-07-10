package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MithrilIngot extends Item{
		public MithrilIngot(){
			this.setUnlocalizedName("MithrilIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":mithril_ingot");
		}
}
