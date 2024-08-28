package net.mcreator.createmilitarysupport.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.item.Construcables250Item;

public class Construcables250ItemModel extends GeoModel<Construcables250Item> {
	@Override
	public ResourceLocation getAnimationResource(Construcables250Item animatable) {
		return new ResourceLocation("createmilitary_support", "animations/bomb_constructuble-sc150.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Construcables250Item animatable) {
		return new ResourceLocation("createmilitary_support", "geo/bomb_constructuble-sc150.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Construcables250Item animatable) {
		return new ResourceLocation("createmilitary_support", "textures/item/constructible_bomb.png");
	}
}
