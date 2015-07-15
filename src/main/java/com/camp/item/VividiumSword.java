package com.camp.item;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class VividiumSword extends ItemSword {
	
	public static final String name = "VividiumSword";

	public VividiumSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
