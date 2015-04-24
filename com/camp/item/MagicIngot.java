package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MagicIngot extends Item{
 public MagicIngot(){
	 this.setUnlocalizedName("MagicIngot");
	 this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
	 this.setTextureName(StringLibrary.MODID + ":magic_ingot");
	 this.setMaxStackSize(16);
 }
}
