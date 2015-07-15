package com.camp.item;

import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class LavaInfusedDiamondAxe extends ItemAxe{
	
	public static final String name = "LavaInfusedDiamondAxe";

	protected LavaInfusedDiamondAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("LavaInfusedDiamondAxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_axe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
