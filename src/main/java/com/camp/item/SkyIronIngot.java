package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class SkyIronIngot extends Item {
		public SkyIronIngot()
		{
			this.setUnlocalizedName("SkyIronIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			this.setTextureName(StringLibrary.MODID + ":sky_iron_ingot");
		}
}
