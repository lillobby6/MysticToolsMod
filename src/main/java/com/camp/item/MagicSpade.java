package com.camp.item;

import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MagicSpade extends ItemSpade{
	
	public static final String name = "MagicSpade";

	public MagicSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.setUnlocalizedName("MagicSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":magic_shovel");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
