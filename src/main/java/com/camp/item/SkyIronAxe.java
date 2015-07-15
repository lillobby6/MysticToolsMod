package com.camp.item;

import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class SkyIronAxe extends ItemAxe{

	public static final String name = "SkyIronAxe";
	
	protected SkyIronAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		this.setUnlocalizedName("SkyIronAxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":sky_iron_axe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
