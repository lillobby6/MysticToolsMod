package com.camp.item;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class VividiumHoe extends ItemHoe {
	
	public static final String name = "VividiumHoe";

	public VividiumHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
