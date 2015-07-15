package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MagicNugget extends Item{
	
	public static final String name = "MagicNugget";
	
	public MagicNugget(){
		this.setUnlocalizedName("MagicNugget");
		this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
		//this.setTextureName(StringLibrary.MODID + ":magic_nugget");
		this.setMaxStackSize(32);
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
}
