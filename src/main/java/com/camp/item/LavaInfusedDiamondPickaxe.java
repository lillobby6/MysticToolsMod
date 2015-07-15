package com.camp.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class LavaInfusedDiamondPickaxe extends ItemPickaxe{
	
	public static final String name = "LavaInfusedDiamondPickaxe";

	protected LavaInfusedDiamondPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("LavaInfusedDiamondPickaxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_pickaxe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
