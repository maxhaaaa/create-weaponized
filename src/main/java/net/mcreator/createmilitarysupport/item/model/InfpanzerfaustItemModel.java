package net.mcreator.createmilitarysupport.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.item.InfpanzerfaustItem;

public class InfpanzerfaustItemModel extends GeoModel<InfpanzerfaustItem> {
	@Override
	public ResourceLocation getAnimationResource(InfpanzerfaustItem animatable) {
		return new ResourceLocation("createmilitary_support", "animations/inf_panzerfaust.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfpanzerfaustItem animatable) {
		return new ResourceLocation("createmilitary_support", "geo/inf_panzerfaust.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfpanzerfaustItem animatable) {
		return new ResourceLocation("createmilitary_support", "textures/item/infpanzera.png");
	}
}
