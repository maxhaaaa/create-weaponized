package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.createmilitarysupport.item.ScrewdriverItem;
import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModItems;

public class ScrewdriverRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatemilitarySupportModItems.LEVEL_1PLATE.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 20);
			if (itemstack.getItem() instanceof ScrewdriverItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.screwdriver.action");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CreatemilitarySupportModItems.LEVEL_2PLATE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatemilitarySupportModItems.LEVEL_2PLATE.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 20);
			if (itemstack.getItem() instanceof ScrewdriverItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.screwdriver.action");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CreatemilitarySupportModItems.LEVEL_3PLATE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatemilitarySupportModItems.LEVEL_3PLATE.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 20);
			if (itemstack.getItem() instanceof ScrewdriverItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.screwdriver.action");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CreatemilitarySupportModItems.LEVEL_4PLATE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatemilitarySupportModItems.LEVEL_4PLATE.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 20);
			if (itemstack.getItem() instanceof ScrewdriverItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.screwdriver.action");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CreatemilitarySupportModItems.LEVEL_5PLATE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CreatemilitarySupportModItems.LEVEL_5PLATE.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 20);
			if (itemstack.getItem() instanceof ScrewdriverItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.screwdriver.action");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CreatemilitarySupportModItems.FINISHEDREINFORCEDPLATE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("nexta") == 1) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 20);
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof ScrewdriverItem)
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("geckoAnim", "animation.screwdriver.action");
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("currentp",
					((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("currentp") + 1));
		}
	}
}
