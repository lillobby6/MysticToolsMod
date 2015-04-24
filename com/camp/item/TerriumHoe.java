package com.camp.item;

import net.minecraft.item.ItemHoe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class TerriumHoe extends ItemHoe {

	public TerriumHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("TerriumHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":terrium_hoe");
	}

}
