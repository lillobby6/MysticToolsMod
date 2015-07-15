package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MixedIngot extends Item{
	
	public static final String name = "MixedIngot";
		
		public MixedIngot(){
			this.setUnlocalizedName("MixedIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":mixed_ingot");
			GameRegistry.registerItem(this, name);
		}
		
	public String getName()
	{
		return name;
	}
		
}
