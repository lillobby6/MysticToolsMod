package com.camp.item;

import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class VividiumSpade extends ItemSpade {
	
	public static final String name = "VividiumSpade";

	public VividiumSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		GameRegistry.registerItem(this, name);
	}

	public String getName()
	{
		return name;
	}
	
}
