package powerstorage.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import powerstorage.core.proxy.CommonProxy;

/**
 * PowerStorage
 * 
 * ClientProxy
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ClientProxy extends CommonProxy {

    @SuppressWarnings("deprecation")
    @Override
    public void registerRenderers() {
        MinecraftForgeClient.preloadTexture(TEXTURE_ITEMS);
        MinecraftForgeClient.preloadTexture(TEXTURE_BLOCKS);
    }

}