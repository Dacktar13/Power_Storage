package powerstorage.core;

import powerstorage.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabPowerStorage extends CreativeTabs {

	public static final CreativeTabs tabPowerStorage = new CreativeTabPowerStorage("powerstorage");
	
	public CreativeTabPowerStorage(String label) {
		super(label);
	}

	@Override
    public ItemStack getIconItemStack() {
		return new ItemStack(ModBlocks.mercuryOre);
	}
	
	@Override
    public String getTranslatedTabLabel() {
		return "PowerStorage";
	}
}
