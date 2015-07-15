package com.camp.item;

import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MysticSpade extends ItemSpade{
	
	public static final String name = "MysticSpade";

	public MysticSpade(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("MysticSpade");
		this.setCreativeTab(CreativeTabsManager.tabMysticTools);
		//this.setTextureName(StringLibrary.MODID + ":mystic_shovel");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
