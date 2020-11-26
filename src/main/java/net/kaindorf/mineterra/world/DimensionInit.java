package net.kaindorf.mineterra.world;

import net.kaindorf.mineterra.world.dimension.Void.DimensionVoid;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {

    public static final DimensionType VOID = DimensionType.register("Void","_void",2, DimensionVoid.class,false);

    public static void registerDimensions(){
        DimensionManager.registerDimension(2,VOID);
    }

}
