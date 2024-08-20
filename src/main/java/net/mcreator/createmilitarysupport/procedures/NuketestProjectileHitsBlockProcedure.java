package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModParticleTypes;

public class NuketestProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yheight = 0;
		double increase = 0;
		loop = 0;
		particleAmount = 5;
		xRadius = 5;
		zRadius = 5;
		yheight = 0;
		for (int index0 = 0; index0 < 80; index0++) {
			while (loop < particleAmount) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight), (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 10, Level.ExplosionInteraction.MOB);
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.NUCLEARFIREE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			increase = increase + 1;
			yheight = 50;
			if (increase == 4) {
				particleAmount = particleAmount + 1;
				increase = 0;
			}
			loop = 0;
			xRadius = xRadius + 1;
			zRadius = zRadius + 1;
		}
		xRadius = 5;
		particleAmount = 5;
		zRadius = 5;
		yheight = 5;
		loop = 0;
		for (int index2 = 0; index2 < 80; index2++) {
			while (loop < particleAmount) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight), (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 10, Level.ExplosionInteraction.MOB);
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.NUCLEARFIREE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			increase = increase + 1;
			if (increase == 4) {
				particleAmount = particleAmount + 1;
				increase = 0;
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
		for (int index4 = 0; index4 < 40; index4++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.NUCLEARSMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
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
		for (int index6 = 0; index6 < 100; index6++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.NUCLEARSMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
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
		xRadius = 10;
		zRadius = 10;
		yheight = 40;
		for (int index8 = 0; index8 < 15; index8++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.NUCLEARSMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight + 1;
		}
	}
}
