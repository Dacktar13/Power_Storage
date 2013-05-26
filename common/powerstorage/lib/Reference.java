package powerstorage.lib;

/**
 * Power Storage
 * 
 * Reference
 * 
 * @author Dacktar
 * @licence Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class Reference {
    
    /* Debug Mode On-Off */
    public static final boolean DEBUG_MODE = false;
    
    /* General Mod related constants */
    public static final String MOD_ID = "PowerStorage";
    public static final String MOD_NAME = "Power Storage";
    public static final String VERSION_NUMBER = "0.2.1";
    public static final String CHANNEL_NAME = MOD_ID;
    public static final String DEPENDENCIES = "required-after:Forge@[7.8.0.712,)";
    public static final String SERVER_PROXY_CLASS = "powerstorage.core.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "powerstorage.core.proxy.ClientProxy";

}
