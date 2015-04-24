package com.camp.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import com.camp.biome.BiomeRegistry;

public class WorldProviderMystic extends WorldProvider{

	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeMystic,1.2F);
		this.dimensionId = DimensionRegistry.dimensionId;
	}
	
	public IChunkProvider createChunkGeneration()
	{
		return null;
	}
	
	@Override
	public String getDimensionName() {
		return "Mystic";
	}

}
