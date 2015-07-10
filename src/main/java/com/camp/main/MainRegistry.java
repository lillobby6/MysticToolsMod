package com.camp.main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.camp.biome.BiomeRegistry;
import com.camp.biome.WorldTypeMystic;
import com.camp.block.BlockManager;
import com.camp.creativetabs.CreativeTabsManager;
import com.camp.enchantments.EnchantmentManager;
import com.camp.entity.EntityManager;
import com.camp.item.BrightflameApple;
import com.camp.item.BrightflameAxe;
import com.camp.item.BrightflameHoe;
import com.camp.item.BrightflameIngot;
import com.camp.item.BrightflamePickaxe;
import com.camp.item.BrightflameSpade;
import com.camp.item.BrightflameSword;
import com.camp.item.BrightsteelIngot;
import com.camp.item.DiamondStick;
import com.camp.item.FlameWroughtGoldIngot;
import com.camp.item.FlameWroughtIronIngot;
import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;
import com.camp.packet.PacketPipeline;
import com.camp.proxy.CommonProxy;
import com.camp.tileEntity.TileEntityAlloyFurnace;
import com.camp.tileEntity.TileEntityIronOverlayDevice;
import com.camp.tileEntity.TileEntityLapisFurnace;
import com.camp.tileEntity.TileEntityMacerator;
import com.camp.tileEntity.TileEntityMysticChest;
//import com.camp.biome.WorldTypeMystic;
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
    	
    	
    	BiomeRegistry.MainRegistry();
    	
    	EnchantmentManager.mainRegistry();
    	
    	//OreDictionaryRegistry.mainRegistry();
    	
    	LanguageRegistry.instance().addStringLocalization("container.lapisFurnace", "Lapis Furnace");
    	
    	GameRegistry.registerTileEntity(TileEntityLapisFurnace.class, "LapisFurnace");
    	GameRegistry.registerTileEntity(TileEntityMysticChest.class, "MysticChest");
    	GameRegistry.registerTileEntity(TileEntityMacerator.class, "MaceratorMystic");
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");
    	GameRegistry.registerTileEntity(TileEntityIronOverlayDevice.class, "IronOverlayDevice");
    	
    	//GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
    	
    	Gui guiHandler = new Gui();
    	proxy.registerRenderThings();
    	
    	
    }
 
    /**
    * Loads during
    * @param Event
    */
    @Mod.EventHandler
    public static void Load(FMLInitializationEvent Event) {   
    	packetPipeline.initalize();
    //	RecipeManager.mainRegistry();
    
    	if(Event.getSide() == Side.CLIENT)
    	{
    	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	    	
    	    	renderItem.getItemModelMesher().register(ItemManager.brightflameApple, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ( (BrightflameApple) ItemManager.brightflameApple).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.brightflameIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((BrightflameIngot) ItemManager.brightflameIngot).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.brightflameAxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((BrightflameAxe) ItemManager.brightflameAxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.brightflameHoe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((BrightflameHoe) ItemManager.brightflameHoe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.brightflamePickaxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((BrightflamePickaxe) ItemManager.brightflamePickaxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.brightflameSpade, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((BrightflameSpade) ItemManager.brightflameSpade).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.brightflameSword, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((BrightflameSword) ItemManager.brightflameSword).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.brightsteelIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((BrightsteelIngot) ItemManager.brightsteelIngot).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.diamondStick, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((DiamondStick) ItemManager.diamondStick).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.flameWroughtIronIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((FlameWroughtIronIngot) ItemManager.flameWroughtIronIngot).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.flameWroughtGoldIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((FlameWroughtGoldIngot) ItemManager.flameWroughtGoldIngot).getName(), "inventory"));

    	}
    }   
 
    /**
    * Loads after
    * @param PostEvent
    */
    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent) {
    	packetPipeline.postInitialize();
    	
    	WorldType MYSTIC = new WorldTypeMystic(3, "Mystic");
    }
}
