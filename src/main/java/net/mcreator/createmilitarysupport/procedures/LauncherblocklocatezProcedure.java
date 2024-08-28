package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.eventbus.api.Event;

public class LauncherblocklocatezProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "z " + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("launcherblockz"));
	}
}
