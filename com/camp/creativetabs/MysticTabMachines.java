package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.block.BlockManager;

public class MysticTabMachines extends CreativeTabs {

	public MysticTabMachines(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(BlockManager.lapisFurnaceIdle);
	}

}
