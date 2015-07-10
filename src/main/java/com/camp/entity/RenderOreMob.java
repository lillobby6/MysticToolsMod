package com.camp.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.camp.lib.StringLibrary;

public class RenderOreMob extends RenderLiving{

	public RenderOreMob(RenderManager p_i46153_1_, ModelBase p_i46153_2_,
			float p_i46153_3_) {
		super(p_i46153_1_, p_i46153_2_, p_i46153_3_);
		// TODO Auto-generated constructor stub
	}




	private static final ResourceLocation mobTextures = new ResourceLocation(StringLibrary.MODID + ":textures/entity/ore_mob.png");
	
	/*public RenderOreMob(ModelBase par1, float par2) {
		super(renderManager, par1, par2);
		
	}*/

	
	protected ResourceLocation getEntityTexture(EntityOreMob entity) {
		return mobTextures;
	}

	


	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) 
	{
		return this.getEntityTexture((EntityOreMob)p_110775_1_);
	}
	
}
