package com.camp.item;

import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class LavaInfusedDiamondSpade extends ItemSpade{
	
	public static final String name = "LavaInfusedDiamondSpade";

	public LavaInfusedDiamondSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("LavaInfusedDiamondSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_shovel");
		GameRegistry.registerItem(this, name);
		
	}
	
	public String getName()
	{
		return name;
	}

}
