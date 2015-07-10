package com.camp.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

public class RecipeManager {
	public static void mainRegistry(){
        addCraftingRecipes();
        addSmeltingRecipes();
 
    }//end mainRegistry
  
 
    public static void addCraftingRecipes() {
    	//Shaped Recipe Start
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticApple),
    	"xxx",
    	"xyx",
    	"xxx", 'x', Items.diamond, 'y', Items.golden_apple);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamond, 2),
    	"xxx",
    	"xyx",
    	"xxx", 'x', Items.diamond, 'y', Items.lava_bucket);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.goldenStick, 4),
    	" x ",
    	" x ", 'x', Items.gold_ingot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.diamondStick, 4),
    	" x ",
    	" x ", 'x', Items.diamond);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondPickaxe),
    	"xxx",
    	" y ",
    	" y ", 'x', ItemManager.lavaInfusedDiamond, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondAxe),
    	"xx ",
    	"xy ",
    	" y ", 'x', ItemManager.lavaInfusedDiamond, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondSpade),
    	" x ",
    	" y ",
    	" y ", 'x', ItemManager.lavaInfusedDiamond, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicIngot),
    	"xxx",
    	"xyx",
    	"xxx", 'x', ItemManager.mysticIngot, 'y', ItemManager.lavaInfusedDiamond);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticPickaxe),
    	"xxx",
    	" y ",
    	" y ", 'x', ItemManager.mysticIngot, 'y', ItemManager.diamondStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticAxe),
    	"xx ",
    	"xy ",
    	" y ", 'x', ItemManager.mysticIngot, 'y', ItemManager.diamondStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticHoe),
    	"xx ",
    	" y ",
    	" y ", 'x', ItemManager.mysticIngot, 'y', ItemManager.diamondStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameApple),
    	"xxx",
    	"xyx",
    	"xxx", 'x', ItemManager.lavaInfusedDiamond, 'y', ItemManager.mysticApple);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysteriousApple),
    	"xxx",
    	"xyx",
    	"xxx", 'x', ItemManager.mysticIngot, 'y', ItemManager.brightflameApple);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mixedIngot),
    	"xyy",
    	"xyz",
    	"xzz", 'x', ItemManager.mysteriousIngot, 'y', ItemManager.magicIngot, 'z', ItemManager.mysticIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondHelmet),
    	"xxx",
    	"x x", 'x', ItemManager.lavaInfusedDiamond);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondChestplate),
    	"x x",
    	"xxx",
    	"xxx", 'x', ItemManager.lavaInfusedDiamond);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondLeggings),
    	"xxx",
    	"x x",
    	"x x", 'x', ItemManager.lavaInfusedDiamond);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondBoots),
    	"x x",
    	"x x", 'x', ItemManager.lavaInfusedDiamond);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumHelmet),
    	"xxx",
    	"x x", 'x', ItemManager.terriumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumChestplate),
    	"x x",
    	"xxx",
    	"xxx", 'x', ItemManager.terriumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumLeggings),
    	"xxx",
    	"x x",
    	"x x", 'x', ItemManager.terriumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumBoots),
    	"x x",
    	"x x", 'x', ItemManager.terriumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumPickaxe),
    	"xxx",
    	" y ",
    	" y ", 'x', ItemManager.terriumIngot, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumAxe),
    	"xx ",
    	"xy ",
    	" y ", 'x', ItemManager.terriumIngot, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumSpade),
    	" x ",
    	" y ",
    	" y ", 'x', ItemManager.terriumIngot, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumHoe),
    	"xx ",
    	" y ",
    	" y ", 'x', ItemManager.terriumIngot, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.terriumSword),
    	" x ",
    	" x ",
    	" y ", 'x', ItemManager.terriumIngot, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticHelmet),
    	"xxx",
    	"x x", 'x', ItemManager.mysticIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticChestplate),
    	"x x",
    	"xxx",
    	"xxx", 'x', ItemManager.mysticIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticLeggings),
    	"xxx",
    	"x x",
    	"x x", 'x', ItemManager.mysticIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticBoots),
    	"x x",
    	"x x", 'x', ItemManager.mysticIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticStick),
    	" x ",
    	" x ", 'x', ItemManager.mysticIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicPickaxe),
    	"xxx",
    	" y ",
    	" y ", 'x', ItemManager.magicIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(BlockManager.weaklyReinforcedCobblestone),
    	"xxx",
    	"xyx",
    	"xxx", 'x', Blocks.cobblestone, 'y', ItemManager.flameWroughtIronIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicAxe),
    	"xx ",
    	"xy ",
    	" y ", 'x', ItemManager.magicIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicSpade),
    	" x ",
    	" y ",
    	" y ", 'x', ItemManager.magicIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicHoe),
    	"xx ",
    	" y ",
    	" y ", 'x', ItemManager.magicIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicSword),
    	" x ",
    	" x ",
    	" y ", 'x', ItemManager.magicIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronPickaxe),
    	"xxx",
    	" y ",
    	" y ", 'x', ItemManager.skyIronIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronAxe),
    	"xx ",
    	"xy ",
    	" y ", 'x', ItemManager.skyIronIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronSpade),
    	" x ",
    	" y ",
    	" y ", 'x', ItemManager.skyIronIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronHoe),
    	"xx ",
    	" y ",
    	" y ", 'x', ItemManager.skyIronIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronSword),
    	" x ",
    	" x ",
    	" y ", 'x', ItemManager.skyIronIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicHelmet),
    	"xxx",
    	"x x", 'x', ItemManager.magicIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicChestplate),
    	"x x",
    	"xxx",
    	"xxx", 'x', ItemManager.magicIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicLeggings),
    	"xxx",
    	"x x",
    	"x x", 'x', ItemManager.magicIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.magicBoots),
    	"x x",
    	"x x", 'x', ItemManager.magicIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronHelmet),
    	"xxx",
    	"x x", 'x', ItemManager.skyIronIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronChestplate),
    	"x x",
    	"xxx",
    	"xxx", 'x', ItemManager.skyIronIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronLeggings),
    	"xxx",
    	"x x",
    	"x x", 'x', ItemManager.skyIronIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.skyIronBoots),
    	"x x",
    	"x x", 'x', ItemManager.skyIronIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondSword),
    	" x ",
    	" x ",
    	" y ", 'x', ItemManager.lavaInfusedDiamond, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lavaInfusedDiamondHoe),
    	"xx ",
    	" y ",
    	" y ", 'x', ItemManager.lavaInfusedDiamond, 'y', ItemManager.goldenStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticSpade),
    	" x ",
    	" y ",
    	" y ", 'x', ItemManager.mysticIngot, 'y', ItemManager.diamondStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mysticSword),
    	" x ",
    	" x ",
    	" y ", 'x', ItemManager.mysticIngot, 'y', ItemManager.diamondStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.stoneHelmet),
    	"xxx",
    	"x x", 'x', Blocks.stone);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.stoneChestplate),
    	"x x",
    	"xxx",
    	"xxx", 'x', Blocks.stone);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.stoneLeggings),
    	"xxx",
    	"x x",
    	"x x", 'x', Blocks.stone);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.stoneBoots),
    	"x x",
    	"x x", 'x', Blocks.stone);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflamePickaxe),
    	"xxx",
    	" y ",
    	" y ", 'x', ItemManager.brightflameIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameAxe),
    	"xx ",
    	"xy ",
    	" y ", 'x', ItemManager.brightflameIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameSpade),
    	" x ",
    	" y ",
    	" y ", 'x', ItemManager.brightflameIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameHoe),
    	"xx ",
    	" y ",
    	" y ", 'x', ItemManager.brightflameIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameSword),
    	" x ",
    	" x ",
    	" y ", 'x', ItemManager.brightflameIngot, 'y', ItemManager.mysticStick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameHelmet),
    	"xxx",
    	"x x", 'x', ItemManager.brightflameIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameChestplate),
    	"x x",
    	"xxx",
    	"xxx", 'x', ItemManager.brightflameIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameLeggings),
    	"xxx",
    	"x x",
    	"x x", 'x', ItemManager.brightflameIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brightflameBoots),
    	"x x",
    	"x x", 'x', ItemManager.brightflameIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(BlockManager.maceratorIdle),
    	"yzy",
    	"xcx",
    	"yxy", 'y', Items.redstone, 'z', Blocks.piston, 'x', Items.iron_ingot, 'c', Blocks.furnace);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.justice),
    	"xxx",
    	"xyx",
    	"xxx", 'x', ItemManager.vividiumIngot, 'y', ItemManager.magicSword);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.corruption),
    	"xxx",
    	"xyx",
    	"xxx", 'x', ItemManager.mortiumIngot, 'y', ItemManager.magicSword);
    	GameRegistry.addShapedRecipe(new ItemStack(BlockManager.lapisFurnaceIdle),
    	"xxx",
    	"xyx",
    	"xxx", 'x', Blocks.lapis_block, 'y', Blocks.furnace);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mortiumHelmet),
    			"xxx",
    			"x x", 'x', ItemManager.mortiumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mortiumChestplate),
    	    	"x x",
    	    	"xxx",
    	    	"xxx", 'x', ItemManager.mortiumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mortiumLeggings),
    	    	"xxx",
    	    	"x x",
    	    	"x x", 'x', ItemManager.mortiumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.mortiumBoots),
    	    	"x x",
    	    	"x x", 'x', ItemManager.mortiumIngot);
    	
    	//Shapeless Recipe Start
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.compressedNetherrack),
    			Blocks.netherrack,
    			Blocks.netherrack,
    			Blocks.netherrack,
    			Blocks.netherrack,
    			Blocks.netherrack,
    			Blocks.netherrack,
    			Blocks.netherrack,
    			Blocks.netherrack,
    			Blocks.netherrack);		
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.netherrack, 9),
    			BlockManager.compressedNetherrack);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.magicIngot),
    			ItemManager.magicNugget,
    			ItemManager.magicNugget,
    			ItemManager.magicNugget,
    			ItemManager.magicNugget,
    			ItemManager.magicNugget,
    			ItemManager.magicNugget,
    			ItemManager.magicNugget,
    			ItemManager.magicNugget,
    			ItemManager.magicNugget);		
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.magicNugget, 9),
    			ItemManager.magicIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.lavaInfusedDiamondBlock),
    			ItemManager.lavaInfusedDiamond,
    			ItemManager.lavaInfusedDiamond,
    			ItemManager.lavaInfusedDiamond,
    			ItemManager.lavaInfusedDiamond,
    			ItemManager.lavaInfusedDiamond,
    			ItemManager.lavaInfusedDiamond,
    			ItemManager.lavaInfusedDiamond,
    			ItemManager.lavaInfusedDiamond,
    			ItemManager.lavaInfusedDiamond);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.lavaInfusedDiamond, 9),
    			BlockManager.lavaInfusedDiamondBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.doubleCompressedNetherrack),
    			BlockManager.compressedNetherrack,
    			BlockManager.compressedNetherrack,
    			BlockManager.compressedNetherrack,
    			BlockManager.compressedNetherrack,
    			BlockManager.compressedNetherrack,
    			BlockManager.compressedNetherrack,
    			BlockManager.compressedNetherrack,
    			BlockManager.compressedNetherrack,
    			BlockManager.compressedNetherrack);   		
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.compressedNetherrack, 9),
    			BlockManager.doubleCompressedNetherrack);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.magicBlock),
    			ItemManager.magicIngot,
    			ItemManager.magicIngot,
    			ItemManager.magicIngot,
    			ItemManager.magicIngot,
    			ItemManager.magicIngot,
    			ItemManager.magicIngot,
    			ItemManager.magicIngot,
    			ItemManager.magicIngot,
    			ItemManager.magicIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.magicIngot, 9),
    			BlockManager.magicBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.mysticBlock),
    			ItemManager.mysticIngot,
    			ItemManager.mysticIngot,
    			ItemManager.mysticIngot,
    			ItemManager.mysticIngot,
    			ItemManager.mysticIngot,
    			ItemManager.mysticIngot,
    			ItemManager.mysticIngot,
    			ItemManager.mysticIngot,
    			ItemManager.mysticIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.mysticIngot, 9),
    			BlockManager.mysticBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.tripleCompressedNetherrack),
    			BlockManager.doubleCompressedNetherrack,
    			BlockManager.doubleCompressedNetherrack,
    			BlockManager.doubleCompressedNetherrack,
    			BlockManager.doubleCompressedNetherrack,
    			BlockManager.doubleCompressedNetherrack,
    			BlockManager.doubleCompressedNetherrack,
    			BlockManager.doubleCompressedNetherrack,
    			BlockManager.doubleCompressedNetherrack,
    			BlockManager.doubleCompressedNetherrack);			
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.doubleCompressedNetherrack, 9),
    			BlockManager.tripleCompressedNetherrack);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.quadrupleCompressedNetherrack),
    			BlockManager.tripleCompressedNetherrack,
    			BlockManager.tripleCompressedNetherrack,
    			BlockManager.tripleCompressedNetherrack,
    			BlockManager.tripleCompressedNetherrack,
    			BlockManager.tripleCompressedNetherrack,
    			BlockManager.tripleCompressedNetherrack,
    			BlockManager.tripleCompressedNetherrack,
    			BlockManager.tripleCompressedNetherrack,
    			BlockManager.tripleCompressedNetherrack);  			
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.tripleCompressedNetherrack, 9),
    			BlockManager.quadrupleCompressedNetherrack);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.skyIronBlock),
    			ItemManager.skyIronIngot,
    			ItemManager.skyIronIngot,
    			ItemManager.skyIronIngot,
    			ItemManager.skyIronIngot,
    			ItemManager.skyIronIngot,
    			ItemManager.skyIronIngot,
    			ItemManager.skyIronIngot,
    			ItemManager.skyIronIngot,
    			ItemManager.skyIronIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.skyIronIngot, 9),
    			BlockManager.skyIronBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.toslotriumBlock),
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.toslotriumIngot, 9),
    			BlockManager.toslotriumBlock);    	
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.terriumBlock),
    			ItemManager.terriumIngot,
    			ItemManager.terriumIngot,
    			ItemManager.terriumIngot,
    			ItemManager.terriumIngot,
    			ItemManager.terriumIngot,
    			ItemManager.terriumIngot,
    			ItemManager.terriumIngot,
    			ItemManager.terriumIngot,
    			ItemManager.terriumIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.terriumIngot, 9),
    			BlockManager.terriumBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.brightflameBlock),
    			ItemManager.brightflameIngot,
    			ItemManager.brightflameIngot,
    			ItemManager.brightflameIngot,
    			ItemManager.brightflameIngot,
    			ItemManager.brightflameIngot,
    			ItemManager.brightflameIngot,
    			ItemManager.brightflameIngot,
    			ItemManager.brightflameIngot,
    			ItemManager.brightflameIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.brightflameIngot, 9),
    			BlockManager.brightflameBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.flameWroughtIronBlock),
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.flameWroughtIronIngot, 9),
    			BlockManager.flameWroughtIronBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.brightsteelIngot, 3),
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.toslotriumIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.flameWroughtIronIngot,
    			ItemManager.mortiumIngot);
    	
    }//end addCraftingRecipes    
  
 
    public static void addSmeltingRecipes() {    
    	GameRegistry.addSmelting(new ItemStack(ItemManager.mysticApple),
    			new ItemStack(ItemManager.mysticIngot), 1f);
    	GameRegistry.addSmelting(new ItemStack(Items.iron_ingot),
    			new ItemStack(ItemManager.flameWroughtIronIngot), 0.2f);
    	GameRegistry.addSmelting(new ItemStack(ItemManager.brightflameApple),
    			new ItemStack(ItemManager.brightflameIngot), 2f);
    	GameRegistry.addSmelting(new ItemStack(ItemManager.mysteriousApple),
    			new ItemStack(ItemManager.mysteriousIngot), 3f);
    	GameRegistry.addSmelting(new ItemStack(ItemManager.mixedIngot),
    			new ItemStack(ItemManager.mithrilIngot), 10f);
    	GameRegistry.addSmelting(new ItemStack(BlockManager.terriumOre),
    			new ItemStack(ItemManager.terriumIngot), 5f);
    	GameRegistry.addSmelting(new ItemStack(BlockManager.skyIronOre),
    			new ItemStack(ItemManager.skyIronIngot), 0.1f);
    	GameRegistry.addSmelting(new ItemStack(BlockManager.whiteCobblestone),
    			new ItemStack(BlockManager.whiteStone), 0.01f);
    	GameRegistry.addSmelting(new ItemStack(BlockManager.toslotriumOre),
    			new ItemStack(ItemManager.toslotriumIngot), 1f);
    	GameRegistry.addSmelting(new ItemStack(BlockManager.weaklyReinforcedCobblestone),
    			new ItemStack(BlockManager.reinforcedCobblestone), 0.7f);
    	GameRegistry.addSmelting(new ItemStack(BlockManager.mortiumOre),
    			new ItemStack(ItemManager.mortiumIngot), 3f);
    	GameRegistry.addSmelting(new ItemStack(BlockManager.vividiumOre),
    			new ItemStack(ItemManager.vividiumIngot), 3f);
    }//end addSmeltingRecipes
}