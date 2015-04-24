package com.camp.item;

import net.minecraft.item.ItemSpade;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class TerriumSpade extends ItemSpade{

	public TerriumSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("TerriumSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		this.setTextureName(StringLibrary.MODID + ":terrium_shovel");
	}

}
