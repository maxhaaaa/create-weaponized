package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.entity.Entity;

public class YCORDSOFBOMBProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "y latest bomb " + entity.getPersistentData().getDouble("ycordbomb");
	}
}
