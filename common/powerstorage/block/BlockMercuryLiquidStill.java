package powerstorage.block;


import powerstorage.PowerStorage;
import powerstorage.core.CreativeTabPowerStorage;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;

/**
 * PowerStorage
 * 
 * BlockMercuryStill
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockMercuryLiquidStill extends BlockStationary implements ILiquid {


    public BlockMercuryLiquidStill(int i) {
        super(i, Material.water);

        setHardness(100F);
        setLightOpacity(3);
        setCreativeTab(CreativeTabPowerStorage.tabPowerStorage);
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
         this.blockIcon = par1IconRegister.registerIcon("powerstorage:mercuryLiquidStill");
    }

    @Override
    public int getRenderType() {
        return PowerStorage.MERCURYLIQUIDMODEL;
    }

    
    @Override
    public int stillLiquidId() {
        return ModBlocks.mercuryLiquidStill.blockID;
    }

    @Override
    public boolean isMetaSensitive() {
        return false;
    }

    @Override
    public int stillLiquidMeta() {
        return 0;
    }

    @Override
    public boolean isBlockReplaceable(World world, int i, int j, int k) {
        return true;
    }

}