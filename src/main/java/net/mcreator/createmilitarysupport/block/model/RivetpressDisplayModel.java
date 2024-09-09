package net.mcreator.createmilitarysupport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.block.display.RivetpressDisplayItem;

public class RivetpressDisplayModel extends GeoModel<RivetpressDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RivetpressDisplayItem animatable) {
		return new ResourceLocation("createmilitary_support", "animations/rivet_presser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RivetpressDisplayItem animatable) {
		return new ResourceLocation("createmilitary_support", "geo/rivet_presser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RivetpressDisplayItem entity) {
		return new ResourceLocation("createmilitary_support", "textures/block/riv.png");
	}
}
