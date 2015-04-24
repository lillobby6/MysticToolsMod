package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class LavaInfusedDiamondSpade extends ItemSpade{

	public LavaInfusedDiamondSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("LavaInfusedDiamondSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_shovel");
	}

}
