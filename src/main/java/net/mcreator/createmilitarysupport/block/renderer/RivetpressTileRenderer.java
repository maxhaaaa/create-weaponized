package net.mcreator.createmilitarysupport.block.renderer;

public class RivetpressTileRenderer extends GeoBlockRenderer<RivetpressTileEntity> {
	public RivetpressTileRenderer() {
		super(new RivetpressBlockModel());
	}

	@Override
	public RenderType getRenderType(RivetpressTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}