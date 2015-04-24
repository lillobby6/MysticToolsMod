package com.camp.item;

import net.minecraft.item.ItemSpade;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MagicSpade extends ItemSpade{

	public MagicSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.setUnlocalizedName("MagicSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":magic_shovel");
	}

}
