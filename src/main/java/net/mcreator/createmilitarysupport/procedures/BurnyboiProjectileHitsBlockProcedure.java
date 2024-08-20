package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class BurnyboiProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yheight = 0;
		loop = 0;
		particleAmount = 10;
		xRadius = 5;
		zRadius = 5;
		yheight = 3;
		size = 0;
		for (int index0 = 0; index0 < 20; index0++) {
			while (loop < particleAmount) {
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level, BlockPos.containing(x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius, y + yheight, z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius),
							Blocks.FIRE.defaultBlockState());
				loop = loop + 1;
			}
			loop = 0;
			xRadius = xRadius + 1;
			zRadius = zRadius + 1;
		}
	}
}
