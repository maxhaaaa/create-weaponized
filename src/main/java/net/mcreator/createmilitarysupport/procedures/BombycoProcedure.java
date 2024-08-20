package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.entity.Entity;

public class BombycoProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Y- " + entity.getPersistentData().getDouble("bomb-y");
	}
}
