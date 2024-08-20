package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModItems;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class RivetpressOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create:depot"))) {
			CreatemilitarySupportMod.LOGGER.info("depo below!");
			if (new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, BlockPos.containing(x, y, z), 100) == 100) {
				CreatemilitarySupportMod.LOGGER.info("water here!");
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y - 1, z), 0)).getItem() == CreatemilitarySupportModItems.LEVEL_1PLATE.get()) {
					CreatemilitarySupportMod.LOGGER.info("initiating plate 1- playing animation");
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					CreatemilitarySupportMod.LOGGER.info("waiting");
					CreatemilitarySupportMod.queueServerWork(10, () -> {
						if ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y - 1, z), 0)).getItem() == CreatemilitarySupportModItems.LEVEL_1PLATE.get()) {
							CreatemilitarySupportMod.LOGGER.info("item still there");
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
								if (_ent != null) {
									final int _slotid = 0;
									final ItemStack _setstack = new ItemStack(CreatemilitarySupportModItems.LEVEL_2PLATE.get()).copy();
									_setstack.setCount(1);
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
								if (_ent != null) {
									final int _slotid = 1;
									final ItemStack _setstack = new ItemStack(CreatemilitarySupportModItems.LEVEL_2PLATE.get()).copy();
									_setstack.setCount(1);
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
						} else {
							CreatemilitarySupportMod.LOGGER.info("item moved. stopping");
						}
					});
				}
			}
		}
	}
}
