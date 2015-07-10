package com.camp.item;

import net.minecraft.item.ItemPickaxe;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class SkyIronPickaxe extends ItemPickaxe{

	protected SkyIronPickaxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("SkyIronPickaxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":sky_iron_pickaxe");
	}

}
