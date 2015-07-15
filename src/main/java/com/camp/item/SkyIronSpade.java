package com.camp.item;

import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class SkyIronSpade extends ItemSpade{
	
	public static final String name = "SkyIronSpade";

	public SkyIronSpade(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("SkyIronSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":sky_iron_shovel");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
