/*package com.camp.intregration.tconstruct.parts;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Part
  extends Item
  implements IToolPart
{
  protected String defaultIconTexture;
  protected int defaultMaterialID;
  protected String unlocalizedPartName;
  protected HashMap<Integer, String> unlocalizedMaterialNames = new HashMap();
  protected HashMap<Integer, String> textures = new HashMap();
  protected HashMap<Integer, IIcon> icons = new HashMap();
  protected static final String pathToTextures = "ExtraTiC".toLowerCase(Locale.ENGLISH) + ":" + "parts/";
  
  public Part(String defaultUnlocalizedPartName, int defaultMaterialID, String defaultTexture)
  {
    func_77637_a(CreativeTabs.field_78035_l);
    func_77625_d(64);
    func_77656_e(0);
    func_77627_a(true);
    
    func_77655_b("default." + defaultUnlocalizedPartName);
    this.unlocalizedPartName = defaultUnlocalizedPartName;
    this.defaultMaterialID = defaultMaterialID;
    this.defaultIconTexture = (pathToTextures + defaultTexture);
  }
  
  @SideOnly(Side.CLIENT)
  public void func_94581_a(IIconRegister icon)
  {
    this.field_77791_bV = icon.func_94245_a(this.defaultIconTexture);
    for (Map.Entry<Integer, String> texture : this.textures.entrySet())
    {
      int matrialID = ((Integer)texture.getKey()).intValue();
      String texutreName = (String)texture.getValue();
      
      IIcon _icon =  icon).func_94245_a(pathToTextures + texutreName);
      
      this.icons.put(Integer.valueOf(matrialID), _icon);
    }
  }
  
  public int getMaterialID(ItemStack itemStack)
  {
    int damageValue = itemStack.func_77960_j();
    if (damageValue >= 100) {
      return itemStack.func_77960_j();
    }
    return this.defaultMaterialID;
  }
  
  public void addMaterial(int materialId, String unlocalizedName, String texture)
  {
    this.unlocalizedMaterialNames.put(Integer.valueOf(materialId), unlocalizedName);
    this.textures.put(Integer.valueOf(materialId), texture);
  }
  
  public IIcon func_77617_a(int damageValue)
  {
    if (this.icons.containsKey(Integer.valueOf(damageValue))) {
      return (IIcon)this.icons.get(Integer.valueOf(damageValue));
    }
    return this.field_77791_bV;
  }
  
  public void func_150895_a(Item item, CreativeTabs tab, List itemStackList)
  {
    if (!this.unlocalizedMaterialNames.isEmpty()) {
      for (Map.Entry<Integer, String> subItem : this.unlocalizedMaterialNames.entrySet())
      {
        int matrialId = ((Integer)subItem.getKey()).intValue();
        itemStackList.add(new ItemStack(item, 1, matrialId));
      }
    } else {
      itemStackList.add(new ItemStack(this, 1));
    }
  }
  
  public String func_77667_c(ItemStack itemStack)
  {
    int damageValue = itemStack.func_77960_j();
    if (this.unlocalizedMaterialNames.containsKey(Integer.valueOf(damageValue))) {
      return "item." + (String)this.unlocalizedMaterialNames.get(Integer.valueOf(damageValue)) + "." + this.unlocalizedPartName;
    }
    return func_77658_a();
  }
  
  public String func_77653_i(ItemStack itemStack)
  {
    int damageValue = itemStack.func_77960_j();
    String displayName;
    String displayName;
    if (this.unlocalizedMaterialNames.containsKey(Integer.valueOf(damageValue)))
    {
      String unlocalizedMaterialName = (String)this.unlocalizedMaterialNames.get(Integer.valueOf(damageValue));
      String displayName;
      if ((StatCollector.func_94522_b("part." + this.unlocalizedPartName)) && (StatCollector.func_94522_b("material." + unlocalizedMaterialName)))
      {
        String localizedPartName = StatCollector.func_74838_a("part." + this.unlocalizedPartName);
        
        String localizedMaterialName = StatCollector.func_74838_a("material." + unlocalizedMaterialName);
        
        displayName = localizedPartName.replaceAll("@material@", localizedMaterialName);
      }
      else
      {
        displayName = func_77667_c(itemStack) + ".name";
      }
    }
    else
    {
      displayName = func_77658_a() + ".name";
    }
    return displayName;
  }
}*/