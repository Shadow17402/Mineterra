package net.kaindorf.mineterra.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPoro extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer eyes;
	private final ModelRenderer mouth;
	private final ModelRenderer legs;
	private final ModelRenderer horns;

	public ModelPoro() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -9.0F, -4.0F, 8, 8, 8, 0.0F, false));

		eyes = new ModelRenderer(this);
		eyes.setRotationPoint(4.0F, 24.0F, -4.0F);
		eyes.cubeList.add(new ModelBox(eyes, 0, 0, -7.05F, -7.0F, -0.5F, 2, 2, 2, 0.0F, false));
		eyes.cubeList.add(new ModelBox(eyes, 0, 0, -2.95F, -7.0F, -0.5F, 2, 2, 2, 0.0F, false));

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 24.0F, 0.0F);
		mouth.cubeList.add(new ModelBox(mouth, 0, 16, -1.0F, -3.0F, -4.5F, 2, 1, 1, 0.0F, false));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		legs.cubeList.add(new ModelBox(legs, 0, 4, -4.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 0, 4, -4.0F, -1.0F, -4.0F, 2, 1, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 0, 4, 2.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 0, 4, 2.0F, -1.0F, -4.0F, 2, 1, 2, 0.0F, false));

		horns = new ModelRenderer(this);
		horns.setRotationPoint(0.0F, 24.0F, 0.0F);
		horns.cubeList.add(new ModelBox(horns, 6, 16, 3.0F, -10.0F, -4.0F, 1, 1, 1, 0.0F, false));
		horns.cubeList.add(new ModelBox(horns, 6, 16, -4.0F, -10.0F, -4.0F, 1, 1, 1, 0.0F, false));
		horns.cubeList.add(new ModelBox(horns, 6, 16, 3.0F, -11.0F, -3.0F, 1, 1, 1, 0.0F, false));
		horns.cubeList.add(new ModelBox(horns, 6, 16, -4.0F, -11.0F, -3.0F, 1, 1, 1, 0.0F, false));
		horns.cubeList.add(new ModelBox(horns, 10, 16, 3.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, false));
		horns.cubeList.add(new ModelBox(horns, 6, 16, -4.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		eyes.render(f5);
		mouth.render(f5);
		legs.render(f5);
		horns.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}