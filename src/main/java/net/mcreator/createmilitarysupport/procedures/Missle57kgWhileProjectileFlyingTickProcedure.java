package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModParticleTypes;

public class Missle57kgWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getDeltaMovement().x() * 2), (immediatesourceentity.getDeltaMovement().y() * 2), (immediatesourceentity.getDeltaMovement().z() * 2)));
		world.addParticle((SimpleParticleType) (CreatemilitarySupportModParticleTypes.FIRE.get()), x, y, z, 0, 0, 0);
	}
}
