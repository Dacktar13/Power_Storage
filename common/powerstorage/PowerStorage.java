package powerstorage;

import java.io.File;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import powerstorage.core.PSWorldGen;
import powerstorage.core.proxy.CommonProxy;
import powerstorage.lib.Reference;
import powerstorage.block.ModBlocks;
import powerstorage.item.ModItems;
import powerstorage.configuration.ConfigurationHandler;

/**
 * PowerStorage
 * 
 * PowerStorage
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, dependencies = Reference.DEPENDENCIES)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class PowerStorage {

    // The instance of your mod that Forge uses.
    @Instance("PowerStorage")
    public static PowerStorage instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    /***
     * This is code that is executed prior to your mod being initialized into of
     * Minecraft Examples of code that could be run here;
     * 
     * Initializing your items/blocks (you must do this here) Setting up your
     * own custom logger for writing log data to Loading your language
     * translations for your mod (if your mod has translations for other
     * languages) Registering your mod's key bindings and sounds
     * 
     * @param event
     *            The Forge ModLoader pre-initialization event
     */

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {

        // Initialize the configuration
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory()
                .getAbsolutePath()
                + File.separator
                + Reference.CHANNEL_NAME
                + File.separator + Reference.MOD_ID + ".cfg"));

       
        
        // Initialize mod blocks
        ModBlocks.init();
        
        // Initialize mod items
        ModItems.init();
        

    }

    /***
     * This is code that is executed when your mod is being initialized in
     * Minecraft Examples of code that could be run here;
     * 
     * Registering your GUI Handler Registering your different event listeners
     * Registering your different tile entities Adding in any recipes you have
     * 
     * @param event
     *            The Forge ModLoader initialization event
     */

    @Init
    public void load(FMLInitializationEvent event) {

        
     // Initialize mod recipies
        ModBlocks.initBlockRecipes();
        ModItems.initItemRecipes();
        
        initWorldGen();

    }

    /***
     * This is code that is executed after all mods are initialized in Minecraft
     * This is a good place to execute code that interacts with other mods (ie,
     * loads an addon module of your mod if you find a particular mod).
     * 
     * @param event
     *            The Forge ModLoader post-initialization event
     */

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }

    private void initWorldGen() {
        GameRegistry.registerWorldGenerator(new PSWorldGen());
    }

    public static int mercuryLiquidModel;

}