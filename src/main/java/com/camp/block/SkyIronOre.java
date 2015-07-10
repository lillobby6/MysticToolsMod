package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class SkyIronOre extends Block{

	protected SkyIronOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("SkyIronOre");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		//this.setBlockTextureName(StringLibrary.MODID + ":sky_iron_ore");
		this.setHardness(0.8f);
		this.setResistance(4f);
		this.setHarvestLevel("pickaxe", 1);
	}
	
		
}
