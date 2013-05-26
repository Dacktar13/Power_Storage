package powerstorage.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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
                
                
        }
        
       
}