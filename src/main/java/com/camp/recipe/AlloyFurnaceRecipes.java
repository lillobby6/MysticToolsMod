package com.camp.recipe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class AlloyFurnaceRecipes {
	 private static final AlloyFurnaceRecipes smeltingBase = new AlloyFurnaceRecipes();
	    /** The list of smelting results. */
	    private Map smeltingList = new HashMap();
	    private Map experienceList = new HashMap();
	    private static final String __OBFID = "CL_00000085";

	    /**
	     * Used to call methods addSmelting and getSmeltingResult.
	     */
	    public static AlloyFurnaceRecipes smelting()
	    {
	        return smeltingBase;
	    }

	    private AlloyFurnaceRecipes()
	    {
	        /*this.func_151393_a(Blocks.iron_ore, new ItemStack(Items.iron_ingot), 0.7F);
	        this.func_151393_a(Blocks.gold_ore, new ItemStack(Items.gold_ingot), 1.0F);
	        this.func_151393_a(Blocks.diamond_ore, new ItemStack(Items.diamond), 1.0F);
	        this.func_151393_a(Blocks.sand, new ItemStack(Blocks.glass), 0.1F);
	        this.func_151396_a(Items.porkchop, new ItemStack(Items.cooked_porkchop), 0.35F);
	        this.func_151396_a(Items.beef, new ItemStack(Items.cooked_beef), 0.35F);
	        this.func_151396_a(Items.chicken, new ItemStack(Items.cooked_chicken), 0.35F);
	        this.func_151393_a(Blocks.cobblestone, new ItemStack(Blocks.stone), 0.1F);
	        this.func_151396_a(Items.clay_ball, new ItemStack(Items.brick), 0.3F);
	        this.func_151393_a(Blocks.clay, new ItemStack(Blocks.hardened_clay), 0.35F);
	        this.func_151393_a(Blocks.cactus, new ItemStack(Items.dye, 1, 2), 0.2F);
	        this.func_151393_a(Blocks.log, new ItemStack(Items.coal, 1, 1), 0.15F);
	        this.func_151393_a(Blocks.log2, new ItemStack(Items.coal, 1, 1), 0.15F);
	        this.func_151393_a(Blocks.emerald_ore, new ItemStack(Items.emerald), 1.0F);
	        this.func_151396_a(Items.potato, new ItemStack(Items.baked_potato), 0.35F);
	        this.func_151393_a(Blocks.netherrack, new ItemStack(Items.netherbrick), 0.1F);
	        ItemFishFood.FishType[] afishtype = ItemFishFood.FishType.values();
	        int i = afishtype.length;

	        /*for (int j = 0; j < i; ++j)
	        {
	            ItemFishFood.FishType fishtype = afishtype[j];

	            if (fishtype.func_150973_i())
	            {
	                this.func_151394_a(new ItemStack(Items.fish, 1, fishtype.func_150976_a()), new ItemStack(Items.cooked_fished, 1, fishtype.func_150976_a()), 0.35F);
	            }
	        }*/

	        /*this.func_151393_a(Blocks.coal_ore, new ItemStack(Items.coal), 0.1F);
	        this.func_151393_a(Blocks.redstone_ore, new ItemStack(Items.redstone), 0.7F);
	        this.func_151393_a(Blocks.lapis_ore, new ItemStack(Items.dye, 1, 4), 0.2F);
	        this.func_151393_a(Blocks.quartz_ore, new ItemStack(Items.quartz), 0.2F);*/
	    }

	    /*public void createRecipeWithBlocks(Block block, Block block2, ItemStack stack, float experience)
	    {
	        this.func_151396_a(Item.getItemFromBlock(block), Item.getItemFromBlock(block2), stack, experience);
	    }*/

	    public void createRecipe(Item item1, Item item2, ItemStack itemstack, float experience)
	    {
	        this.recipe(new ItemStack(item1, 1, 32767), new ItemStack(item2, 1, 32767), itemstack, experience);
	    }

	    public void recipe(ItemStack itemstack, ItemStack itemstack2, ItemStack result, float experience)
	    {
	        //this.smeltingList.put(itemstack, itemstack2, result);
	        this.experienceList.put(result, Float.valueOf(experience));
	    }

	    /**
	     * Returns the smelting result of an item.
	     */
	    public ItemStack getAlloySmeltingResult(ItemStack p_151395_1_)
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
	        while (!this.func_151397_a(p_151395_1_, (ItemStack)entry.getKey()));

	        return (ItemStack)entry.getValue();
	    }

	    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
	    {
	        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
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
