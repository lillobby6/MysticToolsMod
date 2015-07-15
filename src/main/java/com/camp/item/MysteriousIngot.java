package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MysteriousIngot extends Item{
	
	public static final String name = "MysteriousIngot";
	
		public MysteriousIngot(){
			this.setUnlocalizedName("MysteriousIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":mysterious_ingot");
			GameRegistry.registerItem(this, name);
		}
	
	public String getName()
	{
		return name;
	}
		
}
