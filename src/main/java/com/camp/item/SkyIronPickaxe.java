package com.camp.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class SkyIronPickaxe extends ItemPickaxe{
	
	public static final String name = "SkyIronPickaxe";

	protected SkyIronPickaxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("SkyIronPickaxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":sky_iron_pickaxe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
