package com.camp.block;
/*names the package this class is in*/
import java.util.List;

import net.minecraft.block.Block;
//imports the code to be used
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public /**This class can be called by other classes*/ class CompressedNetherrack/**Names the class*/
extends Block /**Extends this class from the class net.minecraft.block.Block*/{

	protected CompressedNetherrack(Material material) {
	/**constructor for creating "CompressedNetherrack"
	 */
		super(material /**creates variable name "material"*/);
		this.setUnlocalizedName("CompressedNetherrack");
		/**Name the block's code name*/
		this.setCreativeTab(CreativeTabsManager.tabMysticBlocks);
		/**Sets the creative tab*/
		//this.setBlockTextureName(StringLibrary.MODID + ":compressed_netherrack");
		/**sets the texture using the MODID + the texture name with a :*/
		this.setHardness(1f);
		//sets the block's hardness when broken
		this.setResistance(4f);
		//sets the block's resistance to explosions
	}
	
	public void func_77624_a(ItemStack itemStack, EntityPlayer player, List list, boolean p_77624_4_)
	{
	    list.add("9 Netherrack");
	}

}