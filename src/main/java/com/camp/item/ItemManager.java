package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.ArmorMaterials;
import com.camp.lib.ToolMaterials;
import com.camp.main.MainRegistry;

public class ItemManager {
    public static void mainRegistry() {
        initializeItem();
        //registerItem();
    }
    
    /***/
    //Start ToolMaterials
    /***/
    
	public static int backpackRenderIndex = MainRegistry.proxy.addArmor("MysticBackpack");

    
    /*public static ToolMaterial customToolMaterial = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantablity);
	* public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 1561, 8.0f, 3.0f, 10); FOR REFERENCE "DIAMOND"
	*																				If (maxUses == -1 infiniteDurability = true)	*/
		
	/***/
	//End ToolMaterials, Start ArmorMaterials
	/***/
	
	
	//public static ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("NAME", durability, reductionAmounts, enchantability);

	/***/
	//End ArmorMaterials, Start Misc.
	/***/
	
	public static Item goldenStick;
    public static Item diamondStick;
    public static Item mysticStick;
	
    public static Item mysticIngot;
    public static Item magicIngot;
	public static Item flameWroughtIronIngot;
	public static Item flameWroughtGoldIngot;
	public static Item brightflameIngot;
	public static Item mysteriousIngot;
	public static Item mithrilIngot;
	public static Item terriumIngot;
	public static Item skyIronIngot;
	public static Item toslotriumIngot;
	public static Item brightsteelIngot;
	public static Item mortiumIngot;
	
	public static Item mixedIngot;
    
    public static Item lavaInfusedDiamond;
    
    public static Item mysticApple;
    public static Item brightflameApple;
    public static Item mysteriousApple;
    
    public static Item magicNugget;
    
    /***/
    //End Misc, Start Tools
    /***/
    
    //Swords
    public static Item lavaInfusedDiamondSword;
    public static Item mysticSword;
    public static Item magicSword;
    public static Item terriumSword;
    public static Item skyIronSword;
    public static Item brightflameSword;
    
    //Tool Groups
    public static Item lavaInfusedDiamondPickaxe;
	public static Item lavaInfusedDiamondAxe;
	public static Item lavaInfusedDiamondSpade;
	public static Item lavaInfusedDiamondHoe;
	 
	public static Item mysticPickaxe;
	public static Item mysticAxe;
	public static Item mysticSpade;
	public static Item mysticHoe;
	
	public static Item magicPickaxe;
	public static Item magicAxe;
	public static Item magicSpade;
	public static Item magicHoe;
	
	public static Item terriumPickaxe;
	public static Item terriumAxe;
	public static Item terriumSpade;
	public static Item terriumHoe;
	
	public static Item skyIronPickaxe;
	public static Item skyIronAxe;
	public static Item skyIronSpade;
	public static Item skyIronHoe;
	
	public static Item brightflamePickaxe;
	public static Item brightflameAxe;
	public static Item brightflameSpade;
	public static Item brightflameHoe;
	
	/***/
	//end Tools, start Armor
	/***/
	
	public static Item lavaInfusedDiamondHelmet;
	public static Item lavaInfusedDiamondChestplate;
	public static Item lavaInfusedDiamondLeggings;
	public static Item lavaInfusedDiamondBoots;
	
	public static Item terriumHelmet;
	public static Item terriumChestplate;
	public static Item terriumLeggings;
	public static Item terriumBoots;
	
	public static Item mysticHelmet;
	public static Item mysticChestplate;
	public static Item mysticLeggings;
	public static Item mysticBoots;
	
	public static Item stoneHelmet;
	public static Item stoneChestplate;
	public static Item stoneLeggings;
	public static Item stoneBoots;
	
	public static Item skyIronHelmet;
	public static Item skyIronChestplate;
	public static Item skyIronLeggings;
	public static Item skyIronBoots;
	
	public static Item magicHelmet;
	public static Item magicChestplate;
	public static Item magicLeggings;
	public static Item magicBoots;
	
	public static Item brightflameHelmet;
	public static Item brightflameChestplate;
	public static Item brightflameLeggings;
	public static Item brightflameBoots;
	
