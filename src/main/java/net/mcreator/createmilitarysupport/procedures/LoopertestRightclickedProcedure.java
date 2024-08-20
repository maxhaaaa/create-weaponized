package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.createmilitarysupport.item.LoopertestItem;

public class LoopertestRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("loopf") == 1) {
			if (itemstack.getItem() instanceof LoopertestItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.packaging.hammer.bonk");
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("loopf", 0);
		} else {
			if (itemstack.getItem() instanceof LoopertestItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "empty");
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("loopf", 1);
		}
	}
}
