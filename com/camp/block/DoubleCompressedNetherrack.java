package com.camp.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class DoubleCompressedNetherrack extends Block{

	protected DoubleCompressedNetherrack(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setBlockName("DoubleCompressedNetherrack");
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		this.setBlockTextureName(StringLibrary.MODID + ":double_compressed_netherrack");
		this.setHardness(2f);
		this.setResistance(5f);
	}
	
	public void func_77624_a(ItemStack itemStack, EntityPlayer player, List list, boolean p_77624_4_)
	{
	    list.add("81 Netherrack");
	}

}