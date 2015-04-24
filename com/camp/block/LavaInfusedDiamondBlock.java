package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class LavaInfusedDiamondBlock extends Block{

	protected LavaInfusedDiamondBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setBlockName("LavaInfusedDiamondBlock");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":lava_infused_diamond_block");
		this.setHardness(8f);
		this.setResistance(35f);
	}

}