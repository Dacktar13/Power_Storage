package powerstorage.block;

import java.util.Random;

import powerstorage.core.CreativeTabPowerStorage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

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
        
                setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                setHardness(4.0F); // 33% harder than diamond
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("mercuryOre");
                setCreativeTab(CreativeTabPowerStorage.tabPowerStorage);
        }
        
        @Override
        public void registerIcons(IconRegister par1IconRegister)
        {
             this.blockIcon = par1IconRegister.registerIcon("powerstorage:mercuryOre");
        }
    
        @Override
        public int idDropped(int par1, Random random, int par2) {
                return ModBlocks.mercuryOre.blockID;
        }
}