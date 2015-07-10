package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MysticSword extends ItemSword{

	public MysticSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("MysticSword");
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		//this.setTextureName(StringLibrary.MODID + ":mystic_sword");
	}

}
