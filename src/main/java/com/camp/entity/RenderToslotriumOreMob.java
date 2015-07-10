package com.camp.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.camp.lib.StringLibrary;

public class RenderToslotriumOreMob extends RenderLiving{

	public RenderToslotriumOreMob(RenderManager p_i46153_1_,
			ModelBase p_i46153_2_, float p_i46153_3_) {
		super(p_i46153_1_, p_i46153_2_, p_i46153_3_);
		// TODO Auto-generated constructor stub
	}




	private static final ResourceLocation mobTextures = new ResourceLocation(StringLibrary.MODID + ":textures/entity/toslotrium_ore_mob.png");
	
	/*public RenderToslotriumOreMob(ModelBase par1, float par2) {
		super(par1, par2);
		
	}*/

	
	protected ResourceLocation getEntityTexture(EntityToslotriumOreMob entity) {
		return mobTextures;
	}

	


	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) 
	{
		return this.getEntityTexture((EntityToslotriumOreMob)p_110775_1_);
		
	}
	
}
