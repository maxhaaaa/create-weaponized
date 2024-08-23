package net.mcreator.createmilitarysupport.block.model;

public class RivetpressBlockModel extends GeoModel<RivetpressTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RivetpressTileEntity animatable) {
		return new ResourceLocation("createmilitary_support", "animations/rivet_presser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RivetpressTileEntity animatable) {
		return new ResourceLocation("createmilitary_support", "geo/rivet_presser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RivetpressTileEntity animatable) {
		return new ResourceLocation("createmilitary_support", "textures/block/riv.png");
	}
}