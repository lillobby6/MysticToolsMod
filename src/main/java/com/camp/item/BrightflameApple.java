package com.camp.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;
//need to chose INT, FLOAT, BOOLEAN
public class BrightflameApple extends ItemFood{

	public BrightflameApple(int p_i45339_1_, float p_i45339_2_,
			boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		// TODO Auto-generated constructor stub
		this.setAlwaysEdible();
		this.setUnlocalizedName("BrightflameApple");
		this.setCreativeTab(CreativeTabsManager.tabMysticFoods);
		this.setTextureName(StringLibrary.MODID + ":apple_brightflame");
	}
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		if(!world.isRemote){
			player.addPotionEffect(new PotionEffect(Potion.poison.getId(), 1, 1));
			player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 500, 1));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 6000, 3));
			player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 500, 1));
			player.addPotionEffect(new PotionEffect(Potion.harm.getId(), 1, 1));
			player.addExperienceLevel(30);
		}
}
	
}