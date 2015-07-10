package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class FlameWroughtIronIngot extends Item{
	
	public static final String name = "FlameWroughtIronIngot";
	
	public FlameWroughtIronIngot(){
		this.setUnlocalizedName("FlameWroughtIronIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":flamewrought_iron_ingot");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
}