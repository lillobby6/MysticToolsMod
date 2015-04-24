package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

import net.minecraft.item.Item;

public class VividiumIngot extends Item {
	public VividiumIngot()
	{
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		this.setUnlocalizedName("VividiumIngot");
		this.setTextureName(StringLibrary.MODID + ":vividium_ingot");
	}
}
