package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

public class MysticTabStorage extends CreativeTabs {

	public MysticTabStorage(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(Blocks.stone);//Item.getItemFromBlock(BlockManager.mysticChest);
	}

}
