package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class SkyIronBlock extends Block {

	protected SkyIronBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("SkyIronBlock");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":sky_iron_block");
		this.setHardness(5.0f);
		this.setResistance(10.0f);
	}

}
