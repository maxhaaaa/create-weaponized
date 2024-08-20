package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModParticleTypes;
import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModEntities;

public class Nuketest2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yheight = 0;
		loop = 0;
		particleAmount = 20;
		xRadius = 5;
		zRadius = 5;
		yheight = 0;
		for (int index0 = 0; index0 < 10; index0++) {
			while (loop < particleAmount) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CreatemilitarySupportModEntities.EXPLODE_5.get().spawn(_level,
							BlockPos.containing(x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius, y + yheight, z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				loop = loop + 1;
			}
			loop = 0;
			xRadius = xRadius + 1;
			zRadius = zRadius + 1;
		}
		loop = 0;
		particleAmount = 30;
		xRadius = 5;
		zRadius = 5;
		yheight = 0;
		size = 0;
		for (int index2 = 0; index2 < 20; index2++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.SMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			}
			loop = 0;
			yheight = yheight + 1;
		}
		loop = 0;
		particleAmount = 30;
		xRadius = 15;
		zRadius = 15;
		yheight = 20;
		while (loop < particleAmount) {
			world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.SMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
					(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		loop = 0;
		particleAmount = 30;
		xRadius = 10;
		zRadius = 10;
		yheight = 40;
		for (int index5 = 0; index5 < 15; index5++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.SMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight + 1;
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.MOB);
	}
}
