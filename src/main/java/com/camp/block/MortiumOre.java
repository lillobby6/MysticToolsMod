package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MortiumOre extends Block {

	protected MortiumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("MortiumOre");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":mortium_ore");
		this.setHardness(1.5f);
		this.setResistance(50);
	}

}
