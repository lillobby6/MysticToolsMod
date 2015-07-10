package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class WhiteStone extends Block {
/**A simple block 
 * to spawn in 
 * the world*/
	protected WhiteStone(Material material) {
		super(material);

		this.setUnlocalizedName("WhiteStone");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		//this.setBlockTextureName(StringLibrary.MODID + ":white_stone");
		this.setResistance(30.0f);
		this.setHardness(1.0f);
		this.setHarvestLevel("pickaxe", 0);
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(BlockManager.whiteCobblestone);
    }
}
