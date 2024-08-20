package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class TextgeneratorProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "{=+=} " + ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("militarycredit"));
	}
}
