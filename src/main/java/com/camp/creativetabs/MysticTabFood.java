package com.camp.creativetabs;

import com.camp.item.ItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MysticTabFood extends CreativeTabs {

	public MysticTabFood(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ItemManager.mysticApple;
	}

}
