package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class VividiumIngot extends Item {
	
	public static final String name = "VividiumIngot";
	
	public VividiumIngot()
	{

		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		this.setUnlocalizedName("VividiumIngot");
		//this.setTextureName(StringLibrary.MODID + ":vividium_ingot");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
}
