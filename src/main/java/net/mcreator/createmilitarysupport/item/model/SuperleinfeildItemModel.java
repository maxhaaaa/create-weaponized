package net.mcreator.createmilitarysupport.item.model;

public class SuperleinfeildItemModel extends GeoModel<SuperleinfeildItem> {
	@Override
	public ResourceLocation getAnimationResource(SuperleinfeildItem animatable) {
		return new ResourceLocation("createmilitary_support", "animations/mark_3_-leinfeild.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SuperleinfeildItem animatable) {
		return new ResourceLocation("createmilitary_support", "geo/mark_3_-leinfeild.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SuperleinfeildItem animatable) {
		return new ResourceLocation("createmilitary_support", "textures/item/wunderwaffen-lee_enfeild.png");
	}
}