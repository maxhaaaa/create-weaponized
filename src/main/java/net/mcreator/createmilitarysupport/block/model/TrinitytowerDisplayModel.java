package net.mcreator.createmilitarysupport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.block.display.TrinitytowerDisplayItem;

public class TrinitytowerDisplayModel extends GeoModel<TrinitytowerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrinitytowerDisplayItem animatable) {
		return new ResourceLocation("createmilitary_support", "animations/trinity_drop_tower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrinitytowerDisplayItem animatable) {
		return new ResourceLocation("createmilitary_support", "geo/trinity_drop_tower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrinitytowerDisplayItem entity) {
		return new ResourceLocation("createmilitary_support", "textures/block/trinyy.png");
	}
}
