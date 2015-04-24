package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MysticSpade extends ItemSpade{

	public MysticSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("MysticSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":mystic_shovel");
	}

}
