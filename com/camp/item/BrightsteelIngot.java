package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightsteelIngot extends Item
{
		public BrightsteelIngot()
		{
			this.setUnlocalizedName("BrightsteelIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			this.setTextureName(StringLibrary.MODID + ":brightsteel_ingot");
		}
}
