package net.kaindorf.mineterra.commands.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class Teleport extends Teleporter {

    private final WorldServer world;
    private double x,y,z;

    public Teleport(WorldServer world, double x,double y,double z){
        super(world);
        this.world=world;
        this.y=y;
        this.x=x;
        this.z=z;
    }

    @Override
    public void placeInPortal(Entity entity, float rotationYaw) {
        this.world.getBlockState(new BlockPos((int)this.x,(int) this.y,(int) this.z));
        entity.setPosition(x,y,z);
        entity.motionX=0f;
        entity.motionY=0f;
        entity.motionZ=0f;
    }

    public static void teleportToDim(EntityPlayer player,int dimension, double x,double y,double z){

        int oldDimension = player.getEntityWorld().provider.getDimension();
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP) player;
        MinecraftServer server = player.getEntityWorld().getMinecraftServer();
        WorldServer worldServer = server.getWorld(dimension);

        if(server == null || worldServer == null) throw new IllegalArgumentException("Dimension: "+dimension+" doesn't exist");
        worldServer.getMinecraftServer().getPlayerList().transferPlayerToDimension(entityPlayerMP,dimension, new Teleport(worldServer,x,y,z));
        player.setPositionAndUpdate(x,y,z);
    }
}
