package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class ToslotriumBlock extends Block {

	protected ToslotriumBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setUnlocalizedName("ToslotriumBlock");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		//this.setBlockTextureName(StringLibrary.MODID + ":toslotrium_block");
	}

}
