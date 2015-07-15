package com.camp.item;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MortiumSword extends ItemSword{
	
	public static final String name = "MortiumSword";

	public MortiumSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
