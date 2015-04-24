package com.camp.item;

import net.minecraft.item.ItemSpade;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightflameSpade extends ItemSpade{

	public BrightflameSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.setUnlocalizedName("BrightflameSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":brightflame_shovel");
	}

}
