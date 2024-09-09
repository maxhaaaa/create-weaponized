package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.eventbus.api.Event;

public class StrikelauncherblockylocateProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "y " + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("launcherblocky"));
	}
}
