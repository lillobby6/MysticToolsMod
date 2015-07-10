package com.camp.recipe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IronOverlayRecipes
{
    private static final IronOverlayRecipes smeltingBase = new IronOverlayRecipes();
    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private static final String __OBFID = "CL_00000085";

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static IronOverlayRecipes smelting()
    {
        return smeltingBase;
    }

    private IronOverlayRecipes()
    {
        this.smeltItem(Items.wooden_sword, new ItemStack(Items.iron_sword), 15);
    }

    public void smeltBlock(Block itemtobesmelted, ItemStack result, float experience)
    {
        this.smeltItem(Item.getItemFromBlock(itemtobesmelted), result, experience);
    }

    public void smeltItem(Item itemtobesmelted, ItemStack result, float experience)
    {
        this.smelt(new ItemStack(itemtobesmelted, 1, 32767), result, experience);
    }

    public void smelt(ItemStack itemtobesmelted, ItemStack result, float experience)
    {
        this.smeltingList.put(result, itemtobesmelted);
        this.experienceList.put(itemtobesmelted, Float.valueOf(experience));
    }

    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getSmeltingResult(ItemStack stack)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(stack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean func_151397_a(ItemStack stack, ItemStack stack2)
    {
        return stack2.getItem() == stack.getItem() && (stack2.getItemDamage() == 32767 || stack2.getItemDamage() == stack.getItemDamage());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    public float func_151398_b(ItemStack p_151398_1_)
    {
        float ret = p_151398_1_.getItem().getSmeltingExperience(p_151398_1_);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151398_1_, (ItemStack)entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}
	