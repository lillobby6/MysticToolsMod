package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class ToslotriumIngot extends Item{
		public ToslotriumIngot(){
			this.setUnlocalizedName("ToslotriumIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			this.setTextureName(StringLibrary.MODID + ":toslotrium_ingot");
		}
}
