package com.camp.main;

import net.minecraft.world.WorldType;

import com.camp.biome.BiomeRegistry;
//import com.camp.biome.WorldTypeMystic;
import com.camp.block.BlockManager;
import com.camp.creativetabs.CreativeTabsManager;
import com.camp.enchantments.EnchantmentManager;
import com.camp.entity.EntityManager;
import com.camp.gui.GuiHandler;
import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;
import com.camp.oreDictionary.OreDictionaryRegistry;
import com.camp.packet.PacketPipeline;
import com.camp.proxy.CommonProxy;
import com.camp.recipe.RecipeManager;
import com.camp.tileEntity.TileEntityAlloyFurnace;
import com.camp.tileEntity.TileEntityLapisFurnace;
import com.camp.tileEntity.TileEntityMacerator;
import com.camp.tileEntity.TileEntityMysticChest;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
//For The Version Its MAINVERSION#.STABLEVERSION#.VERSION#
@Mod(modid = StringLibrary.MODID, name = StringLibrary.name, version = StringLibrary.version)
//as of 12/27/2014 Saturday, 10:43 AM This Mod Entered Testing Stage For v1.0!!!
//Backpack time! There's probably some data-miner out there reading this :) Keep mining :)

//REMINDER: CHECK THIS OUT http://www.minecraftforum.net/forums/mapping-and-modding/mapping-and-modding-tutorials/2326780-have-your-mod-check-for-newer-version-and-notify
//@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MainRegistry{
	
	@SidedProxy(clientSide = "com.camp.proxy.ClientProxy", serverSide = "com.camp.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
    /**
    * Loads before
    * @param PreEvent
    */
	 @Instance(StringLibrary.MODID)
	    public static MainRegistry instance;
	 public static final int guiIdLapisFurnace = 0;
	 public static final PacketPipeline packetPipeline = new PacketPipeline();
	 
	 
	
	 
    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent) {
    	
    	
    	
    	CreativeTabsManager.mainRegistry();
    	
    	BlockManager.mainRegistry();
    	
    	ItemManager.mainRegistry();
    	
    	EntityManager.mainRegistry();
    	
    	RecipeManager.mainRegistry();
    	
    	BiomeRegistry.MainRegistry();
    	
    	EnchantmentManager.mainRegistry();
    	
    	OreDictionaryRegistry.mainRegistry();
    	
    	LanguageRegistry.instance().addStringLocalization("container.lapisFurnace", "Lapis Furnace");
    	
    	GameRegistry.registerTileEntity(TileEntityLapisFurnace.class, "LapisFurnace");
    	GameRegistry.registerTileEntity(TileEntityMysticChest.class, "MysticChest");
    	GameRegistry.registerTileEntity(TileEntityMacerator.class, "MaceratorMystic");
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");
    	
    	GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
    	
    	GuiHandler guiHandler = new GuiHandler();
    	proxy.registerRenderThings();
    	
    	
    }
 
    /**
    * Loads during
    * @param Event
    */
    @Mod.EventHandler
    public static void Load(FMLInitializationEvent Event) {   
    	packetPipeline.initalize();
    }   
 
    /**
    * Loads after
    * @param PostEvent
    */
    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent) {
    	packetPipeline.postInitialize();
    	
    	//WorldType MYSTIC = new WorldTypeMystic(3, "Mystic");
    }
}
