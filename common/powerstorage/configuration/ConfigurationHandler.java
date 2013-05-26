package powerstorage.configuration;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import powerstorage.lib.BlockIds;
import powerstorage.lib.ItemIds;
import powerstorage.lib.Reference;
import powerstorage.lib.Strings;

import cpw.mods.fml.common.FMLLog;

/**
 * PowerStorage
 * 
 * ConfigurationHandler
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ConfigurationHandler {

    public static Configuration configuration;

    public static final String CATEGORY_KEYBIND = "keybindings";
    public static final String CATEGORY_GRAPHICS = "graphics";
    public static final String CATEGORY_AUDIO = "audio";
    public static final String CATEGORY_TRANSMUTATION = "transmutation";
    public static final String CATEGORY_BLOCK_PROPERTIES = Configuration.CATEGORY_BLOCK + Configuration.CATEGORY_SPLITTER + "properties";
    public static final String CATEGORY_MERCURY_LIQUID_PROPERTIES = CATEGORY_BLOCK_PROPERTIES + Configuration.CATEGORY_SPLITTER + "mercury_liquid";
    public static final String CATEGORY_DURABILITY = Configuration.CATEGORY_ITEM + Configuration.CATEGORY_SPLITTER + "durability";

    public static void init(File configFile) {

        configuration = new Configuration(configFile);

        try {
            configuration.load();

            /* General configs */
            ConfigurationSettings.DISPLAY_VERSION_RESULT = configuration.get(CATEGORY_GENERAL, ConfigurationSettings.DISPLAY_VERSION_RESULT_CONFIGNAME, ConfigurationSettings.DISPLAY_VERSION_RESULT_DEFAULT).getBoolean(ConfigurationSettings.DISPLAY_VERSION_RESULT_DEFAULT);
            ConfigurationSettings.LAST_DISCOVERED_VERSION = configuration.get(CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_DEFAULT).getString();
            ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE = configuration.get(CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_DEFAULT).getString();

            /* Graphic configs */
            ConfigurationSettings.ENABLE_PARTICLE_FX = configuration.get(CATEGORY_GRAPHICS, ConfigurationSettings.ENABLE_PARTICLE_FX_CONFIGNAME, ConfigurationSettings.ENABLE_PARTICLE_FX_DEFAULT).getBoolean(ConfigurationSettings.ENABLE_PARTICLE_FX_DEFAULT);
            ConfigurationSettings.ENABLE_OVERLAY_WORLD_TRANSMUTATION = configuration.get(CATEGORY_GRAPHICS, ConfigurationSettings.ENABLE_OVERLAY_WORLD_TRANSMUTATION_CONFIGNAME, ConfigurationSettings.ENABLE_OVERLAY_WORLD_TRANSMUTATION_DEFAULT).getBoolean(ConfigurationSettings.ENABLE_OVERLAY_WORLD_TRANSMUTATION_DEFAULT);
            ConfigurationSettings.TARGET_BLOCK_OVERLAY_POSITION = configuration.get(CATEGORY_GRAPHICS, ConfigurationSettings.TARGET_BLOCK_OVERLAY_POSITION_CONFIGNAME, ConfigurationSettings.TARGET_BLOCK_OVERLAY_POSITION_DEFAULT).getInt(ConfigurationSettings.TARGET_BLOCK_OVERLAY_POSITION_DEFAULT);
            try {
                ConfigurationSettings.TARGET_BLOCK_OVERLAY_SCALE = Float.parseFloat(configuration.get(CATEGORY_GRAPHICS, ConfigurationSettings.TARGET_BLOCK_OVERLAY_SCALE_CONFIGNAME, ConfigurationSettings.TARGET_BLOCK_OVERLAY_SCALE_DEFAULT).getString());

                if (ConfigurationSettings.TARGET_BLOCK_OVERLAY_SCALE <= 0F) {
                    ConfigurationSettings.TARGET_BLOCK_OVERLAY_SCALE = ConfigurationSettings.TARGET_BLOCK_OVERLAY_SCALE_DEFAULT;
                }
            }
            catch (Exception e) {
                ConfigurationSettings.TARGET_BLOCK_OVERLAY_SCALE = ConfigurationSettings.TARGET_BLOCK_OVERLAY_SCALE_DEFAULT;
            }
            try {
                ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY = Float.parseFloat(configuration.get(CATEGORY_GRAPHICS, ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY_CONFIGNAME, ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY_DEFAULT).getString());

                if (ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY < 0F || ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY > 1F) {
                    ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY = ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY_DEFAULT;
                }
            }
            catch (Exception e) {
                ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY = ConfigurationSettings.TARGET_BLOCK_OVERLAY_OPACITY_DEFAULT;
            }

            /* Audio configs */
            ConfigurationSettings.ENABLE_SOUNDS = configuration.get(CATEGORY_AUDIO, ConfigurationSettings.ENABLE_SOUNDS_CONFIGNAME, ConfigurationSettings.ENABLE_SOUNDS_DEFAULT).getString();

            /* Block configs */
            BlockIds.MERCURY_ORE = configuration.getBlock(Strings.MERCURY_ORE_NAME, BlockIds.MERCURY_ORE_DEFAULT).getInt(BlockIds.MERCURY_ORE_DEFAULT);
            BlockIds.BATTERTY_BOX = configuration.getBlock(Strings.BATTERTY_BOX_NAME, BlockIds.BATTERTY_BOX_DEFAULT).getInt(BlockIds.BATTERTY_BOX_DEFAULT);
            BlockIds.CONDENSER = configuration.getBlock(Strings.CONDENSER_NAME, BlockIds.CONDENSER_DEFAULT).getInt(BlockIds.CONDENSER_DEFAULT);
            BlockIds.MERCURY_CUBE_EMPTY = configuration.getBlock(Strings.MERCURY_CUBE_EMPTY_NAME, BlockIds.MERCURY_CUBE_EMPTY_DEFAULT).getInt(BlockIds.MERCURY_CUBE_EMPTY_DEFAULT);
            BlockIds.MERCURY_CUBE_FULL = configuration.getBlock(Strings.MERCURY_CUBE_FULL_NAME, BlockIds.MERCURY_CUBE_FULL_DEFAULT).getInt(BlockIds.MERCURY_CUBE_FULL_DEFAULT);
            BlockIds.MERCURY_LIQUID_STILL = configuration.getBlock(Strings.MERCURY_LIQUID_STILL_NAME, BlockIds.MERCURY_LIQUID_STILL_DEFAULT).getInt(BlockIds.MERCURY_LIQUID_STILL_DEFAULT);
            BlockIds.MERCURY_LIQUID_MOVING = configuration.getBlock(Strings.MERCURY_LIQUID_MOVING_NAME, BlockIds.MERCURY_LIQUID_MOVING_DEFAULT).getInt(BlockIds.MERCURY_LIQUID_MOVING_DEFAULT);

            /* Block property configs */
            configuration.addCustomCategoryComment(CATEGORY_BLOCK_PROPERTIES, "Custom block properties");

            /* Red Water configs */
            configuration.addCustomCategoryComment(CATEGORY_MERCURY_LIQUID_PROPERTIES, "Configuration settings for various properties of Mercury Liquid");
            ConfigurationSettings.MERCURY_LIQUID_DURATION_BASE = configuration.get(CATEGORY_MERCURY_LIQUID_PROPERTIES, ConfigurationSettings.MERCURY_LIQUID_DURATION_BASE_CONFIGNAME, ConfigurationSettings.MERCURY_LIQUID_DURATION_BASE_DEFAULT).getInt(ConfigurationSettings.MERCURY_LIQUID_DURATION_BASE_DEFAULT);
            ConfigurationSettings.MERCURY_LIQUID_DURATION_MODIFIER = configuration.get(CATEGORY_MERCURY_LIQUID_PROPERTIES, ConfigurationSettings.MERCURY_LIQUID_DURATION_MODIFIER_CONFIGNAME, ConfigurationSettings.MERCURY_LIQUID_DURATION_MODIFIER_DEFAULT).getInt(ConfigurationSettings.MERCURY_LIQUID_DURATION_MODIFIER_DEFAULT);
            ConfigurationSettings.MERCURY_LIQUID_RANGE_BASE = configuration.get(CATEGORY_MERCURY_LIQUID_PROPERTIES, ConfigurationSettings.MERCURY_LIQUID_RANGE_BASE_CONFIGNAME, ConfigurationSettings.MERCURY_LIQUID_RANGE_BASE_DEFAULT).getInt(ConfigurationSettings.MERCURY_LIQUID_RANGE_BASE_DEFAULT);
            ConfigurationSettings.MERCURY_LIQUID_RANGE_MODIFIER = configuration.get(CATEGORY_MERCURY_LIQUID_PROPERTIES, ConfigurationSettings.MERCURY_LIQUID_RANGE_MODIFIER_CONFIGNAME, ConfigurationSettings.MERCURY_LIQUID_RANGE_MODIFIER_DEFAULT).getInt(ConfigurationSettings.MERCURY_LIQUID_RANGE_MODIFIER_DEFAULT);

            /* Item configs */
            ItemIds.MERCURY_PIPE = configuration.getItem(Strings.MERCURY_PIPE_NAME, ItemIds.MERCURY_PIPE_DEFAULT).getInt(ItemIds.MERCURY_PIPE_DEFAULT);
            ItemIds.MERCURY_INGOT = configuration.getItem(Strings.MERCURY_INGOT_NAME, ItemIds.MERCURY_INGOT_DEFAULT).getInt(ItemIds.MERCURY_INGOT_DEFAULT);
            ItemIds.BUCKET_MERCURY = configuration.getItem(Strings.BUCKET_MERCURY_NAME, ItemIds.BUCKET_MERCURY_DEFAULT).getInt(ItemIds.BUCKET_MERCURY_DEFAULT);
            
        }
        catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
        }
        finally {
            configuration.save();
        }
    }

    public static void set(String categoryName, String propertyName, String newValue) {

        configuration.load();
        if (configuration.getCategoryNames().contains(categoryName)) {
            if (configuration.getCategory(categoryName).containsKey(propertyName)) {
                configuration.getCategory(categoryName).get(propertyName).set(newValue);
            }
        }
        configuration.save();
    }
}