	public static Item mortiumHelmet;
	public static Item mortiumChestplate;
	public static Item mortiumLeggings;
	public static Item mortiumBoots;
	
	public static Item justice;
	public static Item corruption;
	
	public static Item backpack;
	
	public static Item vividiumIngot;

	/***/
	//End Armor
	/***/
	
	public static Item vividiumPickaxe;
	public static Item vividiumAxe;
	public static Item vividiumSpade;
	public static Item vividiumSword;
	public static Item vividiumHoe;
	
	public static Item mortiumPickaxe;
	public static Item mortiumAxe;
	public static Item mortiumSpade;
	public static Item mortiumSword;
	public static Item mortiumHoe;
	
    public static void initializeItem() {
    	mysticIngot = new MysticIngot();
    	mysticApple = new MysticApple(20, 10f, false);
    	brightflameApple = new BrightflameApple(8, 10f, false);
    	
    	goldenStick = new GoldenStick();
    	diamondStick = new DiamondStick();
    	magicNugget = new MagicNugget();
    	magicIngot = new MagicIngot();
    	lavaInfusedDiamond = new LavaInfusedDiamond();
    	
    	lavaInfusedDiamondPickaxe = new LavaInfusedDiamondPickaxe(ToolMaterials.INFUSEDDIAMOND);
    	lavaInfusedDiamondAxe = new LavaInfusedDiamondAxe(ToolMaterials.INFUSEDDIAMOND);
    	lavaInfusedDiamondSpade = new LavaInfusedDiamondSpade(ToolMaterials.INFUSEDDIAMOND);
    	lavaInfusedDiamondSword = new LavaInfusedDiamondSword(ToolMaterials.INFUSEDDIAMOND);
    	lavaInfusedDiamondHoe = new LavaInfusedDiamondHoe(ToolMaterials.INFUSEDDIAMOND);

    	mysticPickaxe = new MysticPickaxe(ToolMaterials.MYSTIC);
    	mysticAxe = new MysticAxe(ToolMaterials.MYSTIC);
    	mysticSpade = new MysticSpade(ToolMaterials.MYSTIC);
    	mysticSword = new MysticSword(ToolMaterials.MYSTIC);
    	mysticHoe = new MysticHoe(ToolMaterials.MYSTIC);
    	flameWroughtIronIngot = new FlameWroughtIronIngot();
    	flameWroughtGoldIngot = new FlameWroughtGoldIngot();
    	brightflameIngot = new BrightflameIngot();
    	mysteriousApple = new MysteriousApple(10, 10f, true);
    	// food setup (healamount, saturationmodifer, tamablewolf(T,F)
    	mysteriousIngot = new MysteriousIngot();
    	mixedIngot = new MixedIngot();
    	mithrilIngot = new MithrilIngot();
    	
    	magicPickaxe = new MagicPickaxe(ToolMaterials.MAGIC);
    	magicAxe = new MagicAxe(ToolMaterials.MAGIC);
    	magicSpade = new MagicSpade(ToolMaterials.MAGIC);
    	magicHoe = new MagicHoe(ToolMaterials.MAGIC);
    	magicSword = new MagicSword(ToolMaterials.MAGIC);
    	
    	lavaInfusedDiamondHelmet = new LavaInfusedDiamondArmor(ArmorMaterials.INFUSEDDIAMONDARMOR, MainRegistry.proxy.addArmor("LavaInfusedDiamondHelmet"), 0).setUnlocalizedName("LavaInfusedDiamondHelmet").setCreativeTab(CreativeTabsManager.tabMysticCombat)/*.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_helmet")*/;				
    	lavaInfusedDiamondChestplate = new LavaInfusedDiamondArmor(ArmorMaterials.INFUSEDDIAMONDARMOR, MainRegistry.proxy.addArmor("LavaInfusedDiamondChestplate"), 1).setUnlocalizedName("LavaInfusedDiamondChestplate").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_chestplate");			
    	lavaInfusedDiamondLeggings = new LavaInfusedDiamondArmor(ArmorMaterials.INFUSEDDIAMONDARMOR, MainRegistry.proxy.addArmor("LavaInfusedDiamondLeggings"), 2).setUnlocalizedName("LavaInfusedDiamondLeggings").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_leggings");
    	lavaInfusedDiamondBoots = new LavaInfusedDiamondArmor(ArmorMaterials.INFUSEDDIAMONDARMOR, MainRegistry.proxy.addArmor("LavaInfusedDiamondBoots"), 3).setUnlocalizedName("LavaInfusedDiamondBoots").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":lava_infused_diamond_boots");
    	terriumIngot = new TerriumIngot();
    	terriumPickaxe = new TerriumPickaxe(ToolMaterials.TERRIUM);
    	terriumAxe = new TerriumAxe(ToolMaterials.TERRIUM);
    	terriumSpade = new TerriumSpade(ToolMaterials.TERRIUM);
    	terriumHelmet = new TerriumArmor(ArmorMaterials.TERRIUMARMOR, MainRegistry.proxy.addArmor("TerriumHelmet"), 0).setUnlocalizedName("TerriumHelmet").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":terrium_helmet");				
    	terriumChestplate = new TerriumArmor(ArmorMaterials.TERRIUMARMOR, MainRegistry.proxy.addArmor("TerriumChestplate"), 1).setUnlocalizedName("TerriumChestplate").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":terrium_chestplate");			
    	terriumLeggings = new TerriumArmor(ArmorMaterials.TERRIUMARMOR, MainRegistry.proxy.addArmor("TerriumLeggings"), 2).setUnlocalizedName("TerriumLeggings").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":terrium_leggings");			
    	terriumBoots = new TerriumArmor(ArmorMaterials.TERRIUMARMOR, MainRegistry.proxy.addArmor("TerriumBoots"), 3).setUnlocalizedName("TerriumBoots").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":terrium_boots");			
    	terriumHoe = new TerriumHoe(ToolMaterials.TERRIUM);
    	terriumSword = new TerriumSword(ToolMaterials.TERRIUM);
    	
    	mysticHelmet = new MysticArmor(ArmorMaterials.MYSTICARMOR, MainRegistry.proxy.addArmor("MysticHelmet"), 0).setUnlocalizedName("MysticHelmet").setCreativeTab(CreativeTabsManager.tabMysticCombat);//./setTextureName(StringLibrary.MODID + ":mystic_helmet");				
    	mysticChestplate = new MysticArmor(ArmorMaterials.MYSTICARMOR, MainRegistry.proxy.addArmor("MysticChestplate"), 1).setUnlocalizedName("MysticChestplate").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":mystic_chestplate");			
    	mysticLeggings = new MysticArmor(ArmorMaterials.MYSTICARMOR, MainRegistry.proxy.addArmor("MysticLeggings"), 2).setUnlocalizedName("MysticLeggings").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":mystic_leggings");			
    	mysticBoots = new MysticArmor(ArmorMaterials.MYSTICARMOR, MainRegistry.proxy.addArmor("MysticBoots"), 3).setUnlocalizedName("MysticBoots").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":mystic_boots");
    	mysticStick = new MysticStick();
    	
    	

    	
    	skyIronIngot = new SkyIronIngot();
    	
    	stoneHelmet = new StoneArmor(ArmorMaterials.STONEARMOR, MainRegistry.proxy.addArmor("StoneHelmet"), 0).setUnlocalizedName("StoneHelmet").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":stone_helmet");				
    	stoneChestplate = new StoneArmor(ArmorMaterials.STONEARMOR, MainRegistry.proxy.addArmor("StoneChestplate"), 1).setUnlocalizedName("StoneChestplate").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":stone_chestplate");			
    	stoneLeggings = new StoneArmor(ArmorMaterials.STONEARMOR, MainRegistry.proxy.addArmor("StoneLeggings"), 2).setUnlocalizedName("StoneLeggings").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":stone_leggings");			
    	stoneBoots = new StoneArmor(ArmorMaterials.STONEARMOR, MainRegistry.proxy.addArmor("StoneBoots"), 3).setUnlocalizedName("StoneBoots").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":stone_boots");

    	skyIronHelmet = new SkyIronArmor(ArmorMaterials.SKYIRONARMOR, MainRegistry.proxy.addArmor("SkyIronHelmet"), 0).setUnlocalizedName("SkyIronHelmet").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":sky_iron_helmet");				
    	skyIronChestplate = new SkyIronArmor(ArmorMaterials.SKYIRONARMOR, MainRegistry.proxy.addArmor("SkyIronChestplate"), 1).setUnlocalizedName("SkyIronChestplate").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":sky_iron_chestplate");			
    	skyIronLeggings = new SkyIronArmor(ArmorMaterials.SKYIRONARMOR, MainRegistry.proxy.addArmor("SkyIronLeggings"), 2).setUnlocalizedName("SkyIronLeggings").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":sky_iron_leggings");			
    	skyIronBoots = new SkyIronArmor(ArmorMaterials.SKYIRONARMOR, MainRegistry.proxy.addArmor("SkyIronBoots"), 3).setUnlocalizedName("SkyIronBoots").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":sky_iron_boots");

    	skyIronPickaxe = new SkyIronPickaxe(ToolMaterials.SKYIRON);
    	skyIronAxe = new SkyIronAxe(ToolMaterials.SKYIRON);
    	skyIronSpade = new SkyIronSpade(ToolMaterials.SKYIRON);
    	skyIronSword = new SkyIronSword(ToolMaterials.SKYIRON);
    	skyIronHoe = new SkyIronHoe(ToolMaterials.SKYIRON);
    	
    	toslotriumIngot = new ToslotriumIngot();
    	magicHelmet = new MagicArmor(ArmorMaterials.MAGICARMOR, MainRegistry.proxy.addArmor("MagicHelmet"), 0).setUnlocalizedName("MagicHelmet").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":magic_helmet");				
    	magicChestplate = new MagicArmor(ArmorMaterials.MAGICARMOR, MainRegistry.proxy.addArmor("MagicChestplate"), 1).setUnlocalizedName("MagicChestplate").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":magic_chestplate");			
    	magicLeggings = new MagicArmor(ArmorMaterials.MAGICARMOR, MainRegistry.proxy.addArmor("MagicLeggings"), 2).setUnlocalizedName("MagicLeggings").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":magic_leggings");			
    	magicBoots = new MagicArmor(ArmorMaterials.MAGICARMOR, MainRegistry.proxy.addArmor("MagicBoots"), 3).setUnlocalizedName("MagicBoots").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":magic_boots");
    	brightflamePickaxe = new BrightflamePickaxe(ToolMaterials.BRIGHTFLAME);
    	brightflameAxe = new BrightflameAxe(ToolMaterials.BRIGHTFLAME);
    	brightflameSpade = new BrightflameSpade(ToolMaterials.BRIGHTFLAME);
    	brightflameHoe = new BrightflameHoe(ToolMaterials.BRIGHTFLAME);
    	brightflameSword = new BrightflameSword(ToolMaterials.BRIGHTFLAME);
    	brightflameHelmet = new BrightflameArmor(ArmorMaterials.MAGICARMOR, MainRegistry.proxy.addArmor("BrightflameHelmet"), 0).setUnlocalizedName("BrightflameHelmet").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":brightflame_helmet");				
    	brightflameChestplate = new BrightflameArmor(ArmorMaterials.MAGICARMOR, MainRegistry.proxy.addArmor("BrightflameChestplate"), 1).setUnlocalizedName("BrightflameChestplate").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":brightflame_chestplate");			
    	brightflameLeggings = new BrightflameArmor(ArmorMaterials.MAGICARMOR, MainRegistry.proxy.addArmor("BrightflameLeggings"), 2).setUnlocalizedName("BrightflameLeggings").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":brightflame_leggings");			
    	brightflameBoots = new BrightflameArmor(ArmorMaterials.MAGICARMOR, MainRegistry.proxy.addArmor("BrightflameBoots"), 3).setUnlocalizedName("BrightflameBoots").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":brightflame_boots");

    	brightsteelIngot = new BrightsteelIngot();
    	mortiumIngot = new MortiumIngot();
    	mortiumHelmet = new BrightflameArmor(ArmorMaterials.MORTIUMARMOR, MainRegistry.proxy.addArmor("MortiumHelmet"), 0).setUnlocalizedName("MortiumHelmet").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":mortium_helmet");				
    	mortiumChestplate = new BrightflameArmor(ArmorMaterials.MORTIUMARMOR, MainRegistry.proxy.addArmor("MortiumChestplate"), 1).setUnlocalizedName("MortiumChestplate").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":mortium_chestplate");			
    	mortiumLeggings = new BrightflameArmor(ArmorMaterials.MORTIUMARMOR, MainRegistry.proxy.addArmor("MortiumLeggings"), 2).setUnlocalizedName("MortiumLeggings").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":mortium_leggings");			
    	mortiumBoots = new BrightflameArmor(ArmorMaterials.MORTIUMARMOR, MainRegistry.proxy.addArmor("MortiumBoots"), 3).setUnlocalizedName("MortiumBoots").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":mortium_boots");
    	justice = new Justice(ToolMaterials.MAGIC).setUnlocalizedName("Justice").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":justice");
    	corruption = new Justice(ToolMaterials.MAGIC).setUnlocalizedName("Corruption").setCreativeTab(CreativeTabsManager.tabMysticCombat);//.setTextureName(StringLibrary.MODID + ":corruption");
    	backpack = new Backpack(ArmorMaterials.backpackMaterial, backpackRenderIndex, 1).setUnlocalizedName("Backpack").setCreativeTab(CreativeTabsManager.tabStorage);
    
    	vividiumIngot = new VividiumIngot();
    	
    	vividiumPickaxe = new VividiumMortiumPickaxe(ToolMaterials.MORTIUM).setUnlocalizedName("VividiumPickaxe");//.setTextureName(StringLibrary.MODID + ":vividium_pickaxe");
    	vividiumAxe = new VivdiumMortiumAxe(ToolMaterials.MORTIUM).setUnlocalizedName("VividiumAxe");//;.setTextureName(StringLibrary.MODID + ":vividium_axe");
    	vividiumSpade = new VividiumMortiumSpade(ToolMaterials.MORTIUM).setUnlocalizedName("VividiumSpade");//.setTextureName(StringLibrary.MODID + ":vividium_shovel");
    	vividiumSword = new VividiumMortiumSword(ToolMaterials.MORTIUM).setUnlocalizedName("VividiumSword");//.setTextureName(StringLibrary.MODID + ":vividium_sword");
    	vividiumHoe = new VividiumMortiumHoe(ToolMaterials.MORTIUM).setUnlocalizedName("VividiumHoe");//.setTextureName(StringLibrary.MODID + ":vividium_hoe");
    	
    	mortiumPickaxe = new VividiumMortiumPickaxe(ToolMaterials.MORTIUM).setUnlocalizedName("MortiumPickaxe");//.setTextureName(StringLibrary.MODID + ":mortium_pickaxe");
    	mortiumAxe = new VivdiumMortiumAxe(ToolMaterials.MORTIUM).setUnlocalizedName("MortiumAxe");//.setTextureName(StringLibrary.MODID + ":mortium_axe");
    	mortiumSpade = new VividiumMortiumSpade(ToolMaterials.MORTIUM).setUnlocalizedName("MortiumSpade");//.setTextureName(StringLibrary.MODID + ":mortium_shovel");
    	mortiumSword = new VividiumMortiumSword(ToolMaterials.MORTIUM).setUnlocalizedName("MortiumSword");//.setTextureName(StringLibrary.MODID + ":mortium_sword");
    	mortiumHoe = new VividiumMortiumHoe(ToolMaterials.MORTIUM).setUnlocalizedName("MortiumHoe");//.setTextureName(StringLibrary.MODID + ":mortium_hoe");
    }
 
   /* public static void registerItem() {

        GameRegistry.registerItem(mysticIngot, mysticIngot.getUnlocalizedName());
        GameRegistry.registerItem(mysticApple, mysticApple.getUnlocalizedName());
        GameRegistry.registerItem(goldenStick, goldenStick.getUnlocalizedName());
        GameRegistry.registerItem(diamondStick, diamondStick.getUnlocalizedName());
        GameRegistry.registerItem(magicNugget, magicNugget.getUnlocalizedName());
        GameRegistry.registerItem(magicIngot, magicIngot.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamond, lavaInfusedDiamond.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondPickaxe, lavaInfusedDiamondPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondSpade, lavaInfusedDiamondSpade.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondAxe, lavaInfusedDiamondAxe.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondSword, lavaInfusedDiamondSword.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondHoe, lavaInfusedDiamondHoe.getUnlocalizedName());
        GameRegistry.registerItem(mysticPickaxe, mysticPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(mysticAxe, mysticAxe.getUnlocalizedName());
        GameRegistry.registerItem(mysticSpade, mysticSpade.getUnlocalizedName());
        GameRegistry.registerItem(mysticSword, mysticSword.getUnlocalizedName());
        GameRegistry.registerItem(mysticHoe, mysticHoe.getUnlocalizedName());
        GameRegistry.registerItem(flameWroughtIronIngot, flameWroughtIronIngot.getUnlocalizedName());
        GameRegistry.registerItem(flameWroughtGoldIngot, flameWroughtGoldIngot.getUnlocalizedName());
        GameRegistry.registerItem(brightflameApple, brightflameApple.getUnlocalizedName());
        GameRegistry.registerItem(brightflameIngot, brightflameIngot.getUnlocalizedName());
        GameRegistry.registerItem(mysteriousApple, mysteriousApple.getUnlocalizedName());
        GameRegistry.registerItem(mysteriousIngot, mysteriousIngot.getUnlocalizedName());
        GameRegistry.registerItem(mixedIngot, mixedIngot.getUnlocalizedName());
        GameRegistry.registerItem(mithrilIngot, mithrilIngot.getUnlocalizedName());
        GameRegistry.registerItem(magicPickaxe, magicPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(magicAxe, magicAxe.getUnlocalizedName());
        GameRegistry.registerItem(magicSpade, magicSpade.getUnlocalizedName());
        GameRegistry.registerItem(magicHoe, magicHoe.getUnlocalizedName());
        GameRegistry.registerItem(magicSword, magicSword.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondHelmet, lavaInfusedDiamondHelmet.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondChestplate, lavaInfusedDiamondChestplate.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondLeggings, lavaInfusedDiamondLeggings.getUnlocalizedName());
        GameRegistry.registerItem(lavaInfusedDiamondBoots, lavaInfusedDiamondBoots.getUnlocalizedName());
        GameRegistry.registerItem(terriumIngot, terriumIngot.getUnlocalizedName());
        GameRegistry.registerItem(terriumPickaxe, terriumPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(terriumAxe, terriumAxe.getUnlocalizedName());
        GameRegistry.registerItem(terriumSpade, terriumSpade.getUnlocalizedName());
        GameRegistry.registerItem(terriumHelmet, terriumHelmet.getUnlocalizedName());
        GameRegistry.registerItem(terriumChestplate, terriumChestplate.getUnlocalizedName());
        GameRegistry.registerItem(terriumLeggings, terriumLeggings.getUnlocalizedName());
        GameRegistry.registerItem(terriumBoots, terriumBoots.getUnlocalizedName());
        GameRegistry.registerItem(terriumHoe, terriumHoe.getUnlocalizedName());
        GameRegistry.registerItem(terriumSword, terriumSword.getUnlocalizedName());
        GameRegistry.registerItem(mysticHelmet, mysticHelmet.getUnlocalizedName());
        GameRegistry.registerItem(mysticChestplate, mysticChestplate.getUnlocalizedName());
        GameRegistry.registerItem(mysticLeggings, mysticLeggings.getUnlocalizedName());
        GameRegistry.registerItem(mysticBoots, mysticBoots.getUnlocalizedName());
        GameRegistry.registerItem(mysticStick, mysticStick.getUnlocalizedName());
        GameRegistry.registerItem(skyIronIngot, skyIronIngot.getUnlocalizedName());
        GameRegistry.registerItem(stoneHelmet, stoneHelmet.getUnlocalizedName());
        GameRegistry.registerItem(stoneChestplate, stoneChestplate.getUnlocalizedName());
        GameRegistry.registerItem(stoneLeggings, stoneLeggings.getUnlocalizedName());
        GameRegistry.registerItem(stoneBoots, stoneBoots.getUnlocalizedName());
        GameRegistry.registerItem(skyIronHelmet, skyIronHelmet.getUnlocalizedName());
        GameRegistry.registerItem(skyIronChestplate, skyIronChestplate.getUnlocalizedName());
        GameRegistry.registerItem(skyIronLeggings, skyIronLeggings.getUnlocalizedName());
        GameRegistry.registerItem(skyIronBoots, skyIronBoots.getUnlocalizedName());
        GameRegistry.registerItem(skyIronPickaxe, skyIronPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(skyIronAxe, skyIronAxe.getUnlocalizedName());
        GameRegistry.registerItem(skyIronSpade, skyIronSpade.getUnlocalizedName());
        GameRegistry.registerItem(skyIronSword, skyIronSword.getUnlocalizedName());
        GameRegistry.registerItem(skyIronHoe, skyIronHoe.getUnlocalizedName());
        GameRegistry.registerItem(toslotriumIngot, toslotriumIngot.getUnlocalizedName());
        GameRegistry.registerItem(magicHelmet, magicHelmet.getUnlocalizedName());
        GameRegistry.registerItem(magicChestplate, magicChestplate.getUnlocalizedName());
        GameRegistry.registerItem(magicLeggings, magicLeggings.getUnlocalizedName());
        GameRegistry.registerItem(magicBoots, magicBoots.getUnlocalizedName());
        GameRegistry.registerItem(brightflamePickaxe, brightflamePickaxe.getUnlocalizedName());
        GameRegistry.registerItem(brightflameAxe, brightflameAxe.getUnlocalizedName());
        GameRegistry.registerItem(brightflameSpade, brightflameSpade.getUnlocalizedName());
        GameRegistry.registerItem(brightflameHoe, brightflameHoe.getUnlocalizedName());
        GameRegistry.registerItem(brightflameSword, brightflameSword.getUnlocalizedName());
        GameRegistry.registerItem(brightflameHelmet, brightflameHelmet.getUnlocalizedName());
        GameRegistry.registerItem(brightflameChestplate, brightflameChestplate.getUnlocalizedName());
        GameRegistry.registerItem(brightflameLeggings, brightflameLeggings.getUnlocalizedName());
        GameRegistry.registerItem(brightflameBoots, brightflameBoots.getUnlocalizedName());
        GameRegistry.registerItem(brightsteelIngot, brightsteelIngot.getUnlocalizedName());
        GameRegistry.registerItem(mortiumIngot, mortiumIngot.getUnlocalizedName());
        GameRegistry.registerItem(mortiumHelmet, mortiumHelmet.getUnlocalizedName());
        GameRegistry.registerItem(mortiumChestplate, mortiumChestplate.getUnlocalizedName());
        GameRegistry.registerItem(mortiumLeggings, mortiumLeggings.getUnlocalizedName());
        GameRegistry.registerItem(mortiumBoots, mortiumBoots.getUnlocalizedName());
        GameRegistry.registerItem(justice, justice.getUnlocalizedName());
        GameRegistry.registerItem(corruption, corruption.getUnlocalizedName());
        GameRegistry.registerItem(backpack, backpack.getUnlocalizedName());
        GameRegistry.registerItem(vividiumIngot, vividiumIngot.getUnlocalizedName());
        
        GameRegistry.registerItem(vividiumPickaxe, vividiumPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(vividiumAxe, vividiumAxe.getUnlocalizedName());
        GameRegistry.registerItem(vividiumSpade, vividiumSpade.getUnlocalizedName());
        GameRegistry.registerItem(vividiumSword, vividiumSword.getUnlocalizedName());
        GameRegistry.registerItem(vividiumHoe, vividiumHoe.getUnlocalizedName());
        
        GameRegistry.registerItem(mortiumPickaxe, mortiumPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(mortiumAxe, mortiumAxe.getUnlocalizedName());
        GameRegistry.registerItem(mortiumSpade, mortiumSpade.getUnlocalizedName());
        GameRegistry.registerItem(mortiumSword, mortiumSword.getUnlocalizedName());
        GameRegistry.registerItem(mortiumHoe, mortiumHoe.getUnlocalizedName());
        
    }*/
}