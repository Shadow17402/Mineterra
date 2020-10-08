package net.kaindorf.mineterra.entity.render;

import net.kaindorf.mineterra.Mineterra;
import net.kaindorf.mineterra.entity.EntityPoro;
import net.kaindorf.mineterra.entity.model.ModelPoro;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoro extends RenderLiving<EntityPoro> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Mineterra.MODID + ":textures/entities/poro.png");

    public RenderPoro(RenderManager manager) {
        super(manager, new ModelPoro(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPoro entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityPoro entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
