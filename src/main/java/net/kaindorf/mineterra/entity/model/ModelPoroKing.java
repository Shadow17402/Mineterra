package net.kaindorf.mineterra.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPoroKing extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer eyes;
    private final ModelRenderer mouth;
    private final ModelRenderer legs;
    private final ModelRenderer horns;
    private final ModelRenderer beard;

    public ModelPoroKing() {
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.cubeList.add(new ModelBox(body, 0, 0, -16.0F, -36.0F, -16.0F, 32, 32, 32, 0.0F, false));

        eyes = new ModelRenderer(this);
        eyes.setRotationPoint(4.0F, 24.0F, -4.0F);
        eyes.cubeList.add(new ModelBox(eyes, 0, 0, -16.2F, -28.0F, -14.0F, 8, 8, 8, 0.0F, false));
        eyes.cubeList.add(new ModelBox(eyes, 0, 0, 0.2F, -28.0F, -14.0F, 8, 8, 8, 0.0F, false));

        mouth = new ModelRenderer(this);
        mouth.setRotationPoint(0.0F, 24.0F, 0.0F);
        mouth.cubeList.add(new ModelBox(mouth, 62, 64, -4.0F, -12.0F, -18.0F, 8, 4, 4, 0.0F, false));

        legs = new ModelRenderer(this);
        legs.setRotationPoint(0.0F, 24.0F, 0.0F);
        legs.cubeList.add(new ModelBox(legs, 0, 16, -16.0F, -4.0F, 8.0F, 8, 4, 8, 0.0F, false));
        legs.cubeList.add(new ModelBox(legs, 0, 16, -16.0F, -4.0F, -16.0F, 8, 4, 8, 0.0F, false));
        legs.cubeList.add(new ModelBox(legs, 0, 16, 8.0F, -4.0F, 8.0F, 8, 4, 8, 0.0F, false));
        legs.cubeList.add(new ModelBox(legs, 0, 16, 8.0F, -4.0F, -16.0F, 8, 4, 8, 0.0F, false));

        horns = new ModelRenderer(this);
        horns.setRotationPoint(0.0F, 24.0F, 0.0F);
        horns.cubeList.add(new ModelBox(horns, 0, 72, 12.0F, -40.0F, -16.0F, 4, 4, 4, 0.0F, false));
        horns.cubeList.add(new ModelBox(horns, 0, 72, -16.0F, -40.0F, -16.0F, 4, 4, 4, 0.0F, false));
        horns.cubeList.add(new ModelBox(horns, 0, 72, 12.0F, -44.0F, -12.0F, 4, 4, 4, 0.0F, false));
        horns.cubeList.add(new ModelBox(horns, 0, 72, -16.0F, -44.0F, -12.0F, 4, 4, 4, 0.0F, false));
        horns.cubeList.add(new ModelBox(horns, 16, 72, 12.0F, -44.0F, -8.0F, 4, 4, 4, 0.0F, false));
        horns.cubeList.add(new ModelBox(horns, 0, 72, -16.0F, -44.0F, -8.0F, 4, 4, 4, 0.0F, false));

        beard = new ModelRenderer(this);
        beard.setRotationPoint(0.0F, 24.0F, 0.0F);
        beard.cubeList.add(new ModelBox(beard, 0, 64, -7.0F, -17.0F, -18.0F, 14, 4, 4, 0.0F, false));
        beard.cubeList.add(new ModelBox(beard, 36, 64, 5.0F, -13.0F, -18.0F, 9, 4, 4, 0.0F, true));
        beard.cubeList.add(new ModelBox(beard, 36, 64, -14.0F, -13.0F, -18.0F, 9, 4, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        body.render(f5);
        eyes.render(f5);
        mouth.render(f5);
        legs.render(f5);
        horns.render(f5);
        beard.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
