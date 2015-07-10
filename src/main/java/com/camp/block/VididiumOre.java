package com.camp.block;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VididiumOre extends Block{

	protected VididiumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		//this.setBlockTextureName(StringLibrary.MODID + ":vividium_ore");
		this.setHardness(1.5f);
		this.setResistance(50);
	}

}
