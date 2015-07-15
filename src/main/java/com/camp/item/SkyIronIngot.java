package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class SkyIronIngot extends Item {
	
	public static final String name = "SkyIronIngot";
	
		public SkyIronIngot()
		{
			this.setUnlocalizedName("SkyIronIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":sky_iron_ingot");
			GameRegistry.registerItem(this, name);
		}
		
		public String getName()
		{
			return name;
		}
}
