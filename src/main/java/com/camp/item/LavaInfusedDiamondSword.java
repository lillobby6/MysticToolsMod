package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class LavaInfusedDiamondSword extends ItemSword{

	public LavaInfusedDiamondSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("LavaInfusedDiamondSword");
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		this.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_sword");
	}

}
