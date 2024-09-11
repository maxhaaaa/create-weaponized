package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;

public class LookinglocationXProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "x " + entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(300)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
	}
}
