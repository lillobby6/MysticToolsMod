package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.creativetabs.CreativeTabsManager;

public class BlockManager {
	public static void mainRegistry() {
		initializeBlock();
		//registerBlock();
	}

	public static Block compressedNetherrack;
	  public static Block doubleCompressedNetherrack;
	  public static Block lavaInfusedDiamondBlock;
	  public static Block magicBlock;
	  public static Block mysticBlock;
	  public static Block tripleCompressedNetherrack;
	  public static Block quadrupleCompressedNetherrack;
	  public static Block terriumOre;
	  public static Block skyIronOre;
	  public static Block weaklyReinforcedCobblestone;
	  public static Block reinforcedCobblestone;
	  public static Block whiteStone;
	  public static Block whiteCobblestone;
	  public static Block toslotriumOre;
	  public static Block brightflameBlock;
	  public static Block skyIronBlock;
	  public static Block toslotriumBlock;
	  public static Block terriumBlock;
	  public static Block flameWroughtIronBlock;
	  public static Block mortiumOre;
	  public static Block lapisFurnaceIdle;
	  public static Block lapisFurnaceActive;
	  public static Block mysticPortal;
	  public static Block mysticChest;
	  
	  public static Block maceratorIdle;
	  public static Block maceratorActive;
	  
	  public static Block alloyFurnaceIdle;
	  public static Block alloyFurnaceActive;
	  
	  public static Block vividiumOre;
	  
	  public static Block ironOverlayDeviceIdle;
	  public static Block ironOverlayDeviceActive;

	public static void initializeBlock() {
	/**	compressedNetherrack = new CompressedNetherrack(Material.rock);
		doubleCompressedNetherrack = new DoubleCompressedNetherrack(
				Material.rock);
		tripleCompressedNetherrack = new TripleCompressedNetherrack(
				Material.rock);
		quadrupleCompressedNetherrack = new QuadrupleCompressedNetherrack(
				Material.rock);

		weaklyReinforcedCobblestone = new WeaklyReinforcedCobblestone(
				Material.rock);
		reinforcedCobblestone = new ReinforcedCobblestone(Material.rock);

		whiteStone = new WhiteStone(Material.rock);
		whiteCobblestone = new WhiteCobblestone(Material.rock);

		lavaInfusedDiamondBlock = new LavaInfusedDiamondBlock(Material.glass);
		magicBlock = new MagicBlock(Material.iron);
		mysticBlock = new MysticBlock(Material.iron);
		brightflameBlock = new BrightflameBlock(Material.iron);
		skyIronBlock = new SkyIronBlock(Material.iron);
		toslotriumBlock = new ToslotriumBlock(Material.iron);
		terriumBlock = new TerriumBlock(Material.iron);
		flameWroughtIronBlock = new FlamewroughtIronBlock(Material.iron);

		terriumOre = new TerriumOre(Material.iron);
		skyIronOre = new SkyIronOre(Material.rock);
		toslotriumOre = new ToslotriumOre(Material.rock);
		*/
		compressedNetherrack = new CompressedNetherrack(Material.rock);
	    doubleCompressedNetherrack = new DoubleCompressedNetherrack(Material.rock);
	    lavaInfusedDiamondBlock = new LavaInfusedDiamondBlock(Material.glass);
	    magicBlock = new MagicBlock(Material.iron);
	    mysticBlock = new MysticBlock(Material.iron);
	    tripleCompressedNetherrack = new TripleCompressedNetherrack(Material.rock);
	    quadrupleCompressedNetherrack = new QuadrupleCompressedNetherrack(Material.rock);
	    terriumOre = new TerriumOre(Material.rock);
	    skyIronOre = new SkyIronOre(Material.rock);
	    weaklyReinforcedCobblestone = new WeaklyReinforcedCobblestone(Material.rock);
	    reinforcedCobblestone = new ReinforcedCobblestone(Material.rock);
	    whiteStone = new WhiteStone(Material.rock);
	    whiteCobblestone = new WhiteCobblestone(Material.rock);
	    toslotriumOre = new ToslotriumOre(Material.rock);
	    brightflameBlock = new BrightflameBlock(Material.iron);
	    skyIronBlock = new SkyIronBlock(Material.iron);
	    toslotriumBlock = new ToslotriumBlock(Material.iron);
	    terriumBlock = new TerriumBlock(Material.iron);
	    flameWroughtIronBlock = new FlamewroughtIronBlock(Material.iron);
		
		mortiumOre = new MortiumOre(Material.rock);

		/*lapisFurnaceIdle = new LapisFurnace(false)
				.setUnlocalizedName("LapisFurnaceIdle").setHardness(3.5f)
				.setCreativeTab(CreativeTabsManager.tabMysticMachines);
		lapisFurnaceActive = new LapisFurnace(true)
				.setUnlocalizedName("LapisFurnaceActive").setHardness(3.5f)
				.setLightLevel(0.9F);
		mysticPortal = new MysticPortal()
		.setUnlocalizedName("Mystic Portal");
		mysticChest = new MysticChest(0).setUnlocalizedName("MysticChest").setCreativeTab(CreativeTabsManager.tabStorage);
		
		/*maceratorIdle = new Macerator(false)
		.setUnlocalizedName("MaceratorIdle")
		.setCreativeTab(CreativeTabsManager.tabMysticMachines);
		maceratorActive = new Macerator(true)
		.setUnlocalizedName("MaceratorActive");
		
		/*alloyFurnaceIdle = new AlloyFurnace(false)
		.setUnlocalizedName("AlloyFurnaceIdle")
		.setCreativeTab(CreativeTabsManager.tabMysticMachines);
		alloyFurnaceActive = new setUnlocalizedName(true)
		.setUnlocalizedName("AlloyFurnaceActive");*/
		
		vividiumOre = new VididiumOre(Material.rock)
		.setUnlocalizedName("VividiumOre");
		
		/*ironOverlayDeviceIdle = new IronOverlayDevice(false)
		.setUnlocalizedName("IronOverlayDeviceIdle")
		.setCreativeTab(CreativeTabsManager.tabMysticMachines);
		
		ironOverlayDeviceActive = new IronOverlayDevice(true)
		.setUnlocalizedName("IronOverlayDeviceActive");*/

	}

