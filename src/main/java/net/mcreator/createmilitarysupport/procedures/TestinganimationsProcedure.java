package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.createmilitarysupport.item.StrikeDeviceanimatedItem;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class TestinganimationsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof StrikeDeviceanimatedItem)
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("geckoAnim", "animation.strike_device.open_lid");
		CreatemilitarySupportMod.queueServerWork(5, () -> {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof StrikeDeviceanimatedItem)
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("geckoAnim", "animation.strike_device.putting_card");
		});
		CreatemilitarySupportMod.queueServerWork(10, () -> {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof StrikeDeviceanimatedItem)
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("geckoAnim", "animation.strike_device.use");
		});
	}
}
