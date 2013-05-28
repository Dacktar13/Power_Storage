package powerstorage.item;

import powerstorage.core.CreativeTabPowerStorage;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMercuryIngot extends Item {

    public ItemMercuryIngot(int id) {
        super(id);
        
        // Constructor Config
        maxStackSize = 64;
        setCreativeTab(CreativeTabPowerStorage.tabPowerStorage);
        setUnlocalizedName("mercuryIngot");

    }

    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        this.itemIcon  = iconRegister.registerIcon("powerstorage:mercuryIngot");
    }
}
