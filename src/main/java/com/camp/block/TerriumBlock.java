package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class TerriumBlock extends Block{

	protected TerriumBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setUnlocalizedName("TerriumBlock");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		//this.setBlockTextureName(StringLibrary.MODID + ":terrium_block");
		this.setHardness(5f);
		this.setResistance(50f);
	}

}
