package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MortiumIngot extends Item{
	public MortiumIngot()
	{
		this.setUnlocalizedName("MortiumIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		this.setTextureName(StringLibrary.MODID + ":mortium_ingot");
	}
}
