package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class FlameWroughtGoldIngot extends Item{
	
	public static final String name = "FlameWroughtGoldIngot";
	
	public FlameWroughtGoldIngot(){
		this.setUnlocalizedName("FlameWroughtGoldIngot");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":flamewrought_gold_ingot");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
