package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class LavaInfusedDiamond extends Item{
	
	public static final String name = "LavaInfusedDiamond";
	
	public LavaInfusedDiamond(){
		this.setUnlocalizedName("LavaInfusedDiamond");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":lava_infused_diamond");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
}