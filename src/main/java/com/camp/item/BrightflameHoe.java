package com.camp.item;

import net.minecraft.item.ItemHoe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightflameHoe extends ItemHoe{

	public BrightflameHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setUnlocalizedName("BrightflameHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":brightflame_hoe");
	}

}
