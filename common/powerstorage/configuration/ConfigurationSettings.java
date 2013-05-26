package powerstorage.configuration;

/**
 * PowerStorage
 * 
 * ConfigurationSettings
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ConfigurationSettings {

    /*
     * Version check related settings
     */
    public static boolean DISPLAY_VERSION_RESULT;
    public static final String DISPLAY_VERSION_RESULT_CONFIGNAME = "version_check.display_results";
    public static final boolean DISPLAY_VERSION_RESULT_DEFAULT = true;

    public static String LAST_DISCOVERED_VERSION;
    public static final String LAST_DISCOVERED_VERSION_CONFIGNAME = "version_check.last_discovered_version";
    public static final String LAST_DISCOVERED_VERSION_DEFAULT = "";

    public static String LAST_DISCOVERED_VERSION_TYPE;
    public static final String LAST_DISCOVERED_VERSION_TYPE_CONFIGNAME = "version_check.last_discovered_version_type";
    public static final String LAST_DISCOVERED_VERSION_TYPE_DEFAULT = "";

    /*
     * Audio config settings
     */
    public static String ENABLE_SOUNDS;
    public static final String ENABLE_SOUNDS_CONFIGNAME = "sounds.enabled";
    public static final String ENABLE_SOUNDS_DEFAULT = "all";

    /*
     * Graphic config settings
     */
    // Whether or not PowerStorage particle fx are enabled
    public static boolean ENABLE_PARTICLE_FX;
    public static final String ENABLE_PARTICLE_FX_CONFIGNAME = "particle_fx.enabled";
    public static final boolean ENABLE_PARTICLE_FX_DEFAULT = true;

    // Whether or not the in world transmutation overlays are enabled
    public static boolean ENABLE_OVERLAY_WORLD_TRANSMUTATION;
    public static final String ENABLE_OVERLAY_WORLD_TRANSMUTATION_CONFIGNAME = "world_transmutation_overlay.enabled";
    public static final boolean ENABLE_OVERLAY_WORLD_TRANSMUTATION_DEFAULT = true;

    public static int TARGET_BLOCK_OVERLAY_POSITION;
    public static final String TARGET_BLOCK_OVERLAY_POSITION_CONFIGNAME = "block_overlay_position";
    public static final int TARGET_BLOCK_OVERLAY_POSITION_DEFAULT = 3;

    public static float TARGET_BLOCK_OVERLAY_OPACITY;
    public static final String TARGET_BLOCK_OVERLAY_OPACITY_CONFIGNAME = "block_overlay_opacity";
    public static final float TARGET_BLOCK_OVERLAY_OPACITY_DEFAULT = 0.75F;

    public static float TARGET_BLOCK_OVERLAY_SCALE;
    public static final String TARGET_BLOCK_OVERLAY_SCALE_CONFIGNAME = "block_overlay_scale";
    public static final float TARGET_BLOCK_OVERLAY_SCALE_DEFAULT = 2.5F;

    /*
     * Block related config settings
     */
    public static int MERCURY_LIQUID_DURATION_BASE;
    public static String MERCURY_LIQUID_DURATION_BASE_CONFIGNAME = "duration.base";
    public static final int MERCURY_LIQUID_DURATION_BASE_DEFAULT = 5;

    public static int MERCURY_LIQUID_DURATION_MODIFIER;
    public static String MERCURY_LIQUID_DURATION_MODIFIER_CONFIGNAME = "duration.modifier";
    public static final int MERCURY_LIQUID_DURATION_MODIFIER_DEFAULT = 2;

    public static int MERCURY_LIQUID_RANGE_BASE;
    public static String MERCURY_LIQUID_RANGE_BASE_CONFIGNAME = "range.base";
    public static final int MERCURY_LIQUID_RANGE_BASE_DEFAULT = 1;

    public static int MERCURY_LIQUID_RANGE_MODIFIER;
    public static String MERCURY_LIQUID_RANGE_MODIFIER_CONFIGNAME = "range.modifier";
    public static final int MERCURY_LIQUID_RANGE_MODIFIER_DEFAULT = 3;

    
}
