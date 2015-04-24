package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class TerriumIngot extends Item{
	public TerriumIngot()
	{
		this.setUnlocalizedName("TerriumIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		this.setTextureName(StringLibrary.MODID +":terrium_ingot");
	}
}
