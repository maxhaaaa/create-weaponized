package net.mcreator.createmilitarysupport.client.renderer;

import com.mojang.math.Axis;

public class TestibcmRenderer extends EntityRenderer<TestibcmEntity> {

	private static final ResourceLocation texture = new ResourceLocation("createmilitary_support:textures/entities/bomb.png");

	private final Modelbomb model;

	public TestibcmRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelbomb(context.bakeLayer(Modelbomb.LAYER_LOCATION));
	}

	@Override
	public void render(TestibcmEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(TestibcmEntity entity) {
		return texture;
	}

}
