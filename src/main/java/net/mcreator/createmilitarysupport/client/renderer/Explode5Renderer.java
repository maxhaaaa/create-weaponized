
package net.mcreator.createmilitarysupport.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.createmilitarysupport.entity.Explode5Entity;
import net.mcreator.createmilitarysupport.client.model.ModelCustomModel;

public class Explode5Renderer extends MobRenderer<Explode5Entity, ModelCustomModel<Explode5Entity>> {
	public Explode5Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Explode5Entity entity) {
		return new ResourceLocation("createmilitary_support:textures/entities/entity.png");
	}
}
