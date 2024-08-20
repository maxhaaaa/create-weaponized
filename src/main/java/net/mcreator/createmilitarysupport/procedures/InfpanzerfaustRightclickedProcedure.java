package net.mcreator.createmilitarysupport.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.createmilitarysupport.item.InfpanzerfaustItem;
import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModEntities;
import net.mcreator.createmilitarysupport.entity.PzrocketEntity;

public class InfpanzerfaustRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() instanceof InfpanzerfaustItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "animation.panzerfaust.fire");
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new PzrocketEntity(CreatemilitarySupportModEntities.PZROCKET.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 5, 1);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
