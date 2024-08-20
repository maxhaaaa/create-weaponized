package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class Sc500projectileProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yheight = 0;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 50, Level.ExplosionInteraction.MOB);
		loop = 0;
		particleAmount = 30;
		xRadius = 5;
		zRadius = 5;
		yheight = 0;
		size = 0;
		for (int index0 = 0; index0 < 5; index0++) {
			while (loop < particleAmount) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight), (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 5, Level.ExplosionInteraction.MOB);
				loop = loop + 1;
			}
			loop = 0;
			xRadius = xRadius + 1;
			zRadius = zRadius + 1;
		}
	}
}
