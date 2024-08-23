package net.mcreator.createmilitarysupport.block.renderer;

public class RivetpressDisplayItemRenderer extends GeoItemRenderer<RivetpressDisplayItem> {
	public RivetpressDisplayItemRenderer() {
		super(new RivetpressDisplayModel());
	}

	@Override
	public RenderType getRenderType(RivetpressDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}