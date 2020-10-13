package net.kaindorf.mineterra.entity.render;

import net.kaindorf.mineterra.Mineterra;
import net.kaindorf.mineterra.entity.EntityPoro;
import net.kaindorf.mineterra.entity.EntityPoroKing;
import net.kaindorf.mineterra.entity.model.ModelPoro;
import net.kaindorf.mineterra.entity.model.ModelPoroKing;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoroKing extends RenderLiving<EntityPoroKing> {
    public static final ResourceLocation TEXTURES = new ResourceLocation(Mineterra.MODID + ":textures/entities/poroking.png");

    public RenderPoroKing(RenderManager manager) {
        super(manager, new ModelPoroKing(),0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPoroKing entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityPoroKing entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
