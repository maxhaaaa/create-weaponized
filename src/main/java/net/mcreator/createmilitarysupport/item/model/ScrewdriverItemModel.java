package net.mcreator.createmilitarysupport.item.model;

public class ScrewdriverItemModel extends GeoModel<ScrewdriverItem> {
	@Override
	public ResourceLocation getAnimationResource(ScrewdriverItem animatable) {
		return new ResourceLocation("createmilitary_support", "animations/screwdriver.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrewdriverItem animatable) {
		return new ResourceLocation("createmilitary_support", "geo/screwdriver.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrewdriverItem animatable) {
		return new ResourceLocation("createmilitary_support", "textures/item/texture.png");
	}
}