package net.mcreator.createmilitarysupport.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createmilitarysupport.block.model.TrinitytowerBlockModel;
import net.mcreator.createmilitarysupport.block.entity.TrinitytowerTileEntity;

public class TrinitytowerTileRenderer extends GeoBlockRenderer<TrinitytowerTileEntity> {
	public TrinitytowerTileRenderer() {
		super(new TrinitytowerBlockModel());
	}

	@Override
	public RenderType getRenderType(TrinitytowerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
