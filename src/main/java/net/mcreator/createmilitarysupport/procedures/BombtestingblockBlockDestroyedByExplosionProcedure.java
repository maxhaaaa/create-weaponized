package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BombtestingblockBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CreatemilitarySupportMod.queueServerWork(200, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new TestbombEntity(CreatemilitarySupportModEntities.TESTBOMB.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 5, 1);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(0, 0, 0, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
	}
}
