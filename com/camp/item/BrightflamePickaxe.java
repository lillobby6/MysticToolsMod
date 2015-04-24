package com.camp.item;

import net.minecraft.item.ItemPickaxe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightflamePickaxe extends ItemPickaxe{

	protected BrightflamePickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		this.setUnlocalizedName("BrightflamePickaxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":brightflame_pickaxe");
	}

}
