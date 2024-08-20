package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModItems;

import java.util.function.Supplier;
import java.util.Map;

public class ClickingrequestbuttonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(CreatemilitarySupportModItems.LEVEL_1PLATE.get()).copy();
			_setstack.setCount(1);
			((Slot) _slots.get(0)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
