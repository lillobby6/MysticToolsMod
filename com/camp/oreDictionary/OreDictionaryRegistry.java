package com.camp.oreDictionary;

import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

public class OreDictionaryRegistry {
	
	public static void mainRegistry()
	{
		oreRegistration();
	}
	

	public static void oreRegistration()
	{
	        OreDictionary.registerOre("ingotBrightflame", ItemManager.brightflameIngot);
	        OreDictionary.registerOre("ingotBrightsteel", ItemManager.brightsteelIngot);
	        OreDictionary.registerOre("gemLavaInfused", ItemManager.lavaInfusedDiamond);
	        OreDictionary.registerOre("ingotMagic", ItemManager.magicIngot);
	        OreDictionary.registerOre("ingotMithril", ItemManager.mithrilIngot);
	        OreDictionary.registerOre("ingotMixed", ItemManager.mixedIngot);
	        OreDictionary.registerOre("ingotMortium", ItemManager.mortiumIngot);
	        OreDictionary.registerOre("ingotMysterious", ItemManager.mysteriousIngot);
	        OreDictionary.registerOre("ingotMystic", ItemManager.mysticIngot);
	        OreDictionary.registerOre("ingotSkyIron", ItemManager.skyIronIngot);
	        OreDictionary.registerOre("ingotTerrium", ItemManager.terriumIngot);
	        OreDictionary.registerOre("ingotToslotrium", ItemManager.toslotriumIngot);
	        OreDictionary.registerOre("ingotVividium", ItemManager.vividiumIngot);

	        OreDictionary.registerOre("oreMortium", BlockManager.mortiumOre);
	        OreDictionary.registerOre("oreSkyIron", BlockManager.skyIronOre);
	        OreDictionary.registerOre("oreTerrium", BlockManager.terriumOre);
	        OreDictionary.registerOre("oreToslotrium", BlockManager.toslotriumOre);
	        OreDictionary.registerOre("oreVividium", BlockManager.vividiumOre);
	        
	        OreDictionary.registerOre("blockBrightflame", BlockManager.brightflameBlock);
	        OreDictionary.registerOre("blockSteel", BlockManager.flameWroughtIronBlock);
	        OreDictionary.registerOre("blockLavaInfusedDiamond", BlockManager.lavaInfusedDiamondBlock);
	        OreDictionary.registerOre("blockMagic", BlockManager.magicBlock);
	        OreDictionary.registerOre("blockMystic", BlockManager.mysticBlock);
	        OreDictionary.registerOre("blockSkyIron", BlockManager.skyIronBlock);
	        OreDictionary.registerOre("blockTerrium", BlockManager.terriumBlock);
	        OreDictionary.registerOre("blockToslotrium", BlockManager.toslotriumBlock);
	        
	        OreDictionary.registerOre("cobblestone", BlockManager.whiteCobblestone);
	        OreDictionary.registerOre("stone", BlockManager.whiteStone);










	}
}

