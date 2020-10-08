package net.kaindorf.mineterra.entity;

import net.kaindorf.mineterra.Mineterra;
import net.kaindorf.mineterra.TutorialTab;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.awt.*;
import java.lang.ref.Reference;

public class EntityInit {

    public static void registerEntities(){
        int id = 2000;
        registerEntity("poro",EntityPoro.class,id,50,16738740,000000);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity,int id,int range,int color1,int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(Mineterra.MODID + ":" + name),entity,name,id,Mineterra.instance,range,1,true,color1,color2);
    }

}
