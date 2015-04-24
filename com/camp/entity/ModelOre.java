package com.camp.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelOre extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer BackLeftLeg;
    ModelRenderer FrontLeftLeg;
    ModelRenderer FrontRightLeg;
    ModelRenderer BackRightLeg;
  
  public ModelOre()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 72, 0);
      Body.addBox(-7F, -6F, 0F, 14, 14, 14);
      Body.setRotationPoint(0F, 15F, -7F);
      Body.setTextureSize(128, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 0, 17);
      LeftArm.addBox(0F, 0F, -9F, 4, 5, 10);
      LeftArm.setRotationPoint(7F, 12F, 0F);
      LeftArm.setTextureSize(128, 32);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 0, 0);
      RightArm.addBox(0F, 0F, 0F, 4, 5, 10);
      RightArm.setRotationPoint(-7F, 12F, 1F);
      RightArm.setTextureSize(128, 32);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 3.141593F, 0F);
      BackLeftLeg = new ModelRenderer(this, 42, 24);
      BackLeftLeg.addBox(0F, 0F, 0F, 3, 5, 3);
      BackLeftLeg.setRotationPoint(7F, 19F, 1F);
      BackLeftLeg.setTextureSize(128, 32);
      BackLeftLeg.mirror = true;
      setRotation(BackLeftLeg, 0F, 0F, 0F);
      FrontLeftLeg = new ModelRenderer(this, 29, 24);
      FrontLeftLeg.addBox(0F, 0F, 0F, 3, 5, 3);
      FrontLeftLeg.setRotationPoint(7F, 19F, -5F);
      FrontLeftLeg.setTextureSize(128, 32);
      FrontLeftLeg.mirror = true;
      setRotation(FrontLeftLeg, 0F, 0F, 0F);
      FrontRightLeg = new ModelRenderer(this, 29, 0);
      FrontRightLeg.addBox(0F, 0F, 0F, 3, 5, 3);
      FrontRightLeg.setRotationPoint(-10F, 19F, -5F);
      FrontRightLeg.setTextureSize(128, 32);
      FrontRightLeg.mirror = true;
      setRotation(FrontRightLeg, 0F, 0F, 0F);
      BackRightLeg = new ModelRenderer(this, 42, 0);
      BackRightLeg.addBox(0F, 0F, 0F, 3, 5, 3);
      BackRightLeg.setRotationPoint(-10F, 19F, 1F);
      BackRightLeg.setTextureSize(128, 32);
      BackRightLeg.mirror = true;
      setRotation(BackRightLeg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    LeftArm.render(f5);
    RightArm.render(f5);
    BackLeftLeg.render(f5);
    FrontLeftLeg.render(f5);
    FrontRightLeg.render(f5);
    BackRightLeg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.FrontLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.BackLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.FrontRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.BackRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.LeftArm.rotateAngleY = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.LeftArm.rotateAngleY = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
