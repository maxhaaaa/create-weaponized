package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class LauncherblocklocatexProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "x" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("launcherblockx"));
	}
}
