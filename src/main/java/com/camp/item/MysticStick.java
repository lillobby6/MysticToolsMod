package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MysticStick extends Item {
		public MysticStick(){
			this.setUnlocalizedName("MysticStick");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			this.setTextureName(StringLibrary.MODID + ":mystic_stick");
		}
}
