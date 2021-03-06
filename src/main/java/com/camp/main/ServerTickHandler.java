package com.camp.main;

import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

import com.camp.enchantments.EnchantmentManager;
import com.camp.item.ItemManager;

public class ServerTickHandler {
	private Minecraft mc;
	
	public ServerTickHandler(Minecraft mc)
	{
		this.mc = mc;
	}
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event)
	{
		if(event.player.getCurrentArmor(0) != null)
		{
			ItemStack boots = event.player.getCurrentArmor(0);
			
			if(boots.getItem() == Items.diamond_boots || boots.getItem() == Items.golden_boots || boots.getItem() == Items.iron_boots || boots.getItem() == Items.leather_boots || boots.getItem() == Items.chainmail_boots || boots.getItem() == ItemManager.brightflameBoots || boots.getItem() == ItemManager.lavaInfusedDiamondBoots || boots.getItem() == ItemManager.terriumBoots || boots.getItem() == ItemManager.mysticBoots || boots.getItem() == ItemManager.stoneBoots || boots.getItem() == ItemManager.skyIronBoots || boots.getItem() == ItemManager.brightflameBoots || boots.getItem() == ItemManager.magicBoots || boots.getItem() == ItemManager.mortiumBoots){
				int j = EnchantmentHelper.getEnchantmentLevel(EnchantmentManager.speedBoost.effectId,  boots);
				if(j < 0)
				{
					event.player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
				}
			}
		}
	}
}
