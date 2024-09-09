
package net.mcreator.createmilitarysupport.client.renderer;

public class Explode5Renderer extends MobRenderer<Explode5Entity, ModelCustomModel<Explode5Entity>> {

	public Explode5Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(Explode5Entity entity) {
		return new ResourceLocation("createmilitary_support:textures/entities/entity.png");
	}

}
