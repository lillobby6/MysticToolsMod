package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class WeaklyReinforcedCobblestone extends Block {

	protected WeaklyReinforcedCobblestone(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("WeaklyReinforcedCobblestone");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		//this.setBlockTextureName(StringLibrary.MODID + ":weakly_reinfroced_cobblestone");
	}

}
