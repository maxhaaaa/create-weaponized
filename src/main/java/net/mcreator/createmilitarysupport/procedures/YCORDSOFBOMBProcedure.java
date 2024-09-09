package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.eventbus.api.Event;

public class YCORDSOFBOMBProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "y latest bomb " + entity.getPersistentData().getDouble("ycordbomb");
	}
}
