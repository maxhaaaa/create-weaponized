package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class LoadedBombRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("explosionCountIncrease") + 1); index0++) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + Mth.nextDouble(RandomSource.create(), -10, 10)), (y + Mth.nextDouble(RandomSource.create(), -10, 10)), (z + Mth.nextDouble(RandomSource.create(), -10, 10)),
						(float) (entity.getPersistentData().getDouble("radiusIncrease") + 4), Level.ExplosionInteraction.TNT);
		}
	}
}
