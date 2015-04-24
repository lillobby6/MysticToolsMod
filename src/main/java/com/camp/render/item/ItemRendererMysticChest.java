package com.camp.render.item;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.camp.tileEntity.TileEntityMysticChest;

public class ItemRendererMysticChest implements IItemRenderer {

	private ModelChest chestModel;
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityMysticChest(), 0, 0, 0, 0);
	}

}
