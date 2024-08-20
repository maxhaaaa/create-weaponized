package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.entity.Entity;

public class Flying_bomb_overlayProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.getPersistentData().putDouble("bomb_overlay", 1);
		entity.getPersistentData().putDouble("bomb-y", (immediatesourceentity.getY()));
	}
}
