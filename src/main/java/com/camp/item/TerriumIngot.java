package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class TerriumIngot extends Item{
	
	public static final String name = "TerriumIngot";
	
	public TerriumIngot()
	{
		this.setUnlocalizedName("TerriumIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID +":terrium_ingot");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
}
