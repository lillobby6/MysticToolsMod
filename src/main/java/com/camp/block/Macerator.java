/*package com.camp.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.camp.lib.ByteLibrary;
import com.camp.lib.StringLibrary;
import com.camp.main.MainRegistry;
import com.camp.tileEntity.TileEntityMacerator;

public class Macerator extends BlockContainer{

		private Random rand = new Random();
		
		private final boolean isActive;
		
		@SideOnly(Side.CLIENT)
		private IIcon iconFront;
		
		private static boolean keepInventory;
		
		protected Macerator(boolean isActive)
		{
			super(Material.rock);
			this.isActive = isActive;
			this.setHardness(15F);
			this.setResistance(15F);
			
		}
		
		public void addTag(ItemStack itemStack, EntityPlayer player, List list, boolean b)
		{
		    list.add("SMASH!");
		}
		
		@SideOnly(Side.CLIENT)
		public void registerBlockIcons(IIconRegister iconRegister)
		{
			this.blockIcon = iconRegister.registerIcon(StringLibrary.MODID + ":macerator_side");
			this.iconFront = iconRegister.registerIcon(StringLibrary.MODID + (this.isActive ? ":macerator_front_active" : ":macerator_front_idle"));
		}
		
		@SideOnly(Side.CLIENT)
		public IIcon getIcon(int side, int metadata){
			return metadata == 0 && side == 3 ? this.iconFront : (side == metadata ? this.iconFront : this.blockIcon);
		}
		
		public Item getItemDropped(int par1, Random random, int par3)
		{
			return Item.getItemFromBlock(BlockManager.maceratorIdle);
		}
		public void onBlockAdded(World world, int x, int y, int z){
			super.onBlockAdded(world, x, y, z);
			this.setDefaultDirection(world, x, y, z);
		}
		/**Sets the default direction.*
		private void setDefaultDirection(World world, int x, int y, int z){
			if(!world.isRemote){
				Block block1 = world.getBlock(x, y, z - 1);
				Block block2 = world.getBlock(x, y, z + 1);
				Block block3 = world.getBlock(x - 1, y, z );
				Block block4 = world.getBlock(x + 1, y, z);
				byte b0 = 3; 
				
				if(block1.func_149730_j() && !block2.func_149730_j()){
					b0 = 3;
				}
				
				if(block2.func_149730_j() && !block1.func_149730_j()){
					b0 = 2;
				}
				
				if(block3.func_149730_j() && !block4.func_149730_j()){
					b0 = 5;
				}
				if(block4.func_149730_j() && !block3.func_149730_j()){
					b0 = 4;
					
				world.setBlockMetadataWithNotify(x, y, z, b0, 2);
				}
			}
			
		}
			@Override
			public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
				if(!world.isRemote)
				{
					
					FMLNetworkHandler.openGui(player, MainRegistry.instance, ByteLibrary.GUI_MACERATOR, world, x, y, z);
					
				}
				
				return true;
				
				}

		
		
			@Override
			public TileEntity createNewTileEntity(World world, int i) {
				return new TileEntityMacerator();
				
				
				
			}
			/*@Override
			@SideOnly(Side.CLIENT)
			public void randomDisplayTick(World world, int x, int y, int z, Random random)
			{
				if(this.isActive)
				{
					int direction = world.getBlockMetadata(x, y, z);
					
					float x1 = (float)x + 0.5F;
					float y1 = (float)y + random.nextFloat();
					float z1 = (float)z + 0.5F;
					
					float f = 0.52F;
					float f1 = random.nextFloat() * 0.6F - 0.3F;
					
					if(direction == 4)
					{
						world.spawnParticle("smoke", (double)(x1 - f), (double)(y1), (double)(z1 + f1), 0.0D, 0.0D, 0.0D);
						world.spawnParticle("flame", (double)(x1 - f), (double)(y1), (double)(z1 + f1), 0.0D, 0.0D, 0.0D);
						world.spawnParticle("reddust", (double)(x1 - f), (double)(y1), (double)(z1 + f1), 0.0D, 0.0D, 0.0D);

					}
					else if(direction == 5)
					{
						world.spawnParticle("smoke", (double)(x1 + f), (double)(y1), (double)(z1 + f1), 0.0D, 0.0D, 0.0D);
						world.spawnParticle("flame", (double)(x1 + f), (double)(y1), (double)(z1 + f1), 0.0D, 0.0D, 0.0D);
						world.spawnParticle("reddust", (double)(x1 + f), (double)(y1), (double)(z1 + f1), 0.0D, 0.0D, 0.0D);

					}
					else if(direction == 2)
					{
						world.spawnParticle("smoke", (double)(x1 + f1), (double)(y1), (double)(z1 - f), 0.0D, 0.0D, 0.0D);
						world.spawnParticle("flame", (double)(x1 + f1), (double)(y1), (double)(z1 - f), 0.0D, 0.0D, 0.0D);
						world.spawnParticle("reddust", (double)(x1 + f1), (double)(y1), (double)(z1 - f), 0.0D, 0.0D, 0.0D);
					} 
					else if(direction == 3)
					{
						world.spawnParticle("smoke", (double)(x1 + f1), (double)(y1), (double)(z1 + f), 0.0D, 0.0D, 0.0D);
						world.spawnParticle("flame", (double)(x1 + f1), (double)(y1), (double)(z1 + f), 0.0D, 0.0D, 0.0D);
						world.spawnParticle("reddust", (double)(x1 + f1), (double)(y1), (double)(z1 + f), 0.0D, 0.0D, 0.0D);
					}
					
					
				}
			}*
			@Override
			public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemstack){
				int l = MathHelper.floor_double((double) (entityLivingBase.rotationYaw * 4.0F / 360.0F)+ 0.5D) & 3;
				
				if(l == 0){
					world.setBlockMetadataWithNotify(x, y, z, 2, 2);
				}
				
				if(l == 1){
					world.setBlockMetadataWithNotify(x, y, z, 5, 2);
				}
				if(l == 2){
					world.setBlockMetadataWithNotify(x, y, z, 3, 2);
				}
				
				if(l == 3){
					world.setBlockMetadataWithNotify(x, y, z, 4, 2);
				}
				
				if(itemstack.hasDisplayName()){
					((TileEntityMacerator)world.getTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
				}
			}
			
			public static void updateMaceratorBlockState(boolean active, World worldObj, int xCoord, int yCoord, int zCoord)
			{
				int i = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
				
				TileEntity tileentity = worldObj.getTileEntity(xCoord, yCoord, zCoord);
				keepInventory = true;
				
				if(active)
				{
					worldObj.setBlock(xCoord, yCoord, zCoord, BlockManager.maceratorActive);
				}
				else
					worldObj.setBlock(xCoord, yCoord, zCoord, BlockManager.maceratorIdle);
				
				keepInventory = false;
				
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);
				
				if(tileentity != null)
				{
					tileentity.validate();
						worldObj.setTileEntity(xCoord, yCoord, zCoord, tileentity);
					
					
				}
			}

			@Override
			public void breakBlock(World world, int x, int y, int z, Block oldBlock, int oldMetadata)
			{
				if(!keepInventory)
				{
					TileEntityMacerator tileentity = (TileEntityMacerator) world.getTileEntity(x, y, z);
					
					if(tileentity != null)
					{
						for(int i = 0; i < tileentity.getSizeInventory(); i++)
						{
							ItemStack itemstack = tileentity.getStackInSlot(i);
							
							if(itemstack != null)
							{
								float f = this.rand.nextFloat() * 0.8f + 0.1f;
								float f1 = this.rand.nextFloat() * 0.8f + 0.1f;
								float f2 = this.rand.nextFloat() * 0.8f + 0.1f;
								
								while (itemstack.stackSize > 0)
		                        {
		                            int j1 = this.rand.nextInt(21) + 10;

		                            if (j1 > itemstack.stackSize)
		                            {
		                                j1 = itemstack.stackSize;
		                            }

		                            itemstack.stackSize -= j1;
		                            EntityItem entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

		                            if (itemstack.hasTagCompound())
		                            {
		                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
		                            }

		                            float f3 = 0.05F;
		                            entityitem.motionX = (double)((float)this.rand.nextGaussian() * f3);
		                            entityitem.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
		                            entityitem.motionZ = (double)((float)this.rand.nextGaussian() * f3);
		                            world.spawnEntityInWorld(entityitem);
		                        }
							}
						}
						
						world.func_147453_f(x, y, z, oldBlock);
					}
				}
				
				super.breakBlock(world, x, y, z, oldBlock, oldMetadata);
			}
			
			@Override
			public boolean hasComparatorInputOverride()
			{
				return true;
			}
			
			@Override
			public int getComparatorInputOverride(World world, int x, int y, int z, int i)
			{
				return Container.calcRedstoneFromInventory((IInventory)world.getTileEntity(x, y, z));
			}
			

			public Item getItem(World world, int x, int y, int z)
			{
				return Item.getItemFromBlock(BlockManager.maceratorIdle);
			}
		
}*/
