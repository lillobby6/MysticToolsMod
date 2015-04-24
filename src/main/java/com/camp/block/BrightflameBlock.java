package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightflameBlock extends Block {

	protected BrightflameBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("BrightflameBlock");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":brightflame_block");
		this.setHardness(4f);
		this.setResistance(30f);
		this.setLightLevel(0.3f);
	}

}
