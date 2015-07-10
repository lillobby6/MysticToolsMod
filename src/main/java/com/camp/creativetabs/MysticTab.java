package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class MysticTab extends CreativeTabs{

	public MysticTab(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}
	  @Override
	    public Item getTabIconItem() {
	        // TODO Auto-generated method stub
	        return Item.getItemFromBlock(Blocks.stone);//ItemManager.mysticIngot;
	    }


}