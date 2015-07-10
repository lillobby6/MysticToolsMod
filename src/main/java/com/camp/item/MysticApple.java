package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MysticApple extends ItemFood{

	public MysticApple(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		// TODO Auto-generated constructor stub
		this.setAlwaysEdible();
		this.setUnlocalizedName("MysticApple");
		this.setCreativeTab(CreativeTabsManager.tabMysticFoods);
		//this.setTextureName(StringLibrary.MODID + ":apple_diamond");
		
	}
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		if(!world.isRemote){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 6000, 3));
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 6000, 3));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 6000, 3));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 6000, 3));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 6000, 3));
			/*absorption*/ player.addPotionEffect(new PotionEffect(Potion.absorption.id, 6000, 1)); //absorption
			player.addExperience(100);
		}
	}
}
