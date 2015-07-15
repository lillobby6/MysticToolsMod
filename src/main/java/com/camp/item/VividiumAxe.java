package com.camp.item;

import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class VividiumAxe extends ItemAxe {

	public static final String name = "VividiumAxe";

	protected VividiumAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
