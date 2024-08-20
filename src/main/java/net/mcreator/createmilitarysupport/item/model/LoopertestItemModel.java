package net.mcreator.createmilitarysupport.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.item.LoopertestItem;

public class LoopertestItemModel extends GeoModel<LoopertestItem> {
	@Override
	public ResourceLocation getAnimationResource(LoopertestItem animatable) {
		return new ResourceLocation("createmilitary_support", "animations/packaging_hammer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LoopertestItem animatable) {
		return new ResourceLocation("createmilitary_support", "geo/packaging_hammer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LoopertestItem animatable) {
		return new ResourceLocation("createmilitary_support", "textures/item/looper_test.png");
	}
}
