package com.camp.entity;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.camp.item.ItemManager;

public class EntityToslotriumOreMob extends EntityAnimal{

	public EntityToslotriumOreMob(World world) {
		super(world);
		this.setSize(1.1F, 1.1F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
		this.tasks.addTask(1, new EntityAIPanic(this, 1D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(4, new EntityAITempt(this, 1.2D, ItemManager.toslotriumIngot, false));
		this.tasks.addTask(5, new EntityAISwimming(this));
		this.getNavigator().setAvoidsWater(true);
	}
	public boolean isAIEnabled()
	{
		return true;
	}
	
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		
		return null;
		//return new EntityOreBlock(worldObj);
	}

	protected Item getDropItem()
    {
        return ItemManager.toslotriumIngot;
    }
	
}
