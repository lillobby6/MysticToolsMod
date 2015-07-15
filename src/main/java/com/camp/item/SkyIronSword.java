package com.camp.item;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class SkyIronSword extends ItemSword{
	
	public static final String name = "SkyIronSword";

	public SkyIronSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("SkyIronSword");
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		//this.setTextureName(StringLibrary.MODID + ":sky_iron_sword");
		GameRegistry.registerItem(this, name);
	}

	public String getName()
	{
		return name;
	}
	
}
