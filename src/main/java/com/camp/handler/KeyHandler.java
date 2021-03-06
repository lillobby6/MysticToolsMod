package com.camp.handler;

import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

import org.lwjgl.input.Keyboard;

import com.camp.lib.ByteLibrary;
import com.camp.main.MainRegistry;
import com.camp.packet.OpenGUIPacket;

public class KeyHandler {
	
	public static final int BACKPACK_KEY = 0;
	
	private static final String[] keyDesc = {"key.mystic.backpack.desc"};
	private static final int[] keyValues = {Keyboard.KEY_B};
	private final KeyBinding[] keys;
	
	public KeyHandler()
	{
		keys = new KeyBinding[keyValues.length];
		for(int i = 0; i < keyValues.length; i++)
		{
			keys[i] = new KeyBinding(keyDesc[i], keyValues[i], "key.mystic.category");
			ClientRegistry.registerKeyBinding(keys[i]);
		}
	}
	
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		if(FMLClientHandler.instance().isGUIOpen(GuiChat.class))
		{
			int key = Keyboard.getEventKey();
			boolean isDown = Keyboard.getEventKeyState();
			
			//Backpack key
			if(isDown && key == keyValues[BACKPACK_KEY])
			{
				//Send packet to open gui.
				MainRegistry.packetPipeline.sendToServer(new OpenGUIPacket(ByteLibrary.GUI_BACKPACK));
			}
		}
	}

	
}
