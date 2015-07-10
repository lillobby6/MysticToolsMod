package com.camp.item;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class BrightflameSword extends ItemSword{

	public static final String name = "BrightflameSword";
	
	public String getName()
	{
		return name;
	}
	
	public BrightflameSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("BrightflameSword");
		this.setCreativeTab(CreativeTabsManager.tabMysticCombat);
		//this.setTextureName(StringLibrary.MODID + ":brightflame_sword");
		GameRegistry.registerItem(this, name);

	}

}
