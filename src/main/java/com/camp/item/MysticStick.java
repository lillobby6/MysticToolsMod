package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class MysticStick extends Item {
	
	public static final String name = "MysticStick";
	
		public MysticStick(){
			this.setUnlocalizedName("MysticStick");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":mystic_stick");
			GameRegistry.registerItem(this, name);
		}
		
	public String getName()
	{
		return name;
	}
}
