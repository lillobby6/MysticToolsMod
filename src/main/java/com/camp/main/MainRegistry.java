package com.camp.main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
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
import com.camp.block.BrightflameBlock;
import com.camp.creativetabs.CreativeTabsManager;
import com.camp.enchantments.EnchantmentManager;
import com.camp.item.BrightflameApple;
import com.camp.item.BrightflameArmor;
import com.camp.item.BrightflameAxe;
import com.camp.item.BrightflameHoe;
import com.camp.item.BrightflameIngot;
import com.camp.item.BrightflamePickaxe;
import com.camp.item.BrightflameSpade;
import com.camp.item.BrightflameSword;
import com.camp.item.BrightsteelIngot;
import com.camp.item.Corruption;
import com.camp.item.DiamondStick;
import com.camp.item.FlameWroughtGoldIngot;
import com.camp.item.FlameWroughtIronIngot;
import com.camp.item.GoldenStick;
import com.camp.item.ItemManager;
import com.camp.item.Justice;
import com.camp.item.LavaInfusedDiamond;
import com.camp.item.LavaInfusedDiamondAxe;
import com.camp.item.LavaInfusedDiamondHoe;
import com.camp.item.LavaInfusedDiamondPickaxe;
import com.camp.item.LavaInfusedDiamondSpade;
import com.camp.item.MagicAxe;
import com.camp.item.MagicHoe;
import com.camp.item.MagicIngot;
import com.camp.item.MagicNugget;
import com.camp.item.MagicPickaxe;
import com.camp.item.MagicSpade;
import com.camp.item.MagicSword;
import com.camp.item.MithrilIngot;
import com.camp.item.MixedIngot;
import com.camp.item.MortiumAxe;
import com.camp.item.MortiumHoe;
import com.camp.item.MortiumIngot;
import com.camp.item.MortiumPickaxe;
import com.camp.item.MortiumSpade;
import com.camp.item.MortiumSword;
import com.camp.item.MysteriousApple;
import com.camp.item.MysteriousIngot;
import com.camp.item.MysticApple;
import com.camp.item.MysticAxe;
import com.camp.item.MysticHoe;
import com.camp.item.MysticIngot;
import com.camp.item.MysticPickaxe;
import com.camp.item.MysticSpade;
import com.camp.item.MysticStick;
import com.camp.item.MysticSword;
import com.camp.item.SkyIronAxe;
import com.camp.item.SkyIronHoe;
import com.camp.item.SkyIronIngot;
import com.camp.item.SkyIronPickaxe;
import com.camp.item.SkyIronSpade;
import com.camp.item.SkyIronSword;
import com.camp.item.TerriumAxe;
import com.camp.item.TerriumHoe;
import com.camp.item.TerriumIngot;
import com.camp.item.TerriumPickaxe;
import com.camp.item.TerriumSpade;
import com.camp.item.TerriumSword;
import com.camp.item.ToslotriumIngot;
import com.camp.item.VividiumAxe;
import com.camp.item.VividiumHoe;
import com.camp.item.VividiumIngot;
import com.camp.item.VividiumPickaxe;
import com.camp.item.VividiumSpade;
import com.camp.item.VividiumSword;
import com.camp.lib.ArmorMaterials;
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
	 
	 public static Item brightflameHelmet;
	 
	 
	
	 
    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent) {
    	
    	
    	
    	CreativeTabsManager.mainRegistry();
    	
    	BlockManager.mainRegistry();
    	
    	ItemManager.mainRegistry();
    	
    	//EntityManager.mainRegistry();
    	
    	
    	BiomeRegistry.MainRegistry();
    	
    	EnchantmentManager.mainRegistry();
    	
    	//OreDictionaryRegistry.mainRegistry();
    	
    	LanguageRegistry.instance().addStringLocalization("container.lapisFurnace", "Lapis Furnace");
    	
    	GameRegistry.registerTileEntity(TileEntityLapisFurnace.class, "LapisFurnace");
    	GameRegistry.registerTileEntity(TileEntityMysticChest.class, "MysticChest");
    	GameRegistry.registerTileEntity(TileEntityMacerator.class, "MaceratorMystic");
    	GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "AlloyFurnace");
    	GameRegistry.registerTileEntity(TileEntityIronOverlayDevice.class, "IronOverlayDevice");
    	
    	GameRegistry.registerItem(brightflameHelmet = new BrightflameArmor("brightflame_helmet", ArmorMaterials.MAGICARMOR, 1, 0), "BrightflameHelmet");
    	
    	
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
    	    	
    	    	renderItem.getItemModelMesher().register(ItemManager.justice, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((Justice) ItemManager.justice).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.corruption, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((Corruption) ItemManager.corruption).getName(), "inventory"));
    	    	
    	    	renderItem.getItemModelMesher().register(ItemManager.goldenStick, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((GoldenStick) ItemManager.goldenStick).getName(), "inventory"));
    	    	
    	    	renderItem.getItemModelMesher().register(ItemManager.lavaInfusedDiamond, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((LavaInfusedDiamond) ItemManager.lavaInfusedDiamond).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.lavaInfusedDiamondAxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((LavaInfusedDiamondAxe) ItemManager.lavaInfusedDiamondAxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.lavaInfusedDiamondSpade, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((LavaInfusedDiamondSpade) ItemManager.lavaInfusedDiamondSpade).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.lavaInfusedDiamondPickaxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((LavaInfusedDiamondPickaxe) ItemManager.lavaInfusedDiamondPickaxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.lavaInfusedDiamondHoe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((LavaInfusedDiamondHoe) ItemManager.lavaInfusedDiamondHoe).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(ItemManager.magicAxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MagicAxe) ItemManager.magicAxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.magicHoe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MagicHoe) ItemManager.magicHoe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.magicIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MagicIngot) ItemManager.magicIngot).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.magicNugget, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MagicNugget) ItemManager.magicNugget).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.magicPickaxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MagicPickaxe) ItemManager.magicPickaxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.magicSpade, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MagicSpade) ItemManager.magicSpade).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.magicSword, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MagicSword) ItemManager.magicSword).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(ItemManager.mithrilIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MithrilIngot) ItemManager.mithrilIngot).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(ItemManager.mixedIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MixedIngot) ItemManager.mixedIngot).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockManager.brightflameBlock), 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((BrightflameBlock) BlockManager.brightflameBlock).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(ItemManager.mortiumIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MortiumIngot) ItemManager.mortiumIngot).getName(), "inventory"));
    	    	
    	    	renderItem.getItemModelMesher().register(ItemManager.mysteriousApple, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysteriousApple) ItemManager.mysteriousApple).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mysteriousIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysteriousIngot) ItemManager.mysteriousIngot).getName(), "inventory"));
    	    	
    	    	renderItem.getItemModelMesher().register(ItemManager.mysticApple, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysticApple) ItemManager.mysticApple).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mysticAxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysticAxe) ItemManager.mysticAxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mysticHoe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysticHoe) ItemManager.mysticHoe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mysticIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysticIngot) ItemManager.mysticIngot).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mysticPickaxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysticPickaxe) ItemManager.mysticPickaxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mysticStick, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysticStick) ItemManager.mysticStick).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mysticSword, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysticSword) ItemManager.mysticSword).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mysticSpade, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MysticSpade) ItemManager.mysticSpade).getName(), "inventory"));

    	    	
    	    	
    	    	renderItem.getItemModelMesher().register(ItemManager.skyIronAxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((SkyIronAxe) ItemManager.skyIronAxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.skyIronHoe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((SkyIronHoe) ItemManager.skyIronHoe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.skyIronIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((SkyIronIngot) ItemManager.skyIronIngot).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.skyIronPickaxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((SkyIronPickaxe) ItemManager.skyIronPickaxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.skyIronSpade, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((SkyIronSpade) ItemManager.skyIronSpade).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.skyIronSword, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((SkyIronSword) ItemManager.skyIronSword).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(ItemManager.terriumAxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((TerriumAxe) ItemManager.terriumAxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.terriumHoe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((TerriumHoe) ItemManager.terriumHoe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.terriumIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((TerriumIngot) ItemManager.terriumIngot).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.terriumPickaxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((TerriumPickaxe) ItemManager.terriumPickaxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.terriumSpade, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((TerriumSpade) ItemManager.terriumSpade).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.terriumSword, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((TerriumSword) ItemManager.terriumSword).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(ItemManager.toslotriumIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((ToslotriumIngot) ItemManager.toslotriumIngot).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(ItemManager.vividiumAxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((VividiumAxe) ItemManager.vividiumAxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.vividiumHoe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((VividiumHoe) ItemManager.vividiumHoe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.vividiumIngot, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((VividiumIngot) ItemManager.vividiumIngot).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.vividiumPickaxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((VividiumPickaxe) ItemManager.vividiumPickaxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.vividiumSpade, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((VividiumSpade) ItemManager.vividiumSpade).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.vividiumSword, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((VividiumSword) ItemManager.vividiumSword).getName(), "inventory"));

    	    	renderItem.getItemModelMesher().register(ItemManager.mortiumAxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MortiumAxe) ItemManager.mortiumAxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mortiumHoe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MortiumHoe) ItemManager.mortiumHoe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mortiumPickaxe, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MortiumPickaxe) ItemManager.mortiumPickaxe).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mortiumSpade, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MortiumSpade) ItemManager.mortiumSpade).getName(), "inventory"));
    	    	renderItem.getItemModelMesher().register(ItemManager.mortiumSword, 0, new ModelResourceLocation(StringLibrary.MODID + ":" + ((MortiumSword) ItemManager.mortiumSword).getName(), "inventory"));

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
