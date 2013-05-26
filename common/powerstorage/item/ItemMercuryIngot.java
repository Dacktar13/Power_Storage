package powerstorage.item;

import powerstorage.core.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMercuryIngot extends Item {

    public ItemMercuryIngot(int id) {
        super(id);
        
        // Constructor Config
        maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("mercuryIngot");

    }

    public String getTextureFile() {
        return CommonProxy.TEXTURE_ITEMS;
    }
}
