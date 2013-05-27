package powerstorage.item;

import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import buildcraft.BuildCraftTransport;
import buildcraft.api.core.IIconProvider;
import buildcraft.transport.Pipe;
import buildcraft.transport.PipeIconProvider;
import buildcraft.transport.PipeTransportPower;
import buildcraft.transport.pipes.PipeLogic;

/**
 * PowerStorage
 * 
 * ItemMercuryPipe
 * 
 * @author Dacktar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemMercuryPipe extends Pipe {

    public ItemMercuryPipe (int itemID) {
            super(new PipeTransportPower(), new PipeLogic(), itemID);
            
            ((PipeTransportPower) transport).powerResistance = 0.000;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIconProvider getIconProvider() {
        return BuildCraftTransport.instance.pipeIconProvider;
    }


    @Override
    public int getIconIndex(ForgeDirection direction) {
        return PipeIconProvider.PipePowerGold;
    }
    

}