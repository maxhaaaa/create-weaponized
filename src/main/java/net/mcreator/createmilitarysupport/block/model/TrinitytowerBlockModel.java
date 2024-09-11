package net.mcreator.createmilitarysupport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.block.entity.TrinitytowerTileEntity;

public class TrinitytowerBlockModel extends GeoModel<TrinitytowerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrinitytowerTileEntity animatable) {
		return new ResourceLocation("createmilitary_support", "animations/trinity_drop_tower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrinitytowerTileEntity animatable) {
		return new ResourceLocation("createmilitary_support", "geo/trinity_drop_tower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrinitytowerTileEntity animatable) {
		return new ResourceLocation("createmilitary_support", "textures/block/trinyy.png");
	}
}
