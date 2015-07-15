package com.camp.item;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class TerriumHoe extends ItemHoe {
	
	public static final String name = "TerriumHoe";

	public TerriumHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("TerriumHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":terrium_hoe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
