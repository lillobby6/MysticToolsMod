/*package com.camp.intregration.tconstruct;

import com.camp.intregration.ModHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class PartsHandler
{
  public static Part ARROWHEAD;
  public static Part AXE_HEAD;
  public static Part BATTLE_SIGN_HEAD;
  public static Part BINDING;
  public static Part CHISEL_HEAD;
  public static Part CHUNK;
  public static Part CROSSBAR;
  public static Part EXCAVATOR_HEAD;
  public static Part FRYPAN_HEAD;
  public static Part FULL_GUARD;
  public static Part HAMMER_HEAD;
  public static Part KNIFE_BLADE;
  public static Part LARGE_GUARD;
  public static Part LARGE_SWORD_BLADE;
  public static Part LARGEPLATE;
  public static Part LUMBERAXE_HEAD;
  public static Part MEDIUM_GUARD;
  public static Part PICKAXE_HEAD;
  public static Part SCYTHE_HEAD;
  public static Part SHOVEL_HEAD;
  public static Part SWORD_BLADE;
  public static Part TOOLROD;
  public static Part TOUGHBIND;
  public static Part TOUGHROD;
  
  public static void addMatrials()
  {
    ModHandler modHandler = ModHandler.getInstance();
    if (modHandler.isEnabled("Metallurgy"))
    {
      _addM3BaseMaterials();
      _addM3PreciousMaterials();
      _addM3NetherMaterials();
      _addM3FantasyMaterials();
      _addM3EnderMaterials();
    }
    if (modHandler.isEnabled("Natura")) {
      _addNaturaMaterials();
    }
    if (modHandler.isEnabled("Mekanism")) {
      _addMekanismMaterials();
    }
    if (modHandler.isEnabled("FunStuff")) {
      _addFunStuffMaterials();
    }
    if (modHandler.isEnabled("AE")) {
      _addAEMaterials();
    }
    if (modHandler.isEnabled("BOP")) {
      _addBOPMaterials();
    }
  }
  
  public static void addParts()
  {
    _intiParts();
    
    ModHandler modHandler = ModHandler.getInstance();
    if (modHandler.isEnabled("Metallurgy"))
    {
      _addM3BaseParts();
      _addM3PreciousParts();
      _addM3NetherParts();
      _addM3FantasyParts();
      _addM3EnderParts();
    }
    if (modHandler.isEnabled("Natura")) {
      _addNaturaParts();
    }
    if (modHandler.isEnabled("Mekanism")) {
      _addMekanismParts();
    }
    if (modHandler.isEnabled("FunStuff")) {
      _addFunStuffParts();
    }
    if (modHandler.isEnabled("AE")) {
      _addAEParts();
    }
    if (modHandler.isEnabled("BOP")) {
      _addBOPParts();
    }
    _registerParts();
  }
  
  private static void _addM3BaseMaterials()
  {
    TConstructRegistry.addToolMaterial(100, "Angmallen", 2, 300, 1000, 2, 1.0F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(101, "Damascus Steel", 3, 500, 600, 2, 1.3F, 2, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(102, "Hepatizon", 2, 300, 1000, 1, 1.2F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(100, "ExtraTiC", "metallurgy3/base/angmallen", true);
    TConstructClientRegistry.addMaterialRenderMapping(101, "ExtraTiC", "metallurgy3/base/damascus_steel", true);
    TConstructClientRegistry.addMaterialRenderMapping(102, "ExtraTiC", "metallurgy3/base/hepatizon", true);
    
    TConstructRegistry.addBowMaterial(100, 300, 40, 1.2F);
    TConstructRegistry.addBowMaterial(101, 500, 40, 1.2F);
    TConstructRegistry.addBowMaterial(102, 300, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(100, 3.0F, 0.5F, 100.0F);
    TConstructRegistry.addArrowMaterial(101, 7.9F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(102, 8.3F, 0.5F, 100.0F);
  }
  
  private static void _addM3PreciousMaterials()
  {
    TConstructRegistry.addToolMaterial(103, "Brass", 0, 15, 1200, 1, 0.2F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(104, "Electrum", 1, 100, 2000, 1, 0.75F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(105, "Platinum", 2, 100, 2400, 1, 0.75F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(106, "Silver", 1, 25, 1600, 1, 0.2F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(103, "ExtraTiC", "metallurgy3/precious/brass", true);
    TConstructClientRegistry.addMaterialRenderMapping(104, "ExtraTiC", "metallurgy3/precious/electrum", true);
    TConstructClientRegistry.addMaterialRenderMapping(105, "ExtraTiC", "metallurgy3/precious/platinum", true);
    TConstructClientRegistry.addMaterialRenderMapping(106, "ExtraTiC", "metallurgy3/precious/silver", true);
    
    TConstructRegistry.addBowMaterial(103, 15, 40, 1.2F);
    TConstructRegistry.addBowMaterial(104, 100, 40, 1.2F);
    TConstructRegistry.addBowMaterial(105, 100, 40, 1.2F);
    TConstructRegistry.addBowMaterial(106, 25, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(103, 8.7F, 1.0F, 100.0F);
    TConstructRegistry.addArrowMaterial(104, 8.4F, 1.0F, 100.0F);
    TConstructRegistry.addArrowMaterial(105, 21.4F, 1.0F, 100.0F);
    TConstructRegistry.addArrowMaterial(106, 10.4F, 1.0F, 100.0F);
  }
  
  private static void _addM3NetherMaterials()
  {
    TConstructRegistry.addToolMaterial(107, "Amordrine", 4, 1300, 1400, 3, 1.8F, 0, 0.0F, "D", "Life Steal");
    TConstructRegistry.addToolMaterial(108, "Ceruclase", 3, 500, 700, 3, 1.4F, 0, 0.0F, "B", "Slowness");
    TConstructRegistry.addToolMaterial(109, "Ignatius", 1, 200, 400, 2, 1.0F, 0, 0.0F, "C", "Ignite I");
    TConstructRegistry.addToolMaterial(110, "Inolashite", 4, 900, 800, 3, 1.7F, 0, 0.0F, "2", "Poison II");
    TConstructRegistry.addToolMaterial(111, "Kalendrite", 4, 1000, 800, 3, 1.75F, 0, 0.0F, "5", "");
    TConstructRegistry.addToolMaterial(112, "Midasium", 3, 100, 1000, 3, 1.0F, 0, 0.0F, "7", "");
    TConstructRegistry.addToolMaterial(113, "Sanguinite", 6, 1750, 1200, 4, 2.3F, 0, 0.0F, "4", "Wither I");
    TConstructRegistry.addToolMaterial(114, "Shadow Iron", 1, 300, 400, 2, 1.3F, 1, 0.0F, "7", "Weakness I");
    TConstructRegistry.addToolMaterial(115, "Shadow Steel", 2, 400, 600, 3, 1.3F, 2, 0.0F, "7", "Weakness II");
    TConstructRegistry.addToolMaterial(116, "Vulcanite", 5, 1500, 1000, 3, 2.0F, 0, 0.0F, "C", "Ignite II");
    TConstructRegistry.addToolMaterial(117, "Vyroxeres", 3, 300, 700, 3, 1.3F, 0, 0.0F, "A", "Poison I");
    
    TConstructClientRegistry.addMaterialRenderMapping(107, "ExtraTiC", "metallurgy3/nether/amordrine", true);
    TConstructClientRegistry.addMaterialRenderMapping(108, "ExtraTiC", "metallurgy3/nether/ceruclase", true);
    TConstructClientRegistry.addMaterialRenderMapping(109, "ExtraTiC", "metallurgy3/nether/ignatius", true);
    TConstructClientRegistry.addMaterialRenderMapping(110, "ExtraTiC", "metallurgy3/nether/inolashite", true);
    TConstructClientRegistry.addMaterialRenderMapping(111, "ExtraTiC", "metallurgy3/nether/kalendrite", true);
    TConstructClientRegistry.addMaterialRenderMapping(112, "ExtraTiC", "metallurgy3/nether/midasium", true);
    TConstructClientRegistry.addMaterialRenderMapping(113, "ExtraTiC", "metallurgy3/nether/sanguinite", true);
    TConstructClientRegistry.addMaterialRenderMapping(114, "ExtraTiC", "metallurgy3/nether/shadow_iron", true);
    TConstructClientRegistry.addMaterialRenderMapping(115, "ExtraTiC", "metallurgy3/nether/shadow_steel", true);
    TConstructClientRegistry.addMaterialRenderMapping(116, "ExtraTiC", "metallurgy3/nether/vulcanite", true);
    TConstructClientRegistry.addMaterialRenderMapping(117, "ExtraTiC", "metallurgy3/nether/vyroxeres", true);
    
    TConstructRegistry.addBowMaterial(107, 1300, 40, 1.2F);
    TConstructRegistry.addBowMaterial(108, 500, 40, 1.2F);
    TConstructRegistry.addBowMaterial(109, 200, 40, 1.2F);
    TConstructRegistry.addBowMaterial(110, 900, 40, 1.2F);
    TConstructRegistry.addBowMaterial(111, 1000, 40, 1.2F);
    TConstructRegistry.addBowMaterial(112, 100, 40, 1.2F);
    TConstructRegistry.addBowMaterial(113, 1750, 40, 1.2F);
    TConstructRegistry.addBowMaterial(114, 300, 40, 1.2F);
    TConstructRegistry.addBowMaterial(115, 400, 40, 1.2F);
    TConstructRegistry.addBowMaterial(116, 1500, 40, 1.2F);
    TConstructRegistry.addBowMaterial(117, 300, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(107, 8.8F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(108, 9.0F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(109, 9.2F, 1.0F, 100.0F);
    TConstructRegistry.addArrowMaterial(110, 8.3F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(111, 8.6F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(112, 8.4F, 1.0F, 100.0F);
    TConstructRegistry.addArrowMaterial(113, 9.6F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(114, 8.2F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(115, 8.6F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(116, 9.6F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(117, 7.9F, 0.25F, 100.0F);
  }
  
  private static void _addM3FantasyMaterials()
  {
    TConstructRegistry.addToolMaterial(118, "Adamantine", 6, 1550, 1000, 4, 2.75F, 2, 0.0F, "4", "");
    TConstructRegistry.addToolMaterial(119, "Astral Silver", 4, 35, 1200, 1, 0.35F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(120, "Atlarus", 6, 1750, 1000, 4, 2.5F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(121, "Black Steel", 2, 500, 800, 2, 1.3F, 2, 0.0F, "9", "");
    TConstructRegistry.addToolMaterial(122, "Carmot", 4, 50, 1200, 1, 0.35F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(123, "Celenegil", 5, 1600, 1400, 3, 2.5F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(124, "Deep Iron", 2, 250, 600, 2, 1.3F, 1, 0.0F, "9", "");
    TConstructRegistry.addToolMaterial(125, "Haderoth", 4, 1250, 1200, 3, 2.3F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(126, "Mithril", 4, 1000, 900, 3, 1.5F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(127, "Orichalcum", 5, 1350, 900, 3, 2.5F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(128, "Oureclase", 3, 750, 800, 2, 1.3F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(129, "Prometheum", 1, 200, 400, 1, 1.0F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(130, "Quicksilver", 4, 1100, 1400, 3, 1.8F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(131, "Tartarite", 7, 3000, 1400, 5, 3.0F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(118, "ExtraTiC", "metallurgy3/fantasy/adamantine", true);
    TConstructClientRegistry.addMaterialRenderMapping(119, "ExtraTiC", "metallurgy3/fantasy/astral_silver", true);
    TConstructClientRegistry.addMaterialRenderMapping(120, "ExtraTiC", "metallurgy3/fantasy/atlarus", true);
    TConstructClientRegistry.addMaterialRenderMapping(121, "ExtraTiC", "metallurgy3/fantasy/black_steel", true);
    TConstructClientRegistry.addMaterialRenderMapping(122, "ExtraTiC", "metallurgy3/fantasy/carmot", true);
    TConstructClientRegistry.addMaterialRenderMapping(123, "ExtraTiC", "metallurgy3/fantasy/celenegil", true);
    TConstructClientRegistry.addMaterialRenderMapping(124, "ExtraTiC", "metallurgy3/fantasy/deep_iron", true);
    TConstructClientRegistry.addMaterialRenderMapping(125, "ExtraTiC", "metallurgy3/fantasy/haderoth", true);
    TConstructClientRegistry.addMaterialRenderMapping(126, "ExtraTiC", "metallurgy3/fantasy/mithril", true);
    TConstructClientRegistry.addMaterialRenderMapping(127, "ExtraTiC", "metallurgy3/fantasy/orichalcum", true);
    TConstructClientRegistry.addMaterialRenderMapping(128, "ExtraTiC", "metallurgy3/fantasy/oureclase", true);
    TConstructClientRegistry.addMaterialRenderMapping(129, "ExtraTiC", "metallurgy3/fantasy/prometheum", true);
    TConstructClientRegistry.addMaterialRenderMapping(130, "ExtraTiC", "metallurgy3/fantasy/quicksilver", true);
    TConstructClientRegistry.addMaterialRenderMapping(131, "ExtraTiC", "metallurgy3/fantasy/tartarite", true);
    
    TConstructRegistry.addBowMaterial(118, 1550, 40, 1.2F);
    TConstructRegistry.addBowMaterial(119, 35, 40, 1.2F);
    TConstructRegistry.addBowMaterial(120, 1750, 40, 1.2F);
    TConstructRegistry.addBowMaterial(121, 500, 40, 1.2F);
    TConstructRegistry.addBowMaterial(122, 50, 40, 1.2F);
    TConstructRegistry.addBowMaterial(123, 1600, 40, 1.2F);
    TConstructRegistry.addBowMaterial(124, 250, 40, 1.2F);
    TConstructRegistry.addBowMaterial(125, 1250, 40, 1.2F);
    TConstructRegistry.addBowMaterial(126, 1000, 40, 1.2F);
    TConstructRegistry.addBowMaterial(127, 1350, 40, 1.2F);
    TConstructRegistry.addBowMaterial(128, 750, 40, 1.2F);
    TConstructRegistry.addBowMaterial(129, 200, 40, 1.2F);
    TConstructRegistry.addBowMaterial(130, 1100, 40, 1.2F);
    TConstructRegistry.addBowMaterial(131, 3000, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(118, 9.2F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(119, 9.0F, 1.0F, 100.0F);
    TConstructRegistry.addArrowMaterial(120, 11.2F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(121, 8.3F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(122, 9.2F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(123, 9.5F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(124, 7.6F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(125, 8.9F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(126, 7.8F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(127, 9.2F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(128, 7.9F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(129, 7.2F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(130, 13.4F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(131, 25.3F, 0.25F, 100.0F);
  }
  
  private static void _addM3EnderMaterials()
  {
    TConstructRegistry.addToolMaterial(132, "Desichalkos", 4, 1800, 1000, 4, 2.75F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(133, "Eximite", 3, 1000, 800, 3, 1.3F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(132, "ExtraTiC", "metallurgy3/ender/desichalkos", true);
    TConstructClientRegistry.addMaterialRenderMapping(133, "ExtraTiC", "metallurgy3/ender/eximite", true);
    
    TConstructRegistry.addBowMaterial(132, 1800, 40, 1.2F);
    TConstructRegistry.addBowMaterial(133, 1000, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(132, 6.5F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(133, 6.3F, 0.25F, 100.0F);
  }
  
  private static void _addNaturaMaterials()
  {
    TConstructRegistry.addToolMaterial(134, "Bloodwood", 3, 350, 700, 3, 1.5F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(135, "Darkwood", 1, 131, 400, 1, 1.7F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(136, "Fusewood", 2, 250, 600, 2, 1.4F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(137, "Ghostwood", 1, 131, 400, 1, 1.3F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(138, "Nether Quartz", 1, 101, 300, 1, 0.7F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(134, "ExtraTiC", "natura/bloodwood", true);
    TConstructClientRegistry.addMaterialRenderMapping(135, "ExtraTiC", "natura/darkwood", true);
    TConstructClientRegistry.addMaterialRenderMapping(136, "ExtraTiC", "natura/fusewood", true);
    TConstructClientRegistry.addMaterialRenderMapping(137, "ExtraTiC", "natura/ghostwood", true);
    TConstructClientRegistry.addMaterialRenderMapping(138, "ExtraTiC", "natura/netherquartz", true);
    
    TConstructRegistry.addBowMaterial(134, 1504, 40, 1.2F);
    TConstructRegistry.addBowMaterial(135, 162, 40, 1.2F);
    TConstructRegistry.addBowMaterial(136, 28, 40, 1.2F);
    TConstructRegistry.addBowMaterial(137, 384, 40, 1.2F);
    TConstructRegistry.addBowMaterial(138, 10, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(134, 6.5F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(135, 6.3F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(136, 6.5F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(137, 6.3F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(138, 6.3F, 0.25F, 100.0F);
  }
  
  private static void _addMekanismMaterials()
  {
    TConstructRegistry.addToolMaterial(139, "Refined Glowstone", 2, 300, 1400, 5, 1.75F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(140, "Osmium", 2, 500, 1000, 4, 1.3F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(139, "ExtraTiC", "mekanism/glowstone", true);
    TConstructClientRegistry.addMaterialRenderMapping(140, "ExtraTiC", "mekanism/osmium", true);
    
    TConstructRegistry.addBowMaterial(139, 300, 40, 1.2F);
    TConstructRegistry.addBowMaterial(140, 500, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(139, 6.5F, 0.25F, 100.0F);
    TConstructRegistry.addArrowMaterial(140, 6.3F, 0.25F, 100.0F);
  }
  
  private static void _addFunStuffMaterials()
  {
    TConstructRegistry.addToolMaterial(141, "Pokefennium", 4, 500, 850, 2, 1.5F, 0, 0.0F, "", "");
    TConstructRegistry.addToolMaterial(142, "Fairy", 4, 250, 750, 2, 1.2F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(141, "ExtraTiC", "fun_stuff/pokefennium", true);
    TConstructClientRegistry.addMaterialRenderMapping(142, "ExtraTiC", "fun_stuff/fairy", true);
    
    TConstructRegistry.addBowMaterial(141, 500, 40, 1.2F);
    TConstructRegistry.addBowMaterial(142, 250, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(141, 6.5F, 0.5F, 50.0F);
    TConstructRegistry.addArrowMaterial(142, 6.3F, 0.25F, 85.0F);
  }
  
  private static void _addAEMaterials()
  {
    TConstructRegistry.addToolMaterial(143, "Certus Quartz", 2, 250, 600, 2, 1.4F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(143, "ExtraTiC", "ae/certus_quartz", true);
    
    TConstructRegistry.addBowMaterial(143, 250, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(143, 2.3F, 0.25F, 85.0F);
  }
  
  private static void _addBOPMaterials()
  {
    TConstructRegistry.addToolMaterial(144, "Amethyst", 4, 1548, 1500, 5, 1.2F, 0, 0.0F, "", "");
    
    TConstructClientRegistry.addMaterialRenderMapping(144, "ExtraTiC", "bop/amethyst", true);
    
    TConstructRegistry.addBowMaterial(144, 1548, 40, 1.2F);
    
    TConstructRegistry.addArrowMaterial(144, 2.1F, 0.25F, 80.0F);
  }
  
  private static void _intiParts()
  {
    ARROWHEAD = new Part("arrowhead", 0, "metallurgy3/base/angmallen_binding");
    AXE_HEAD = new Part("axe.head", 0, "metallurgy3/base/angmallen_binding");
    BATTLE_SIGN_HEAD = new Part("battle.sign", 0, "metallurgy3/base/angmallen_binding");
    BINDING = new Part("binding", 0, "metallurgy3/base/angmallen_binding");
    CHISEL_HEAD = new Part("chisel.head", 0, "metallurgy3/base/angmallen_binding");
    CHUNK = new Part("chunk", 0, "metallurgy3/base/angmallen_binding");
    CROSSBAR = new Part("crossbar", 0, "metallurgy3/base/angmallen_binding");
    EXCAVATOR_HEAD = new Part("excavator.head", 0, "metallurgy3/base/angmallen_binding");
    FRYPAN_HEAD = new Part("frypan.head", 0, "metallurgy3/base/angmallen_binding");
    FULL_GUARD = new Part("full.guard", 0, "metallurgy3/base/angmallen_binding");
    HAMMER_HEAD = new Part("hammer.head", 0, "metallurgy3/base/angmallen_binding");
    KNIFE_BLADE = new Part("knife.blade", 0, "metallurgy3/base/angmallen_binding");
    LARGE_GUARD = new Part("large.guard", 0, "metallurgy3/base/angmallen_binding");
    LARGE_SWORD_BLADE = new Part("large.sword.blade", 0, "metallurgy3/base/angmallen_binding");
    LARGEPLATE = new Part("largeplate", 0, "metallurgy3/base/angmallen_binding");
    LUMBERAXE_HEAD = new Part("lumberaxe.head", 0, "metallurgy3/base/angmallen_binding");
    MEDIUM_GUARD = new Part("medium.guard", 0, "metallurgy3/base/angmallen_binding");
    PICKAXE_HEAD = new Part("pickaxe.head", 0, "metallurgy3/base/angmallen_binding");
    SCYTHE_HEAD = new Part("scythe.head", 0, "metallurgy3/base/angmallen_binding");
    SHOVEL_HEAD = new Part("shovel.head", 0, "metallurgy3/base/angmallen_binding");
    SWORD_BLADE = new Part("sword.blade", 0, "metallurgy3/base/angmallen_binding");
    TOOLROD = new Part("toolrod", 0, "metallurgy3/base/angmallen_binding");
    TOUGHBIND = new Part("toughbind", 0, "metallurgy3/base/angmallen_binding");
    TOUGHROD = new Part("toughrod", 0, "metallurgy3/base/angmallen_binding");
  }
  
  private static void _addMatrialToToolParts(int matrialId, String unlocalizedName, String texture)
  {
    ARROWHEAD.addMaterial(matrialId, unlocalizedName, texture + "_arrowhead");
    
    AXE_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_axe_head");
    
    BATTLE_SIGN_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_battlesign_head");
    
    BINDING.addMaterial(matrialId, unlocalizedName, texture + "_binding");
    
    CHISEL_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_chisel_head");
    
    CHUNK.addMaterial(matrialId, unlocalizedName, texture + "_chunk");
    
    CROSSBAR.addMaterial(matrialId, unlocalizedName, texture + "_crossbar");
    
    EXCAVATOR_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_excavator_head");
    
    FRYPAN_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_frypan_head");
    
    FULL_GUARD.addMaterial(matrialId, unlocalizedName, texture + "_full_guard");
    
    HAMMER_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_hammer_head");
    
    KNIFE_BLADE.addMaterial(matrialId, unlocalizedName, texture + "_knife_blade");
    
    LARGE_GUARD.addMaterial(matrialId, unlocalizedName, texture + "_large_guard");
    
    LARGE_SWORD_BLADE.addMaterial(matrialId, unlocalizedName, texture + "_large_sword_blade");
    
    LARGEPLATE.addMaterial(matrialId, unlocalizedName, texture + "_largeplate");
    
    LUMBERAXE_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_lumberaxe_head");
    
    MEDIUM_GUARD.addMaterial(matrialId, unlocalizedName, texture + "_medium_guard");
    
    PICKAXE_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_pickaxe_head");
    
    SCYTHE_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_scythe_head");
    
    SHOVEL_HEAD.addMaterial(matrialId, unlocalizedName, texture + "_shovel_head");
    
    SWORD_BLADE.addMaterial(matrialId, unlocalizedName, texture + "_sword_blade");
    
    TOOLROD.addMaterial(matrialId, unlocalizedName, texture + "_rod");
    
    TOUGHBIND.addMaterial(matrialId, unlocalizedName, texture + "_toughbind");
    
    TOUGHROD.addMaterial(matrialId, unlocalizedName, texture + "_toughrod");
  }
  
  private static void _registerParts()
  {
    GameRegistry.registerItem(ARROWHEAD, "arrowhead");
    GameRegistry.registerItem(AXE_HEAD, "axeHead");
    GameRegistry.registerItem(BATTLE_SIGN_HEAD, "battelSign");
    GameRegistry.registerItem(BINDING, "binding");
    GameRegistry.registerItem(CHISEL_HEAD, "chiselHead");
    GameRegistry.registerItem(CHUNK, "chunk");
    GameRegistry.registerItem(CROSSBAR, "crossbar");
    GameRegistry.registerItem(EXCAVATOR_HEAD, "excavatorHead");
    GameRegistry.registerItem(FRYPAN_HEAD, "frypanHead");
    GameRegistry.registerItem(FULL_GUARD, "fullGuard");
    GameRegistry.registerItem(HAMMER_HEAD, "hammerHead");
    GameRegistry.registerItem(KNIFE_BLADE, "knifeBlade");
    GameRegistry.registerItem(LARGE_GUARD, "largeGuard");
    GameRegistry.registerItem(LARGE_SWORD_BLADE, "largeSwordBlade");
    GameRegistry.registerItem(LARGEPLATE, "largeplate");
    GameRegistry.registerItem(LUMBERAXE_HEAD, "lumberaxeHead");
    GameRegistry.registerItem(MEDIUM_GUARD, "mediumGuard");
    GameRegistry.registerItem(PICKAXE_HEAD, "pickaxeHead");
    GameRegistry.registerItem(SCYTHE_HEAD, "scytheHead");
    GameRegistry.registerItem(SHOVEL_HEAD, "shovelHead");
    GameRegistry.registerItem(SWORD_BLADE, "swordBlade");
    GameRegistry.registerItem(TOOLROD, "toolrod");
    GameRegistry.registerItem(TOUGHBIND, "toughbind");
    GameRegistry.registerItem(TOUGHROD, "toughrod");
  }
  
  private static void _addM3BaseParts()
  {
    _addMatrialToToolParts(100, "angmanllen", "metallurgy3/base/angmallen");
    _addMatrialToToolParts(101, "damascus.steel", "metallurgy3/base/damascus_steel");
    _addMatrialToToolParts(102, "hepatizon", "metallurgy3/base/hepatizon");
  }
  
  private static void _addM3PreciousParts()
  {
    _addMatrialToToolParts(103, "brass", "metallurgy3/precious/brass");
    _addMatrialToToolParts(104, "electrum", "metallurgy3/precious/electrum");
    _addMatrialToToolParts(105, "platinum", "metallurgy3/precious/platinum");
    _addMatrialToToolParts(106, "silver", "metallurgy3/precious/silver");
  }
  
  private static void _addM3NetherParts()
  {
    _addMatrialToToolParts(107, "amordrine", "metallurgy3/nether/amordrine");
    _addMatrialToToolParts(108, "ceruclase", "metallurgy3/nether/ceruclase");
    _addMatrialToToolParts(109, "ignatius", "metallurgy3/nether/ignatius");
    _addMatrialToToolParts(110, "inolashite", "metallurgy3/nether/inolashite");
    _addMatrialToToolParts(111, "kalendrite", "metallurgy3/nether/kalendrite");
    _addMatrialToToolParts(112, "midasium", "metallurgy3/nether/midasium");
    _addMatrialToToolParts(113, "sanguinite", "metallurgy3/nether/sanguinite");
    _addMatrialToToolParts(114, "shadow.iron", "metallurgy3/nether/shadow_iron");
    _addMatrialToToolParts(115, "shadow.steel", "metallurgy3/nether/shadow_steel");
    _addMatrialToToolParts(116, "vulcanite", "metallurgy3/nether/vulcanite");
    _addMatrialToToolParts(117, "vyroxeres", "metallurgy3/nether/vyroxeres");
  }
  
  private static void _addM3FantasyParts()
  {
    _addMatrialToToolParts(118, "adamantine", "metallurgy3/fantasy/adamantine");
    _addMatrialToToolParts(119, "astral.silver", "metallurgy3/fantasy/astral_silver");
    _addMatrialToToolParts(120, "atlarus", "metallurgy3/fantasy/atlarus");
    _addMatrialToToolParts(121, "black.steel", "metallurgy3/fantasy/black_steel");
    _addMatrialToToolParts(122, "carmot", "metallurgy3/fantasy/carmot");
    _addMatrialToToolParts(123, "celenegil", "metallurgy3/fantasy/celenegil");
    _addMatrialToToolParts(124, "deep.iron", "metallurgy3/fantasy/deep_iron");
    _addMatrialToToolParts(125, "haderoth", "metallurgy3/fantasy/haderoth");
    _addMatrialToToolParts(126, "mithril", "metallurgy3/fantasy/mithril");
    _addMatrialToToolParts(127, "orichalcum", "metallurgy3/fantasy/orichalcum");
    _addMatrialToToolParts(128, "oureclase", "metallurgy3/fantasy/oureclase");
    _addMatrialToToolParts(129, "prometheum", "metallurgy3/fantasy/prometheum");
    _addMatrialToToolParts(130, "quicksilver", "metallurgy3/fantasy/quicksilver");
    _addMatrialToToolParts(131, "tartarite", "metallurgy3/fantasy/tartarite");
  }
  
  private static void _addM3EnderParts()
  {
    _addMatrialToToolParts(132, "desichalkos", "metallurgy3/ender/desichalkos");
    _addMatrialToToolParts(133, "eximite", "metallurgy3/ender/eximite");
  }
  
  private static void _addNaturaParts()
  {
    _addMatrialToToolParts(134, "bloodwood", "natura/bloodwood");
    _addMatrialToToolParts(135, "darkwood", "natura/darkwood");
    _addMatrialToToolParts(136, "fusewood", "natura/fusewood");
    _addMatrialToToolParts(137, "ghostwood", "natura/ghostwood");
    _addMatrialToToolParts(138, "nether.quartz", "natura/netherquartz");
  }
  
  private static void _addMekanismParts()
  {
    _addMatrialToToolParts(139, "refined.glowstone", "mekanism/glowstone");
    _addMatrialToToolParts(140, "osmium", "mekanism/osmium");
  }
  
  private static void _addFunStuffParts()
  {
    _addMatrialToToolParts(141, "pokefennium", "fun_stuff/pokefennium");
    _addMatrialToToolParts(142, "fairy", "fun_stuff/fairy");
  }
  
  private static void _addAEParts()
  {
    _addMatrialToToolParts(143, "certus.quartz", "ae/certus_quartz");
  }
  
  private static void _addBOPParts()
  {
    _addMatrialToToolParts(144, "amethyst", "bop/amethyst");
  }
}*/