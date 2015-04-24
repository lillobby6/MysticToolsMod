package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class FlamewroughtIronBlock extends Block {

	protected FlamewroughtIronBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("FlamewroughtIronBlock");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":flamewrought_iron_block");
		this.setHardness(7f);
		this.setResistance(50f);
	}

}
