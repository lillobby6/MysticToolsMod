package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class ToslotriumOre extends Block{

	protected ToslotriumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("ToslotriumOre");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":toslotrium_ore");
		this.setHardness(1f);
		this.setResistance(5f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
