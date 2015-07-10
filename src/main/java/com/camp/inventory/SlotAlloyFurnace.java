package com.camp.inventory;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class SlotAlloyFurnace extends Slot
{
    /** The player that is using the GUI where this slot resides. */
    private EntityPlayer thePlayer;
    private int i;
    private static final String __OBFID = "CL_00001749";

    public SlotAlloyFurnace(EntityPlayer entity, IInventory inventory, int x, int y, int z)
    {
        super(inventory, x, y, z);
        this.thePlayer = entity;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack itemstack)
    {
        return false;
    }

    /**
     * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new
     * stack.
     */
   /*////////////////////////////////// public ItemStack decrStackSize(int par1)
    {
        if (this.getHasStack())
        {
            this.i += Math.min(par1, this.getStack().stackSize);
        }

        return super.decrStackSize(par1);
    }

    public void onPickupFromSlot(EntityPlayer entity, ItemStack itemstack)
    {
        this.onCrafting(itemstack);
        super.onPickupFromSlot(entity, itemstack);
    }

    /**
     * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood. Typically increases an
     * internal count then calls onCrafting(item).
     */
    protected void onCrafting(ItemStack itemstack, int par2)
    {
        this.i += par2;
        this.onCrafting(itemstack);
    }

    /**
     * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood.
     *
    protected void onCrafting(ItemStack p_75208_1_)
    {
        p_75208_1_.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.i);

        if (!this.thePlayer.worldObj.isRemote)
        {
            int i = this.i;
            float f = FurnaceRecipes.smelting().func_151398_b(p_75208_1_);
            int j;

            if (f == 0.0F)
            {
                i = 0;
            }
            else if (f < 1.0F)
            {
                j = MathHelper.floor_float((float)i * f);

                if (j < MathHelper.ceiling_float_int((float)i * f) && (float)Math.random() < (float)i * f - (float)j)
                {
                    ++j;
                }

                i = j;
            }

            while (i > 0)
            {
                j = EntityXPOrb.getXPSplit(i);
                i -= j;
                this.thePlayer.worldObj.spawnEntityInWorld(new EntityXPOrb(this.thePlayer.worldObj, this.thePlayer.posX, this.thePlayer.posY + 0.5D, this.thePlayer.posZ + 0.5D, j));
            }
        }

        this.i = 0;

        FMLCommonHandler.instance().firePlayerSmeltedEvent(thePlayer, p_75208_1_);

        /*if (p_75208_1_.getItem() == Items.iron_ingot)
        {
            this.thePlayer.addStat(AchievementList.acquireIron, 1);
        }

        if (p_75208_1_.getItem() == Items.cooked_fished)
        {
            this.thePlayer.addStat(AchievementList.cookFish, 1);
        }*/
    //}
}