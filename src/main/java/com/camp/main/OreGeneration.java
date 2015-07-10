/*package com.camp.main;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.camp.block.BlockManager;
import com.camp.block.BlockManager;

public class OreGeneration implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 1:
			generateEnd(world, random, chunkX, chunkZ);
			break;
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		case -1:
			generateNether(world, random, chunkX, chunkZ);
			break;
		}

	}

	public void generateEnd(World world, Random rand, int x, int z) {
	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		generateOre(BlockManager.skyIronOre, world, rand, x, z, 3, 15, 15, 0,
				100, Blocks.sandstone);
		generateOre(BlockManager.whiteStone, world, rand, x, z, 10, 17, 40, 40,
				63, Blocks.stone);
		generateOre(BlockManager.toslotriumOre, world, rand, x, z, 5, 20, 8, 0,
				63, Blocks.stone);
		generateOre(BlockManager.mortiumOre, world, rand, x, z, 1, 6, 4, 0,
				25, Blocks.stone);
		generateOre(BlockManager.vividiumOre, world, rand, x, z, 1, 6, 4, 0,
				25, Blocks.stone);
	}

	public void generateNether(World world, Random rand, int x, int z) {
		generateOre(BlockManager.terriumOre, world, rand, x, z, 2, 10, 5, 0,
				200, Blocks.netherrack);
	}

	public void generateOre(Block block, World world, Random random,
			int chunkX, int chunkZ, int minVienSize, int maxVienSize,
			int chance, int minY, int maxY, Block generateIn) {
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen;
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange + minY);
			int zRand = chunkZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(xRand, yRand, zRand));
		}
	}
	
}*/