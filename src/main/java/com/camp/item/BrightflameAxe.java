package com.camp.item;

import net.minecraft.item.ItemPickaxe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightflameAxe extends ItemPickaxe{

	protected BrightflameAxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		this.setUnlocalizedName("BrightflameAxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":brightflame_axe");
	}

}
