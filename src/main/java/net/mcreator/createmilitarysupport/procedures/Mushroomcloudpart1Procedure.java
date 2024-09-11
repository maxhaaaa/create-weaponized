package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModParticleTypes;

public class Mushroomcloudpart1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double yheight = 0;
		double increase = 0;
		double sphereloop = 0;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("createmilitary_support:updated_nuke_noise")), SoundSource.MASTER, 1000, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("createmilitary_support:updated_nuke_noise")), SoundSource.MASTER, 1000, 1, false);
			}
		}
		loop = 0;
		sphereloop = 3;
		particleAmount = 50;
		xRadius = 1;
		zRadius = 1;
		yheight = 0;
		size = 0;
		for (int index0 = 0; index0 < (int) sphereloop; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				while (loop < particleAmount) {
					world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.EXPLOSIONSMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
							(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.01, 0);
					loop = loop + 1;
				}
				yheight = yheight + 1;
				loop = 0;
				if (increase == 4) {
					particleAmount = particleAmount + 10;
					increase = 0;
				} else {
					increase = increase + 1;
				}
				xRadius = xRadius + 2;
				zRadius = zRadius + 2;
			}
		}
		for (int index3 = 0; index3 < (int) sphereloop; index3++) {
			for (int index4 = 0; index4 < 5; index4++) {
				while (loop < particleAmount) {
					world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.EXPLOSIONSMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
							(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.01, 0);
					loop = loop + 1;
				}
				yheight = yheight + 1;
				loop = 0;
				if (increase == 4) {
					particleAmount = particleAmount + 10;
					increase = 0;
				} else {
					increase = increase + 1;
				}
				xRadius = xRadius - 2;
				zRadius = zRadius - 2;
			}
		}
		loop = 0;
		particleAmount = 30;
		xRadius = 5;
		zRadius = 5;
		yheight = 0;
		size = 0;
		for (int index6 = 0; index6 < 50; index6++) {
			while (loop < particleAmount) {
				world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.EXPLOSIONSMOKE.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight),
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
				loop = loop + 1;
			}
			loop = 0;
			yheight = yheight - 1;
		}
		loop = 0;
		particleAmount = 50;
		sphereloop = 5;
		xRadius = 1;
		zRadius = 1;
		yheight = 0;
		for (int index8 = 0; index8 < (int) sphereloop; index8++) {
			for (int index9 = 0; index9 < 5; index9++) {
				while (loop < particleAmount) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + yheight), (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 10, Level.ExplosionInteraction.MOB);
					loop = loop + 1;
				}
				yheight = yheight - 1;
				loop = 0;
				if (increase == 4) {
					particleAmount = particleAmount + 10;
					increase = 0;
				} else {
					increase = increase + 1;
				}
				xRadius = xRadius - 2;
				zRadius = zRadius - 2;
			}
		}
	}
}
