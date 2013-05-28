package powerstorage.item;

import buildcraft.BuildCraftTransport;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import powerstorage.block.ModBlocks;
import powerstorage.lib.ItemIds;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * PowerStorage
 * 
 * ModItems
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ModItems {

    /* Mod item instances */
    public static Item mercuryPipe;
    public static Item mercuryIngot;
    public static Item bucketMercury;

    public static void init() {

        /* Initialize each mod item individually */
        mercuryPipe = buildcraft.BuildCraftTransport.createPipe(ItemIds.MERCURY_PIPE,
                ItemMercuryPipe.class, "Mercury Conductive Pipe", BuildCraftTransport.pipePowerGold, bucketMercury, null);
        
        mercuryIngot = new ItemMercuryIngot(ItemIds.MERCURY_INGOT);
        bucketMercury = new ItemBucketMercury(ItemIds.BUCKET_MERCURY);

        
        LanguageRegistry.addName(mercuryPipe, "Mercury Pipe");
        LanguageRegistry.addName(mercuryIngot, "Mercury Ingot");
        LanguageRegistry.addName(bucketMercury, "Mercury Bucket");
        
        
        
        
       
    }

    public static void initItemRecipes() {

        // Mercury Bucket
         GameRegistry.addRecipe(new ItemStack(bucketMercury), 
                 new Object[] {"   ", "imi", " i ", 
                 Character.valueOf('m'), mercuryIngot,
                 Character.valueOf('i'), Item.ingotIron });
         
         GameRegistry.addRecipe(new ItemStack(bucketMercury), 
                 new Object[] {"   ", " m ", " i ",  
                 Character.valueOf('i'), Item.bucketEmpty, 
                 Character.valueOf('m'), mercuryIngot});
         
         // Mercury Ingot         
         GameRegistry.addSmelting(ModBlocks.mercuryOre.blockID, new ItemStack(mercuryIngot), 0.8f);
         
         FurnaceRecipes.smelting().addSmelting(ModBlocks.mercuryOre.blockID, new ItemStack(mercuryIngot), 0.8F);
             
         // Mercury Pipes
         GameRegistry.addRecipe(new ItemStack(mercuryPipe), 
                 new Object[] {"   ", "gmg", "   ",  
                 Character.valueOf('g'), Item.ingotGold, 
                 Character.valueOf('m'), mercuryIngot});
         
//         GameRegistry.addShapelessRecipe(new ItemStack(mercuryPipe, 1),
//                 BuildCraftTransport.pipePowerGold, bucketMercury);
         
         
        

    }
}
