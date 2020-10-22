package net.kaindorf.mineterra;

import net.kaindorf.mineterra.block.pedestal.ContainerPedestal;
import net.kaindorf.mineterra.block.pedestal.GuiPedestal;
import net.kaindorf.mineterra.block.pedestal.TileEntityPedestal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class ModGUIHandler implements IGuiHandler {

    public static final int PEDESTAL = 0;

    @Nullable
    @Override
    public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID){
            case PEDESTAL:
                return new ContainerPedestal(player.inventory,(TileEntityPedestal)world.getTileEntity(new BlockPos(x, y, z)));
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case PEDESTAL:
                return new GuiPedestal(getServerGuiElement(ID, player, world, x, y, z), player.inventory);
            default:
                return null;
        }
    }
}
