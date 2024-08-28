package net.mcreator.createmilitarysupport.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createmilitarysupport.block.model.RivetpressBlockModel;
import net.mcreator.createmilitarysupport.block.entity.RivetpressTileEntity;

public class RivetpressTileRenderer extends GeoBlockRenderer<RivetpressTileEntity> {
	public RivetpressTileRenderer() {
		super(new RivetpressBlockModel());
	}

	@Override
	public RenderType getRenderType(RivetpressTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
