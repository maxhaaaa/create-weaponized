package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class PzrocketProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (entity.getDeltaMovement().x() > 0) {
			if (entity.getDeltaMovement().z() > 0) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				immediatesourceentity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() - world.getBlockState(BlockPos.containing(x, y, z)).getDestroySpeed(world, BlockPos.containing(x, y, z)) / 2),
						(entity.getDeltaMovement().y() - world.getBlockState(BlockPos.containing(x, y, z)).getDestroySpeed(world, BlockPos.containing(x, y, z)) / 3),
						(entity.getDeltaMovement().z() - world.getBlockState(BlockPos.containing(x, y, z)).getDestroySpeed(world, BlockPos.containing(x, y, z)) / 2)));
			} else {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
			}
		} else {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
		}
	}
}
