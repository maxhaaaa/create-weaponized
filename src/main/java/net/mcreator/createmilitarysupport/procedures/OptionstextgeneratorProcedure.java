package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class OptionstextgeneratorProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gen_option") == 0) {
			return "HE 250KG bomb card";
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gen_option") == 1) {
			return "HE 500KG bomb card";
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gen_option") == 2) {
			return "HE 57KG missle card";
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gen_option") == 3) {
			return "HE 10000KG nuclear mortar card";
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gen_option") == 4) {
			return "10kg indicary bomb";
		}
		return "error bomb does not exist- option : " + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("gen_option"));
	}
}
