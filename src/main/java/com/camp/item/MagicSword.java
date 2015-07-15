package com.camp.item;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MagicSword extends ItemSword{
	
	public static final String name = "MagicSword";

	public MagicSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("MagicSword");
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		//this.setTextureName(StringLibrary.MODID + ":magic_sword");
		GameRegistry.registerItem(this, name);
	}
	
	public String getName()
	{
		return name;
	}

}
