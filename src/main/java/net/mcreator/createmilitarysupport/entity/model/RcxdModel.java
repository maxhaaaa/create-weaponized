package net.mcreator.createmilitarysupport.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class RcxdModel extends GeoModel<RcxdEntity> {
	@Override
	public ResourceLocation getAnimationResource(RcxdEntity entity) {
		return new ResourceLocation("createmilitary_support", "animations/rcxd.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RcxdEntity entity) {
		return new ResourceLocation("createmilitary_support", "geo/rcxd.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RcxdEntity entity) {
		return new ResourceLocation("createmilitary_support", "textures/entities/" + entity.getTexture() + ".png");
	}

}