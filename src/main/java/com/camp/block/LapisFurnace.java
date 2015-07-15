package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.camp.lib.StringLibrary;
import com.camp.main.MainRegistry;
import com.camp.tileEntity.TileEntityLapisFurnace;

public class LapisFurnace extends BlockContainer{
	
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	private Random rand = new Random();
	
	private final boolean isActive;
	
	//@SideOnly(Side.CLIENT)
	//private IIcon iconFront;
	
	private static boolean keepInventory;
	
	protected LapisFurnace(boolean isActive)
	{
		super(Material.rock);
		this.isActive = isActive;
	}
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(StringLibrary.MODID + ":lapis_furnace_top");
		this.iconFront = iconRegister.registerIcon(StringLibrary.MODID + (this.isActive ? ":lapis_furnace_front_on" : ":lapis_furnace_front_off"));
	}*/
	
	/*@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata){
		return metadata == 0 && side == 3 ? this.iconFront : (side == metadata ? this.iconFront : this.blockIcon);
	}*/
	
	public Item getItemDropped(int par1, Random random, int par3)
	{
		return Item.getItemFromBlock(BlockManager.lapisFurnaceIdle);
	}
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        this.setDefaultFacing(worldIn, pos, state);
    }
	/**Sets the default direction.*/
	 private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (!worldIn.isRemote)
	        {
	            Block block = worldIn.getBlockState(pos.north()).getBlock();
	            Block block1 = worldIn.getBlockState(pos.south()).getBlock();
	            Block block2 = worldIn.getBlockState(pos.west()).getBlock();
	            Block block3 = worldIn.getBlockState(pos.east()).getBlock();
	            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

	            if (enumfacing == EnumFacing.NORTH && block.isFullBlock() && !block1.isFullBlock())
	            {
	                enumfacing = EnumFacing.SOUTH;
	            }
	            else if (enumfacing == EnumFacing.SOUTH && block1.isFullBlock() && !block.isFullBlock())
	            {
	                enumfacing = EnumFacing.NORTH;
	            }
	            else if (enumfacing == EnumFacing.WEST && block2.isFullBlock() && !block3.isFullBlock())
	            {
	                enumfacing = EnumFacing.EAST;
	            }
	            else if (enumfacing == EnumFacing.EAST && block3.isFullBlock() && !block2.isFullBlock())
	            {
	                enumfacing = EnumFacing.WEST;
	            }

	            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
	        }
	    }
	 @Override
	 	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	    {
	        if (worldIn.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	            TileEntityLapisFurnace tileentity = (TileEntityLapisFurnace) worldIn.getTileEntity(pos);

	            if (tileentity instanceof TileEntityLapisFurnace)
	            {
	                playerIn.displayGUIChest((TileEntityLapisFurnace)tileentity);
	            }

	            return true;
	        }
	    }

	
	
		@Override
		public TileEntity createNewTileEntity(World world, int i) {
			return new TileEntityLapisFurnace();
			
			
			
		}
		@Override
		@SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (this.isActive)
	        {
	            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
	            double d0 = (double)pos.getX() + 0.5D;
	            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
	            double d2 = (double)pos.getZ() + 0.5D;
	            double d3 = 0.52D;
	            double d4 = rand.nextDouble() * 0.6D - 0.3D;

	            switch (LapisFurnace.SwitchEnumFacing.FACING_LOOKUP[enumfacing.ordinal()])
	            {
	                case 1:
	                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
	                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
	                    break;
	                case 2:
	                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
	                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
	                    break;
	                case 3:
	                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
	                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
	                    break;
	                case 4:
	                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
	                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
	            }
	        }
	    }
		
		@SideOnly(Side.CLIENT)
	    static final class SwitchEnumFacing
	        {
	            static final int[] FACING_LOOKUP = new int[EnumFacing.values().length];
	            private static final String __OBFID = "CL_00002111";

	            static
	            {
	                try
	                {
	                    FACING_LOOKUP[EnumFacing.WEST.ordinal()] = 1;
	                }
	                catch (NoSuchFieldError var4)
	                {
	                    ;
	                }

	                try
	                {
	                    FACING_LOOKUP[EnumFacing.EAST.ordinal()] = 2;
	                }
	                catch (NoSuchFieldError var3)
	                {
	                    ;
	                }

	                try
	                {
	                    FACING_LOOKUP[EnumFacing.NORTH.ordinal()] = 3;
	                }
	                catch (NoSuchFieldError var2)
	                {
	                    ;
	                }

	                try
	                {
	                    FACING_LOOKUP[EnumFacing.SOUTH.ordinal()] = 4;
	                }
	                catch (NoSuchFieldError var1)
	                {
	                    ;
	                }
	            }
	        }
		
		@Override
		public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	    {
	        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

	        if (stack.hasDisplayName())
	        {
	            TileEntity tileentity = worldIn.getTileEntity(pos);

	            if (tileentity instanceof TileEntityFurnace)
	            {
	                ((TileEntityFurnace)tileentity).setCustomInventoryName(stack.getDisplayName());
	            }
	        }
	    }
		
		public static void updateLapisFurnaceBlockState(boolean active, World worldObj, BlockPos pos)
		{
			//int i = worldObj.getBlockMetadata(pos);
			
			TileEntity tileentity = worldObj.getTileEntity(new BlockPos(pos));
			keepInventory = true;
			
			if(active)
			{
			//	worldObj.setBlock(xCoord, yCoord, zCoord, BlockManager.lapisFurnaceActive);
			}
			else
			//	worldObj.setBlock(xCoord, yCoord, zCoord, BlockManager.lapisFurnaceIdle);
			
			keepInventory = false;
			
			//worldObj.setBlockMetadataWithNotify(pos, i, 2);
			
			if(tileentity != null)
			{
				tileentity.validate();
					worldObj.setTileEntity(new BlockPos(pos), tileentity);
				
				
			}
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (!keepInventory)
	        {
	            TileEntity tileentity = worldIn.getTileEntity(pos);

	            if (tileentity instanceof TileEntityFurnace)
	            {
	                InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityFurnace)tileentity);
	                worldIn.updateComparatorOutputLevel(pos, this);
	            }
	        }

	        super.breakBlock(worldIn, pos, state);
	    }
		
		@Override
		public boolean hasComparatorInputOverride()
		{
			return true;
		}
		
		@Override
		public int getComparatorInputOverride(World worldIn, BlockPos pos)
		{
			return Container.calcRedstone(worldIn.getTileEntity(pos));
		}
		

		public Item getItem(World world, int x, int y, int z)
		{
			return Item.getItemFromBlock(BlockManager.lapisFurnaceIdle);
		}
	
}	