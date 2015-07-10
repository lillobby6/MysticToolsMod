package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class BrightsteelIngot extends Item
{
	
		public static final String name = "BrightsteelIngot";
	
		public BrightsteelIngot()
		{
			this.setUnlocalizedName("BrightsteelIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":brightsteel_ingot");
			GameRegistry.registerItem(this, name);
		}
		
		public String getName()
		{
			return name;
		}
}
