package com.camp.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.camp.container.ContainerLapisFurnace;
import com.camp.lib.StringLibrary;
import com.camp.tileEntity.TileEntityLapisFurnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiLapisFurnace extends GuiContainer {

	public static final ResourceLocation texture = new ResourceLocation(StringLibrary.MODID, "textures/gui/lapis_furnace.png");
	
	public TileEntityLapisFurnace lapisFurnace;

	public GuiLapisFurnace(InventoryPlayer inventoryPlayer, TileEntityLapisFurnace entity)
	{
		super(new ContainerLapisFurnace(inventoryPlayer, entity));
		this.lapisFurnace = entity;
	}
	
	/**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		String name = this.lapisFurnace.hasCustomInventoryName() ? this.lapisFurnace.getInventoryName() : I18n.format(this.lapisFurnace.getInventoryName(), new Object[0]) ;
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	}

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

        if (this.lapisFurnace.isBurning())
        {
            int i1 = this.lapisFurnace.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
            i1 = this.lapisFurnace.getCookProgressScaled(24);
            this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
        }
	}
}