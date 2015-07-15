package com.camp.item;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class TerriumSword extends ItemSword {
	
	public static final String name = "TerriumSword";

	public TerriumSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("TerriumSword");
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		//this.setTextureName(StringLibrary.MODID + ":terrium_sword");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
