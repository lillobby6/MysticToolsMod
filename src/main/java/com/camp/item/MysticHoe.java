package com.camp.item;

import net.minecraft.item.ItemHoe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MysticHoe extends ItemHoe{

	public MysticHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("MysticHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":mystic_hoe");
	}

}
