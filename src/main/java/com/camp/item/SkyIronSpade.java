package com.camp.item;

import net.minecraft.item.ItemSpade;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class SkyIronSpade extends ItemSpade{

	public SkyIronSpade(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("SkyIronSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":sky_iron_shovel");
	}

}
