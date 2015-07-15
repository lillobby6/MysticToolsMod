package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MagicAxe extends ItemAxe{
	
	public static final String name = "MagicAxe";

	protected MagicAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		this.setUnlocalizedName("MagicAxe");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":magic_axe");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
