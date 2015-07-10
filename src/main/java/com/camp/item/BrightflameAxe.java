package com.camp.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class BrightflameAxe extends ItemPickaxe{

	public static final String name = "BrightflameAxe";
	
	protected BrightflameAxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		this.setUnlocalizedName("BrightflameAxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":brightflame_axe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
