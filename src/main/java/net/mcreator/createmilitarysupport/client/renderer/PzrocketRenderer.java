package net.mcreator.createmilitarysupport.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createmilitarysupport.entity.PzrocketEntity;
import net.mcreator.createmilitarysupport.client.model.Modelpz_roket;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PzrocketRenderer extends EntityRenderer<PzrocketEntity> {
	private static final ResourceLocation texture = new ResourceLocation("createmilitary_support:textures/entities/pzrock.png");
	private final Modelpz_roket model;

	public PzrocketRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelpz_roket(context.bakeLayer(Modelpz_roket.LAYER_LOCATION));
	}

	@Override
	public void render(PzrocketEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(PzrocketEntity entity) {
		return texture;
	}
}
