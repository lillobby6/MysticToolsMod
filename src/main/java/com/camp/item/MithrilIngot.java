package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MithrilIngot extends Item{
	
	public static final String name = "MithrilIngot";
	
		public MithrilIngot(){
			this.setUnlocalizedName("MithrilIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":mithril_ingot");
			GameRegistry.registerItem(this, name);
		}
	
	public String getName()
	{
		return name;
	}
	
}