	/*public static void registerBlock() {
		GameRegistry.registerBlock(compressedNetherrack,
				compressedNetherrack.getUnlocalizedName());
		GameRegistry.registerBlock(doubleCompressedNetherrack,
				doubleCompressedNetherrack.getUnlocalizedName());
		GameRegistry.registerBlock(lavaInfusedDiamondBlock,
				lavaInfusedDiamondBlock.getUnlocalizedName());
		GameRegistry.registerBlock(magicBlock, magicBlock.getUnlocalizedName());
		GameRegistry.registerBlock(mysticBlock, mysticBlock.getUnlocalizedName());
		GameRegistry.registerBlock(tripleCompressedNetherrack,
				tripleCompressedNetherrack.getUnlocalizedName());
		GameRegistry.registerBlock(quadrupleCompressedNetherrack,
				quadrupleCompressedNetherrack.getUnlocalizedName());
		GameRegistry.registerBlock(terriumOre, terriumOre.getUnlocalizedName());
		GameRegistry.registerBlock(skyIronOre, skyIronOre.getUnlocalizedName());
		GameRegistry.registerBlock(weaklyReinforcedCobblestone,
				weaklyReinforcedCobblestone.getUnlocalizedName());
		GameRegistry.registerBlock(reinforcedCobblestone,
				reinforcedCobblestone.getUnlocalizedName());
		GameRegistry.registerBlock(whiteStone, whiteStone.getUnlocalizedName());
		GameRegistry.registerBlock(whiteCobblestone,
				whiteCobblestone.getUnlocalizedName());
		GameRegistry
				.registerBlock(toslotriumOre, toslotriumOre.getUnlocalizedName());
		GameRegistry.registerBlock(brightflameBlock,
				brightflameBlock.getUnlocalizedName());
		GameRegistry.registerBlock(skyIronBlock, skyIronBlock.getUnlocalizedName());
		GameRegistry.registerBlock(toslotriumBlock,
				toslotriumBlock.getUnlocalizedName());
		GameRegistry.registerBlock(terriumBlock, terriumBlock.getUnlocalizedName());
		GameRegistry.registerBlock(flameWroughtIronBlock,
				flameWroughtIronBlock.getUnlocalizedName());
		GameRegistry.registerBlock(mortiumOre, mortiumOre.getUnlocalizedName());

		GameRegistry.registerBlock(lapisFurnaceIdle,
				lapisFurnaceIdle.getUnlocalizedName());
		GameRegistry.registerBlock(lapisFurnaceActive,
				lapisFurnaceActive.getUnlocalizedName());
		GameRegistry.registerBlock(mysticPortal, mysticPortal.getUnlocalizedName());
		GameRegistry.registerBlock(mysticChest, mysticChest.getUnlocalizedName());
		
		GameRegistry.registerBlock(maceratorIdle, maceratorIdle.getUnlocalizedName());
		GameRegistry.registerBlock(maceratorActive, maceratorActive.getUnlocalizedName());
		
		GameRegistry.registerBlock(alloyFurnaceIdle, alloyFurnaceIdle.getUnlocalizedName());
		GameRegistry.registerBlock(alloyFurnaceActive, alloyFurnaceActive.getUnlocalizedName());
		
		GameRegistry.registerBlock(vividiumOre, vividiumOre.getUnlocalizedName());
		
		GameRegistry.registerBlock(ironOverlayDeviceIdle, ironOverlayDeviceIdle.getUnlocalizedName());
		GameRegistry.registerBlock(ironOverlayDeviceActive, ironOverlayDeviceActive.getUnlocalizedName());
	}*/
}
