package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class SkyIronHoe extends ItemHoe{

	public SkyIronHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setUnlocalizedName("SkyIronHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":sky_iron_hoe");
	}

}
