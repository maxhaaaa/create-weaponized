package net.mcreator.createmilitarysupport.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createmilitarysupport.block.model.RivetpressDisplayModel;
import net.mcreator.createmilitarysupport.block.display.RivetpressDisplayItem;

public class RivetpressDisplayItemRenderer extends GeoItemRenderer<RivetpressDisplayItem> {
	public RivetpressDisplayItemRenderer() {
		super(new RivetpressDisplayModel());
	}

	@Override
	public RenderType getRenderType(RivetpressDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
