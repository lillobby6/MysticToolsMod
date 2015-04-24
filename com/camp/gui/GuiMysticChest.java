package com.camp.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.camp.container.ContainerMysticChest;
import com.camp.lib.StringLibrary;
import com.camp.tileEntity.TileEntityMysticChest;

public class GuiMysticChest extends GuiContainer
{
	private static final ResourceLocation field_147017_u = new ResourceLocation(StringLibrary.MODID + ":" + "textures/gui/generic_54.png");
	
	public TileEntityMysticChest mysticChest;
	
	private IInventory chestInventory;
	
	private int inventoryRows = 6;
	
	public GuiMysticChest(IInventory in1, TileEntityMysticChest entity)
	{
		super(new ContainerMysticChest(in1, entity));
		this.allowUserInput = false;
		short short1 = 222;
		int i = short1 - 108;
		this.inventoryRows = in1.getSizeInventory() / 9;
		this.ySize = i + this.inventoryRows * 18;
		
		this.mysticChest = entity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_,
			int p_146976_2_, int p_146976_3_) {
		
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(field_147017_u);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.inventoryRows * 18 + 17);
        this.drawTexturedModalRect(k, l + this.inventoryRows * 18 + 17, 0, 126, this.xSize, 96);
        }

}
