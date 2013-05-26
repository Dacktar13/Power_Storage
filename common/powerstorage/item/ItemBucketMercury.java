package powerstorage.item;

import buildcraft.core.utils.StringUtils;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import powerstorage.block.ModBlocks;

public class ItemBucketMercury extends ItemBucket {

    public ItemBucketMercury(int i) {
        super(i, ModBlocks.mercuryLiquidMoving.blockID);
        
    }

    @Override
    public String getItemDisplayName(ItemStack itemstack) {
        return StringUtils.localize(getUnlocalizedName(itemstack));
    }
    

}