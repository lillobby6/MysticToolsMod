package com.camp.item;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class SkyIronHoe extends ItemHoe{
	
	public static final String name = "SkyIronHoe";

	public SkyIronHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setUnlocalizedName("SkyIronHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":sky_iron_hoe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
