package com.camp.packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;

import com.camp.main.MainRegistry;

public class OpenGUIPacket extends AbstractPacket{

	public int id;
	
	public OpenGUIPacket(){}
	
	public OpenGUIPacket(int id)
	{
		this.id = id;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		buffer.writeByte(id);
		
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		id = buffer.readByte();
		
	}

	@Override
	public void handleClientSide(EntityPlayer player) {
	
		
	}

	@Override
	public void handleServerSide(EntityPlayer player) {
	
		FMLNetworkHandler.openGui(player, MainRegistry.instance, id, player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ);
		System.out.println("YOU DID IT!");
	}

}
