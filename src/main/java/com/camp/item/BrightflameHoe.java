package com.camp.item;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightflameHoe extends ItemHoe{

	public static final String name = "BrightflameHoe";
	
	public String getName()
	{
		return name;
	}
	
	public BrightflameHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setUnlocalizedName("BrightflameHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":brightflame_hoe");
		GameRegistry.registerItem(this, name);

	}
	
}
