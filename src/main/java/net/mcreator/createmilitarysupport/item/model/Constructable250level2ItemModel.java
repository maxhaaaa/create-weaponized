package net.mcreator.createmilitarysupport.item.model;

public class Constructable250level2ItemModel extends GeoModel<Constructable250level2Item> {
	@Override
	public ResourceLocation getAnimationResource(Constructable250level2Item animatable) {
		return new ResourceLocation("createmilitary_support", "animations/bomb_constructuble-sc150.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Constructable250level2Item animatable) {
		return new ResourceLocation("createmilitary_support", "geo/bomb_constructuble-sc150.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Constructable250level2Item animatable) {
		return new ResourceLocation("createmilitary_support", "textures/item/constructible_bomb.png");
	}
}