package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class WhiteCobblestone extends Block{

	protected WhiteCobblestone(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("WhiteCobblestone");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":white_cobblestone");
		/**Also XMas edition :white_cobblestone_xmas**/
		this.setResistance(30.0f);
		this.setHardness(1.5f);
		this.setHarvestLevel("pickaxe", 0);
	}
	
}
