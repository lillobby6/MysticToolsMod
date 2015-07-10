package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class DiamondStick extends Item{
	
	public static final String name = "DiamondStick";
	
	public DiamondStick(){
		this.setUnlocalizedName("DiamondStick");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":diamond_stick");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
}
