package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class DebugRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double nummm = 0;
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
			int _amount = 100;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		CreatemilitarySupportMod.LOGGER.info(blockstate.getBlock().getStateDefinition().getProperty("speed") instanceof IntegerProperty _getip2 ? blockstate.getValue(_getip2) : -1);
	}
}
