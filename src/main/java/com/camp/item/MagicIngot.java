package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MagicIngot extends Item{
	
	public static final String name = "MagicIngot";
	
	public MagicIngot(){
		this.setUnlocalizedName("MagicIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":magic_ingot");
		this.setMaxStackSize(16);
		GameRegistry.registerItem(this, name);
	}
 
 	public String getName()
 	{
 		return name;
 	}
 
}
