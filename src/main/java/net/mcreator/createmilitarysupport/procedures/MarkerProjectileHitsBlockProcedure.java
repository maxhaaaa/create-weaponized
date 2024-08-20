package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModEntities;
import net.mcreator.createmilitarysupport.entity.TestprojectileEntity;

public class MarkerProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new TestprojectileEntity(CreatemilitarySupportModEntities.TESTPROJECTILE.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 0, 0);
			_entityToSpawn.setPos(x, (y + 100), z);
			_entityToSpawn.shoot(0, 1, 0, 5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
