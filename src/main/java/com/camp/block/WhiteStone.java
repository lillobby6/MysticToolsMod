package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class WhiteStone extends Block {
/**A simple block 
 * to spawn in 
 * the world*/
	protected WhiteStone(Material material) {
		super(material);

		this.setBlockName("WhiteStone");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":white_stone");
		this.setResistance(30.0f);
		this.setHardness(1.0f);
		this.setHarvestLevel("pickaxe", 0);
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}

	@Override
	public Item getItemDropped(int int1, Random rand,
			int int2) {
		return Item.getItemFromBlock(BlockManager.whiteCobblestone);
	}
}
