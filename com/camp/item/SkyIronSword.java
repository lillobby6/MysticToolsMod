package com.camp.item;

import net.minecraft.item.ItemSword;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class SkyIronSword extends ItemSword{

	public SkyIronSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("SkyIronSword");
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		this.setTextureName(StringLibrary.MODID + ":sky_iron_sword");
	}

}
