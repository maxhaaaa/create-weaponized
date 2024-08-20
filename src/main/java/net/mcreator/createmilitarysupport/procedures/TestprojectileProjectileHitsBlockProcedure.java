package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModParticleTypes;

public class TestprojectileProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double loop = 0;
		double particleAmount = 0;
		double xRadius = 0;
		double zRadius = 0;
		double yheight = 0;
		double desired_shape_loop = 0;
		double size = 0;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 50, Level.ExplosionInteraction.MOB);
		loop = 0;
		particleAmount = 30;
		xRadius = 5;
		zRadius = 5;
		yheight = 0;
		size = 0;
		for (int index0 = 0; index0 < 30; index0++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.SMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight + 1;
		}
		loop = 0;
		particleAmount = 50;
		xRadius = 20;
		zRadius = 20;
		yheight = 15;
		for (int index2 = 0; index2 < 2; index2++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.SMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight + 1;
		}
		loop = 0;
		particleAmount = 50;
		xRadius = 10;
		zRadius = 10;
		yheight = 30;
		for (int index4 = 0; index4 < 10; index4++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.SMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight + 1;
		}
	}
}
