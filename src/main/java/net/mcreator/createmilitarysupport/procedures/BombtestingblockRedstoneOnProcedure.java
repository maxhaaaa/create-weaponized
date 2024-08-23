package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModParticleTypes;

public class BombtestingblockRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.BUZZ_FLASH.get()), x, y, z, 0, 1, 0);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("createmilitary_support:distant_nuke")), SoundSource.MASTER, 10000, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("createmilitary_support:distant_nuke")), SoundSource.MASTER, 10000, 1, false);
			}
		}
		MushroombasicsinbombsProcedure.execute(world, x, y, z);
	}
}
