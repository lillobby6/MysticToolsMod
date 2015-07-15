package com.camp.item;

import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MortiumAxe extends ItemAxe{
	
	public static final String name = "MortiumAxe";

	protected MortiumAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
