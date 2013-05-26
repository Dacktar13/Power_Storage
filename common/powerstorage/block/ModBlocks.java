package powerstorage.block;

import buildcraft.BuildCraftCore;
import buildcraft.BuildCraftFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import powerstorage.item.ModItems;
import powerstorage.lib.BlockIds;
import powerstorage.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * PowerStorage
 * 
 * ModBlocks
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModBlocks {

    /* Mod block instances */
    public static Block mercuryOre;
    public static Block mercuryLiquidMoving;
    public static Block mercuryLiquidStill;
    public static Block batteryBox;
    public static Block condenser;
    public static Block mercuryCubeEmpty;
    public static Block mercuryCubeFull;

    public static void init() {

        mercuryOre = new BlockMercuryOre(BlockIds.MERCURY_ORE);
        mercuryLiquidMoving = new BlockMercuryLiquidMoving(BlockIds.MERCURY_LIQUID_STILL - 1);
        mercuryLiquidStill = new BlockMercuryLiquidStill(BlockIds.MERCURY_LIQUID_STILL);
        batteryBox = new BlockBatteryBox(BlockIds.BATTERTY_BOX);
        condenser = new BlockCondenser(BlockIds.CONDENSER);
        mercuryCubeEmpty = new BlockMercuryCubeEmpty(
                BlockIds.MERCURY_CUBE_EMPTY);
        mercuryCubeFull = new BlockMercuryCubeFull(BlockIds.MERCURY_CUBE_FULL);

        GameRegistry.registerBlock(mercuryOre, Strings.MERCURY_ORE_NAME);
        GameRegistry.registerBlock(batteryBox, Strings.BATTERTY_BOX_NAME);
        GameRegistry.registerBlock(condenser, Strings.CONDENSER_NAME);
        GameRegistry.registerBlock(mercuryCubeEmpty, Strings.MERCURY_CUBE_EMPTY_NAME);
        GameRegistry.registerBlock(mercuryCubeFull, Strings.MERCURY_CUBE_FULL_NAME);
        GameRegistry.registerBlock(mercuryLiquidMoving, Strings.MERCURY_LIQUID_MOVING_NAME);
        GameRegistry.registerBlock(mercuryLiquidStill, Strings.MERCURY_LIQUID_STILL_NAME);
  
        }

    
      public static void initBlockRecipes() {

             
     // Battery Box
        GameRegistry.addRecipe(new ItemStack(batteryBox), 
                new Object[] { "sss", "dmd", "DPD", 
                Character.valueOf('m'), mercuryCubeFull, 
                Character.valueOf('d'), Item.diamond, 
                Character.valueOf('s'), Block.stone, 
                Character.valueOf('D'), BuildCraftCore.diamondGearItem, 
                Character.valueOf('P'), ModItems.mercuryPipe });
          
     // Condenser
        GameRegistry.addRecipe(new ItemStack(condenser),
                new Object[] { "sss", "tft", "GpG", 
            Character.valueOf('t'), BuildCraftFactory.tankBlock, 
            Character.valueOf('f'), Block.furnaceIdle, 
            Character.valueOf('s'), Block.stone, 
            Character.valueOf('G'), BuildCraftCore.goldGearItem, 
            Character.valueOf('p'), ModItems.mercuryPipe });
        
     // Mercury Cube Empty
        GameRegistry.addRecipe(new ItemStack(mercuryCubeEmpty),
                new Object[] { "GgG", "gmg", "GgG", 
            Character.valueOf('m'), ModItems.mercuryIngot, 
            Character.valueOf('G'), Item.ingotGold, 
            Character.valueOf('g'), Block.glass });
        
    }
    
}
