package com.camp.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.camp.tileEntity.TileEntityMacerator;

public class ContainerMacerator extends Container{

	
	private TileEntityMacerator macerator;
	
	/**How long this furnace will continue to burn.*/
	public int lastPower;
	
	/**The start time for this fuel.*/
	public int lastItemPower;
	
	/**How much time left before item cooked.*/
	public int lastCookTime;
	
	public ContainerMacerator(InventoryPlayer inventory, TileEntityMacerator tileentity)
	{
		this.macerator = tileentity;
		
		this.addSlotToContainer(new Slot(tileentity, 0, 56, 35));
		this.addSlotToContainer(new Slot(tileentity, 1, 8, 56));
		//this.addSlotToContainer(new SlotFurnace(inventory.player, tileentity, 2, 116, 35));
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9 , 8 + j * 18, 84 + i * 18 ));
			}
		}
		
		for(int i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
		}
	}
	
	public void addCraftingToCrafters(ICrafting icrafting)
	{
		super.addCraftingToCrafters(icrafting);
		icrafting.sendProgressBarUpdate(this, 0, this.macerator.cookTime);
		icrafting.sendProgressBarUpdate(this, 1, this.macerator.power);
	}
	
	public void detectAndSendChanges()
	{
		super.detectAndSendChanges();
		
		for(int i = 0; i < this.crafters.size(); i++)
		{
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			
			if(this.lastCookTime != this.macerator.cookTime)
			{
				icrafting.sendProgressBarUpdate(this, 0, this.macerator.cookTime);
			}
			
			if(this.lastPower != this.macerator.power)
			{
				icrafting.sendProgressBarUpdate(this, 1, this.macerator.power);
			}
			
			
		}
		this.lastCookTime = this.macerator.cookTime;
		this.lastPower = this.macerator.power;
		this.lastItemPower = this.macerator.maxPower;
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int slot, int newValue)
	{
		if(slot == 0)
		{
			this.macerator.cookTime = newValue;
		}
		if(slot == 1)
		{
			this.macerator.power = newValue;
		}
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int clickedSlotNumber)
	{
		
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(clickedSlotNumber);
		
		
		if(slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			
			if(clickedSlotNumber == 2)
			{
				if(!this.mergeItemStack(itemstack1, 3, 39, true))
				{
					return null;
				}
				slot.onSlotChange(itemstack1, itemstack);
			}
			else if(clickedSlotNumber != 1 && clickedSlotNumber != 0)
			{
			//	if(FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
				//{
					if(!this.mergeItemStack(itemstack1, 0, 1, false))
					{
						return null;
					}
			//	}
				else if(TileEntityMacerator.hasItemPower(itemstack1))
				{
					if(!this.mergeItemStack(itemstack1, 1, 2, false))
					{
						return null;
					}
				}
				else if(clickedSlotNumber >= 3 && clickedSlotNumber < 30)
				{
					if(!this.mergeItemStack(itemstack1, 30, 39, false))
					{
						return null;
					}
					
				}
				else if(clickedSlotNumber >= 30 && clickedSlotNumber <= 39)
				{
					if (!this.mergeItemStack(itemstack1, 3, 30, false))
					{
						return null;
					}
				}
			}
			else if(!this.mergeItemStack(itemstack1, 3, 30, false))
			{
				return null;
			}
			
			if(itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack)null);
			}
			else
			{
				slot.onSlotChanged();
			}
			
			if(itemstack1.stackSize == itemstack.stackSize)
			{
				return null;
			}
			slot.onPickupFromSlot(player, itemstack1);
		}
		
		
		return itemstack;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return this.macerator.isUseableByPlayer(entityplayer);
	}

}
