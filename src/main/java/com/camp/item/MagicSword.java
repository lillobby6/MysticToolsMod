package com.camp.item;

import net.minecraft.item.ItemSword;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MagicSword extends ItemSword{

	public MagicSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("MagicSword");
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		this.setTextureName(StringLibrary.MODID + ":magic_sword");
	}

}
