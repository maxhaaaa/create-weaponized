
package net.mcreator.createmilitarysupport.client.renderer;

public class RcxdRenderer extends GeoEntityRenderer<RcxdEntity> {
	public RcxdRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RcxdModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RcxdEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, RcxdEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(RcxdEntity entityLivingBaseIn) {
		return 0.0F;
	}
}