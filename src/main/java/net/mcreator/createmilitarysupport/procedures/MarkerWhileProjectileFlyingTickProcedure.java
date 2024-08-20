package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.entity.Entity;

public class MarkerWhileProjectileFlyingTickProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.startRiding(immediatesourceentity);
	}
}
