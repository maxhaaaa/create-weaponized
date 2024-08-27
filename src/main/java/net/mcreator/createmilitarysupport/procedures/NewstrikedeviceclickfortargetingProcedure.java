package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModItems;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

import java.util.concurrent.atomic.AtomicReference;

public class NewstrikedeviceclickfortargetingProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(itemstack.getOrCreateTag().getDouble("launcherblockx"), itemstack.getOrCreateTag().getDouble("launcherblocky"), itemstack.getOrCreateTag().getDouble("launcherblockz")), 0))
				.getItem() == CreatemilitarySupportModItems.SC_500PUNCHCARD.get()) {
			CreatemilitarySupportMod.LOGGER.info("bombs test success");
		}
	}
}
