package net.mcreator.createmilitarysupport.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.item.StrikeDeviceanimatedItem;

public class StrikeDeviceanimatedItemModel extends GeoModel<StrikeDeviceanimatedItem> {
	@Override
	public ResourceLocation getAnimationResource(StrikeDeviceanimatedItem animatable) {
		return new ResourceLocation("createmilitary_support", "animations/strike_device_new.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StrikeDeviceanimatedItem animatable) {
		return new ResourceLocation("createmilitary_support", "geo/strike_device_new.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StrikeDeviceanimatedItem animatable) {
		return new ResourceLocation("createmilitary_support", "textures/item/strikey.png");
	}
}
