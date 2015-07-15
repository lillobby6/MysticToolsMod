package com.camp.item;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MortiumHoe extends ItemHoe{
	
	public static final String name = "MortiumHoe";

	public MortiumHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
