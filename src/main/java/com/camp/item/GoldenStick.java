package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class GoldenStick extends Item{
	
	public static final String name = "GoldenStick";
	
	public GoldenStick(){
		this.setUnlocalizedName("GoldenStick");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":golden_stick");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
}
