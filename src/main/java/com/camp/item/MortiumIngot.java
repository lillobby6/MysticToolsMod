package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MortiumIngot extends Item{
	
	public static final String name = "MortiumIngot";
	
	public MortiumIngot()
	{
		this.setUnlocalizedName("MortiumIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":mortium_ingot");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
}
