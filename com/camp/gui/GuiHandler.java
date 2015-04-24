package com.camp.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.camp.container.ContainerAlloyFurnace;
import com.camp.container.ContainerLapisFurnace;
import com.camp.container.ContainerMacerator;
import com.camp.container.ContainerMysticChest;
import com.camp.lib.ByteLibrary;
import com.camp.main.MainRegistry;
import com.camp.tileEntity.TileEntityAlloyFurnace;
import com.camp.tileEntity.TileEntityLapisFurnace;
import com.camp.tileEntity.TileEntityMacerator;
import com.camp.tileEntity.TileEntityMysticChest;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler{

	
	public GuiHandler()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.instance, this);
	}
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z)
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		if(entity != null)
		{
			switch(ID)
			{
			case MainRegistry.guiIdLapisFurnace:
				if(entity instanceof TileEntityLapisFurnace)
				{
					return new ContainerLapisFurnace(player.inventory, (TileEntityLapisFurnace) entity);
				}
			case ByteLibrary.GUI_BACKPACK:
				break;
			case ByteLibrary.GUI_MYSTIC_CHEST:
				if(entity instanceof TileEntityMysticChest)
				{
					return new ContainerMysticChest(player.inventory, (TileEntityMysticChest) entity);
				}
				break;
			case ByteLibrary.GUI_MACERATOR:
				if(entity instanceof TileEntityMacerator)
				{
					return new ContainerMacerator(player.inventory, (TileEntityMacerator) entity);
				}
			case ByteLibrary.GUI_ALLOY_FURNACE:
				if(entity instanceof TileEntityAlloyFurnace)
				{
					return new ContainerAlloyFurnace(player.inventory, (TileEntityAlloyFurnace) entity);
				}
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z)
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		if(entity != null)
		{
			switch(ID)
			{
			case MainRegistry.guiIdLapisFurnace:
				if(entity instanceof TileEntityLapisFurnace)
				{
					return new GuiLapisFurnace(player.inventory, (TileEntityLapisFurnace) entity);
				}
			case ByteLibrary.GUI_MYSTIC_CHEST:
				if(entity instanceof TileEntityMysticChest)
				{
					return new GuiMysticChest(player.inventory, (TileEntityMysticChest) entity);
				}
			case ByteLibrary.GUI_MACERATOR:
				if(entity instanceof TileEntityMacerator)
				{
					return new GuiMacerator(player.inventory, (TileEntityMacerator) entity);
				}
			case ByteLibrary.GUI_ALLOY_FURNACE:
				if(entity instanceof TileEntityAlloyFurnace)
				{
					return new GuiAlloyFurnace(player.inventory, (TileEntityAlloyFurnace) entity);
				}
			}
		}
		
		
		return null;
	}

}
