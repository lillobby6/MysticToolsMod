package com.camp.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;

import com.camp.block.BlockManager;
import com.camp.entity.EntityOreMob;
import com.camp.entity.EntityToslotriumOreMob;
import com.camp.entity.ModelOre;
import com.camp.entity.ModelToslotriumOre;
import com.camp.entity.RenderOreMob;
import com.camp.entity.RenderToslotriumOreMob;
import com.camp.handler.KeyHandler;
import com.camp.main.ServerTickHandler;
import com.camp.render.MysticChestRenderer;
import com.camp.render.item.ItemRendererMysticChest;
import com.camp.tileEntity.TileEntityMysticChest;

public class ClientProxy extends CommonProxy{
	public int addArmor(String armor){
		return 0;
		//return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	public void registerRenderThings(){
		// Register KeyHandler
		FMLCommonHandler.instance().bus().register(new KeyHandler());
		RenderingRegistry.registerEntityRenderingHandler(EntityOreMob.class, new  RenderOreMob(null, new ModelOre(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityToslotriumOreMob.class, new  RenderToslotriumOreMob(null, new ModelToslotriumOre(), 0));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMysticChest.class, new MysticChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockManager.mysticChest), new ItemRendererMysticChest());
		FMLCommonHandler.instance().bus().register(new ServerTickHandler(Minecraft.getMinecraft()));
	}

}