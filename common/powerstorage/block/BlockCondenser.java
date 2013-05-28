package powerstorage.block;

import powerstorage.core.CreativeTabPowerStorage;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * PowerStorage
 * 
 * BlockCondenser
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public  class BlockCondenser extends Block {
    
    int topTexture;
    int sideTexture;

        public BlockCondenser (int id) {
                super(id,  Material.iron);
                setCreativeTab(CreativeTabPowerStorage.tabPowerStorage);
                
        }
        
        @Override
        public void registerIcons(IconRegister par1IconRegister)
        {
             this.blockIcon = par1IconRegister.registerIcon("powerstorage:condenser");
        }
        
       
}