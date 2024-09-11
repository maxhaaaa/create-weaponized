package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModItems;

import java.util.function.Supplier;
import java.util.Map;

public class OnBombCrafterButtonPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack bombOutput = ItemStack.EMPTY;
		double RadiusIncrease = 0;
		double slotNum = 0;
		double ExplosionCountIncrease = 0;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY).getItem() == CreatemilitarySupportModItems.BOMB_CASING
				.get()) {
			slotNum = 0;
			RadiusIncrease = 0;
			ExplosionCountIncrease = 0;
			for (int index0 = 0; index0 < 6; index0++) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slotNum)).getItem() : ItemStack.EMPTY)
						.getItem() == CreatemilitarySupportModItems.BOMB_EXPLOSION_RADIUS.get()) {
					RadiusIncrease = RadiusIncrease + 2;
				}
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slotNum)).getItem() : ItemStack.EMPTY)
						.getItem() == CreatemilitarySupportModItems.BOMB_EXPLOSION_AMOUNT.get()) {
					ExplosionCountIncrease = ExplosionCountIncrease + 1;
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get((int) slotNum)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				slotNum = slotNum + 1;
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) slotNum)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			bombOutput = new ItemStack(CreatemilitarySupportModItems.LOADED_BOMB.get());
			bombOutput.getOrCreateTag().putDouble("radiusIncrease", RadiusIncrease);
			bombOutput.getOrCreateTag().putDouble("explosionCountIncrease", ExplosionCountIncrease);
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = bombOutput.copy();
				_setstack.setCount(1);
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
