package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.eventbus.api.Event;

public class LoadedBombRangedItemShootsProjectileProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("explosionCountIncrease", (itemstack.getOrCreateTag().getDouble("explosionCountIncrease")));
		entity.getPersistentData().putDouble("radiusIncrease", (itemstack.getOrCreateTag().getDouble("radiusIncrease")));
	}
}
