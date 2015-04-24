package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsManager {
	public static void mainRegistry(){
        initializeTabs();
    }
 
    public static CreativeTabs tabMysticMaterials;
    public static CreativeTabs tabMysticBlocks;
    public static CreativeTabs tabMysticTools;
    public static CreativeTabs tabMysticFoods;
    public static CreativeTabs tabMysticCombat;
	public static CreativeTabs tabMysticMachines;
	public static CreativeTabs tabStorage;
 
    public static void initializeTabs(){
        tabMysticMaterials = new MysticTab("MysticTabMaterials");
        tabMysticBlocks = new MysticTabBlocks("MysticTabBlocks");
        tabMysticTools = new MysticTabTools("MysticTabTools");
        tabMysticFoods = new MysticTabFood("MysticTabFoods");
        tabMysticCombat = new MysticTabCombat("MysticTabCombat");
        tabMysticMachines = new MysticTabMachines("MysticTabMachines");
        tabStorage = new MysticTabStorage("MysticTabStorage");
    }
}