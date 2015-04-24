package com.camp.lib;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterials {
	public static ArmorMaterial INFUSEDDIAMONDARMOR = EnumHelper.addArmorMaterial("INFUSEDDIAMONDARMOR", 8000, new int []{5, 10, 8, 5}, 20);
	public static ArmorMaterial TERRIUMARMOR = EnumHelper.addArmorMaterial("TERRIUMARMOR", 3124, new int []{4, 9, 7, 4}, 17);
	public static ArmorMaterial MYSTICARMOR = EnumHelper.addArmorMaterial("MYSTICARMOR", 12000, new int[]{7, 12, 10, 7}, 30);
	public static ArmorMaterial STONEARMOR = EnumHelper.addArmorMaterial("STONEARMOR", 132, new int[]{1, 4, 3, 1}, 5);
	public static ArmorMaterial SKYIRONARMOR = EnumHelper.addArmorMaterial("SKYIRONARMOR", 600, new int[]{3, 7, 5, 3}, 20);
	public static ArmorMaterial MAGICARMOR = EnumHelper.addArmorMaterial("MAGICARMOR", 15000, new int []{9, 15, 12, 9}, 30);
	public static ArmorMaterial MORTIUMARMOR = EnumHelper.addArmorMaterial("MORTIUMARMOR", 2161, new int []{3, 8, 6, 3}, 13);
	public static ArmorMaterial backpackMaterial = EnumHelper.addArmorMaterial("BackpackArmor", -1, new int[]{0, 0, 0, 0}, 0);

}
