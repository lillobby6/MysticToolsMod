package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class BrightflameIngot extends Item{
	
		public final String name = "BrightflameIngot";
	
		public BrightflameIngot(){
			this.setUnlocalizedName("BrightflameIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":brightflame_ingot");
			GameRegistry.registerItem(this, name);
		}
		
		public String getName()
		{
			return name;
		}
}
