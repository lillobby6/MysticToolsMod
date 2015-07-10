package com.camp.creativetabs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.camp.block.BlockManager;

public class MysticTabBlocks extends CreativeTabs {

	public MysticTabBlocks(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(Blocks.stone);//Item.getItemFromBlock(BlockManager.mysticBlock);
	}

}