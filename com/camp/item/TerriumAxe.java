package com.camp.item;

import net.minecraft.item.ItemAxe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class TerriumAxe extends ItemAxe{

	protected TerriumAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("TerriumAxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":terrium_axe");
	}

}
