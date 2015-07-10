package com.camp.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

import com.camp.container.ContainerMacerator;
import com.camp.lib.StringLibrary;
import com.camp.tileEntity.TileEntityMacerator;

@SideOnly(Side.CLIENT)
public class GuiMacerator extends GuiContainer {

	public static final ResourceLocation texture = new ResourceLocation(StringLibrary.MODID + ":" + "textures/gui/macerator.png");
	
	public TileEntityMacerator macerator;

	public GuiMacerator(InventoryPlayer inventoryPlayer, TileEntityMacerator entity)
	{
		super(new ContainerMacerator(inventoryPlayer, entity));
		this.macerator = entity;
	}
	
	/**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		String name = this.macerator.hasCustomInventoryName() ? this.macerator.getInventoryName() : I18n.format(this.macerator.getInventoryName(), new Object[0]) ;
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 4, 4210752);
	}

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

        if (this.macerator.hasPower())
        {
            int i1 = this.macerator.getPowerRemainingScaled(45);
            this.drawTexturedModalRect(k + 8, l + 53 - i1, 176, 62 - i1, 16, i1);
            i1 = this.macerator.getMacerationProgressScaled(24);
            this.drawTexturedModalRect(k + 79, l + 34, 176, 0, i1 + 1, 16);
        }
	}
}