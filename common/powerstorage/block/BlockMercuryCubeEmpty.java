package powerstorage.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * PowerStorage
 * 
 * BlockMercuryCubeEmpty
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockMercuryCubeEmpty extends Block {

    int topTexture;
    int sideTexture;

    public BlockMercuryCubeEmpty(int id) {
        super(id, Material.iron);

    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
         this.blockIcon = par1IconRegister.registerIcon("powerstorage:mercuryCubeEmpty");
    }

}
