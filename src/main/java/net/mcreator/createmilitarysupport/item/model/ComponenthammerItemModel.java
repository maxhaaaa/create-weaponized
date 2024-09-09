package net.mcreator.createmilitarysupport.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.item.ComponenthammerItem;

public class ComponenthammerItemModel extends GeoModel<ComponenthammerItem> {
	@Override
	public ResourceLocation getAnimationResource(ComponenthammerItem animatable) {
		return new ResourceLocation("createmilitary_support", "animations/component_hammer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ComponenthammerItem animatable) {
		return new ResourceLocation("createmilitary_support", "geo/component_hammer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ComponenthammerItem animatable) {
		return new ResourceLocation("createmilitary_support", "textures/item/component_hammer.png");
	}
}
