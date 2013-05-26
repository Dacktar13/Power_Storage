package powerstorage.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * PowerStorage
 * 
 * BlockMercuryOre
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockMercuryOre extends Block {

    
    public BlockMercuryOre(int id) {
        super(id, Material.iron);
                
                setHardness(4.0F); // 33% harder than diamond
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("mercuryOre");
                setCreativeTab(CreativeTabs.tabBlock);
        }
        
    
        @Override
        public int idDropped(int par1, Random random, int par2) {
                return ModBlocks.mercuryOre.blockID;
        }
}