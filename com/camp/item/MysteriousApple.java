package com.camp.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MysteriousApple extends ItemFood{

	public MysteriousApple(int p_i45339_1_, float p_i45339_2_,
			boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("MysteriousApple");
		this.setCreativeTab(CreativeTabsManager.tabMysticFoods);
		this.setTextureName(StringLibrary.MODID + ":apple_mysterious");
		this.setAlwaysEdible();
	}
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		if(!world.isRemote){
			//player.addPotionEffect(new PotionEffect(Potion.poison.getId(), 1000, 1));
			player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 1000, 1));
			player.addExperienceLevel(20);
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 6000, 3));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 6000, 3));
			player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 1000, 1));
			player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 6000, 1));
		}
	}
}
