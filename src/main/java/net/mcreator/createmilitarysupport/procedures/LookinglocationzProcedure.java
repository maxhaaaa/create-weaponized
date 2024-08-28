package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.eventbus.api.Event;

public class LookinglocationzProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "z" + entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(300)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
	}
}
