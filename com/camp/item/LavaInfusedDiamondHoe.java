package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class LavaInfusedDiamondHoe extends ItemHoe{

	public LavaInfusedDiamondHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("LavaInfusedDiamondHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_hoe");
	}

}
