package com.camp.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class ToslotriumIngot extends Item{
	
	public static final String name = "ToslotriumIngot";
	
		public ToslotriumIngot(){
			this.setUnlocalizedName("ToslotriumIngot");
			this.setCreativeTab(CreativeTabsManager.tabMysticMaterials);
			//this.setTextureName(StringLibrary.MODID + ":toslotrium_ingot");
			GameRegistry.registerItem(this, name);
		}
		
	public String getName()
	{
		return name;
	}
		
}
