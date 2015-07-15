package com.camp.item;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MagicHoe extends ItemHoe{
	
	public static final String name = "MagicHoe";

	public MagicHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setUnlocalizedName("MagicHoe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":magic_hoe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}
			

}
