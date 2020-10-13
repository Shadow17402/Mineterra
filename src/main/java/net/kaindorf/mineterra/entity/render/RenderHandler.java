package net.kaindorf.mineterra.entity.render;

import net.kaindorf.mineterra.entity.EntityPoro;
import net.kaindorf.mineterra.entity.EntityPoroKing;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityPoro.class, new IRenderFactory<EntityPoro>() {
            @Override
            public Render<? super EntityPoro> createRenderFor(RenderManager manager) {
                return new RenderPoro(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPoroKing.class, new IRenderFactory<EntityPoroKing>() {
            @Override
            public Render<? super EntityPoroKing> createRenderFor(RenderManager manager) {
                return new RenderPoroKing(manager);
            }
        });
    }
}
