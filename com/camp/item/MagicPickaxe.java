package com.camp.item;

import net.minecraft.item.ItemPickaxe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MagicPickaxe extends ItemPickaxe{

	protected MagicPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("MagicPickaxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":magic_pickaxe");
	}

}
