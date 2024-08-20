package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModParticleTypes;

public class MushroombasicsinbombsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yheight = 0;
		double increase = 0;
		loop = 0;
		particleAmount = 30;
		xRadius = 5;
		zRadius = 5;
		yheight = 0;
		size = 0;
		for (int index0 = 0; index0 < 40; index0++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.BASICSINBOMBSEXPLOSION_FIRE_1.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight + 1;
		}
		loop = 0;
		particleAmount = 30;
		xRadius = 15;
		zRadius = 15;
		yheight = 20;
		for (int index2 = 0; index2 < 100; index2++) {
			while (loop < particleAmount) {
				while (world.isEmptyBlock(BlockPos.containing(x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius, yheight, z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius))) {
					yheight = yheight - 1;
				}
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.NUCLEARSMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), yheight,
						(z + 5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
				yheight = 50;
			}
			increase = increase + 1;
			if (increase == 4) {
				particleAmount = particleAmount + 4;
				increase = 0;
			}
			loop = 0;
			xRadius = xRadius + 1;
			zRadius = zRadius + 1;
		}
		loop = 0;
		particleAmount = 20;
		xRadius = 20;
		zRadius = 20;
		yheight = 50;
		for (int index5 = 0; index5 < 15; index5++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.BASICSINBOMBSEXPLOSION_FIRE_1.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight + 1;
		}
		loop = 0;
		particleAmount = 20;
		xRadius = 10;
		zRadius = 10;
		yheight = 40;
		for (int index7 = 0; index7 < 15; index7++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.BASICSINBOMBSEXPLOSIONORANGE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight + 1;
		}
	}
}
