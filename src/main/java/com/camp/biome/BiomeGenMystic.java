package com.camp.biome;

import net.minecraft.world.biome.BiomeGenBase;

import com.camp.entity.EntityOreMob;
import com.camp.entity.EntityToslotriumOreMob;

public class BiomeGenMystic extends BiomeGenBase{

	public BiomeGenMystic(int id)
	{
		super(id);
		
		this.theBiomeDecorator.treesPerChunk = 3;
		this.theBiomeDecorator.grassPerChunk = 7;
		this.theBiomeDecorator.clayPerChunk = 40;
		//this.theBiomeDecorator.
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityOreMob.class, 5, 0, 10));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityToslotriumOreMob.class, 5, 0, 10));

		
	}
	 
}
