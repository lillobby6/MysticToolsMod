package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MixedIngot extends Item{
		public MixedIngot(){
			this.setUnlocalizedName("MixedIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			this.setTextureName(StringLibrary.MODID + ":mixed_ingot");
		}
}
