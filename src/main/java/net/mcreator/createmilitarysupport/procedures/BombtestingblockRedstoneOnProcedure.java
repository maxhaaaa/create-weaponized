package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BombtestingblockRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.DELETED_MOD_ELEMENT.get()), x, y, z, 0, 1, 0);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("createmilitary_support:distant_nuke")), SoundSource.MASTER, 100, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("createmilitary_support:distant_nuke")), SoundSource.MASTER, 100, 1, false);
			}
		}
		CreatemilitarySupportMod.queueServerWork(95, () -> {
			MushroombasicsinbombsProcedure.execute(world, x, y, z);
		});
	}
}
