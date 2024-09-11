package net.mcreator.createmilitarysupport.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.createmilitarysupport.block.model.TrinitytowerDisplayModel;
import net.mcreator.createmilitarysupport.block.display.TrinitytowerDisplayItem;

public class TrinitytowerDisplayItemRenderer extends GeoItemRenderer<TrinitytowerDisplayItem> {
	public TrinitytowerDisplayItemRenderer() {
		super(new TrinitytowerDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrinitytowerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
