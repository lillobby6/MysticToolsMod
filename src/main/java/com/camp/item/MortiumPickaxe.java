package com.camp.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MortiumPickaxe extends ItemPickaxe{
	
	public static final String name = "MortiumPickaxe";

	protected MortiumPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
