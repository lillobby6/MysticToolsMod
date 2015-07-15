package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MysticIngot extends Item{
	
	public static final String name = "MysticIngot";
	
	public MysticIngot(){
		this.setUnlocalizedName("MysticIngot");
	    this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
	    //this.setTextureName(StringLibrary.MODID + ":mystic_ingot");
	    this.setMaxStackSize(48);
	    GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
}
