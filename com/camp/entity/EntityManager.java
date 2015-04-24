package com.camp.entity;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.camp.main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityManager {

	public static void mainRegistry()
	{
		registerEntity();
	}
	
	public static void registerEntity()
	{
		createEntity(EntityOreMob.class, "OreMob", 0xB3B3B3, 0x000000);
		
		createEntity2(EntityToslotriumOreMob.class, "ToslotriumMob", 0xB3B3B3, 0xE3E302);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor)
	{
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		
		EntityRegistry.registerGlobalEntityID(EntityOreMob.class, entityName, randomId);
		EntityRegistry.registerModEntity(EntityOreMob.class, entityName, randomId, MainRegistry.instance, 16, 1, true);
		EntityRegistry.addSpawn(EntityOreMob.class, 5, 0, 2, EnumCreatureType.creature, BiomeGenBase.extremeHills);
		EntityRegistry.addSpawn(EntityOreMob.class, 5, 0, 2, EnumCreatureType.creature, BiomeGenBase.extremeHillsPlus);
		EntityRegistry.addSpawn(EntityOreMob.class, 5, 0, 2, EnumCreatureType.creature, BiomeGenBase.extremeHillsEdge);
		EntityRegistry.addSpawn(EntityOreMob.class, 5, 3, 4, EnumCreatureType.creature, BiomeGenBase.stoneBeach);
		EntityRegistry.addSpawn(EntityOreMob.class, 2, 0, 2, EnumCreatureType.creature, BiomeGenBase.mesa);
		EntityRegistry.addSpawn(EntityOreMob.class, 3, 0, 2, EnumCreatureType.creature, BiomeGenBase.mesaPlateau);
		EntityRegistry.addSpawn(EntityOreMob.class, 3, 0, 2, EnumCreatureType.creature, BiomeGenBase.mesaPlateau_F);
		EntityRegistry.addSpawn(EntityOreMob.class, 1, 5, 7, EnumCreatureType.creature, BiomeGenBase.mushroomIsland);
		EntityRegistry.addSpawn(EntityOreMob.class, 1, 5, 7, EnumCreatureType.creature, BiomeGenBase.mushroomIslandShore);
		EntityRegistry.addSpawn(EntityOreMob.class, 6, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);

		 
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	public static void createEntity2(Class entityClass, String entityName, int solidColor, int spotColor)
	{
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		
		EntityRegistry.registerGlobalEntityID(EntityToslotriumOreMob.class, entityName, randomId);
		EntityRegistry.registerModEntity(EntityToslotriumOreMob.class, entityName, randomId, MainRegistry.instance, 16, 1, true);
		
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityEggInfo(randomId, solidColor, spotColor));
	}
	
}
