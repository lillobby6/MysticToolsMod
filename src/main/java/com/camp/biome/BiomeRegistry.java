package com.camp.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	public static void MainRegistry()
	{
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeMystic;
	
	public static void initializeBiome()
	{
		biomeMystic = new BiomeGenMystic(137).setBiomeName("Mystic").setTemperatureRainfall(2F, 2F);
	}
	
	public static void registerBiome()
	{
		BiomeDictionary.registerBiomeType(biomeMystic, Type.PLAINS);
		BiomeManager.addSpawnBiome(biomeMystic);
	}
}
