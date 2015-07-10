package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class TerriumOre extends Block{

	protected TerriumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	
		this.setUnlocalizedName("TerriumOre");
		this.setHardness(0.5f);
		this.setResistance(5f);
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		//this.setBlockTextureName(StringLibrary.MODID + ":terrium_ore");
		this.setHarvestLevel("pickaxe", 4);
		this.setStepSound(Block.soundTypeStone);
}


}