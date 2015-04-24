package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MagicNugget extends Item{
	public MagicNugget(){
		this.setUnlocalizedName("MagicNugget");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		this.setTextureName(StringLibrary.MODID + ":magic_nugget");
		this.setMaxStackSize(32);
	}
}
