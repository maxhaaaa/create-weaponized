package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.entity.Entity;

public class BomboverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("bomb_overlay") == 1) {
			return true;
		}
		return false;
	}
}
