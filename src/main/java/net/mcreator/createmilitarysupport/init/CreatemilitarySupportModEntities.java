
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.createmilitarysupport.entity.TestprojectileEntity;
import net.mcreator.createmilitarysupport.entity.TestbombEntity;
import net.mcreator.createmilitarysupport.entity.SpecialbulletEntity;
import net.mcreator.createmilitarysupport.entity.SoldierfireEntity;
import net.mcreator.createmilitarysupport.entity.Sc500projectileEntity;
import net.mcreator.createmilitarysupport.entity.Sc500marketEntity;
import net.mcreator.createmilitarysupport.entity.RcxdEntity;
import net.mcreator.createmilitarysupport.entity.PzrocketEntity;
import net.mcreator.createmilitarysupport.entity.NuketestEntity;
import net.mcreator.createmilitarysupport.entity.Missle57kgEntity;
import net.mcreator.createmilitarysupport.entity.MarkerEntity;
import net.mcreator.createmilitarysupport.entity.Explode5Entity;
import net.mcreator.createmilitarysupport.entity.BurnyboiEntity;
import net.mcreator.createmilitarysupport.entity.BeavTestProjectileEntity;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreatemilitarySupportModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<EntityType<TestprojectileEntity>> TESTPROJECTILE = register("testprojectile",
			EntityType.Builder.<TestprojectileEntity>of(TestprojectileEntity::new, MobCategory.MISC).setCustomClientFactory(TestprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MarkerEntity>> MARKER = register("marker",
			EntityType.Builder.<MarkerEntity>of(MarkerEntity::new, MobCategory.MISC).setCustomClientFactory(MarkerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpecialbulletEntity>> SPECIALBULLET = register("specialbullet",
			EntityType.Builder.<SpecialbulletEntity>of(SpecialbulletEntity::new, MobCategory.MISC).setCustomClientFactory(SpecialbulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoldierfireEntity>> SOLDIERFIRE = register("soldierfire",
			EntityType.Builder.<SoldierfireEntity>of(SoldierfireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SoldierfireEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sc500projectileEntity>> SC_500PROJECTILE = register("sc_500projectile", EntityType.Builder.<Sc500projectileEntity>of(Sc500projectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(Sc500projectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Sc500marketEntity>> SC_500MARKET = register("sc_500market",
			EntityType.Builder.<Sc500marketEntity>of(Sc500marketEntity::new, MobCategory.MISC).setCustomClientFactory(Sc500marketEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NuketestEntity>> NUKETEST = register("nuketest",
			EntityType.Builder.<NuketestEntity>of(NuketestEntity::new, MobCategory.MISC).setCustomClientFactory(NuketestEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Explode5Entity>> EXPLODE_5 = register("explode_5",
			EntityType.Builder.<Explode5Entity>of(Explode5Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Explode5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Missle57kgEntity>> MISSLE_57KG = register("missle_57kg",
			EntityType.Builder.<Missle57kgEntity>of(Missle57kgEntity::new, MobCategory.MISC).setCustomClientFactory(Missle57kgEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BurnyboiEntity>> BURNYBOI = register("burnyboi",
			EntityType.Builder.<BurnyboiEntity>of(BurnyboiEntity::new, MobCategory.MISC).setCustomClientFactory(BurnyboiEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RcxdEntity>> RCXD = register("rcxd",
			EntityType.Builder.<RcxdEntity>of(RcxdEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RcxdEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<PzrocketEntity>> PZROCKET = register("pzrocket",
			EntityType.Builder.<PzrocketEntity>of(PzrocketEntity::new, MobCategory.MISC).setCustomClientFactory(PzrocketEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TestbombEntity>> TESTBOMB = register("testbomb",
			EntityType.Builder.<TestbombEntity>of(TestbombEntity::new, MobCategory.MISC).setCustomClientFactory(TestbombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BeavTestProjectileEntity>> BEAV_TEST_PROJECTILE = register("beav_test_projectile", EntityType.Builder.<BeavTestProjectileEntity>of(BeavTestProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BeavTestProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SoldierfireEntity.init();
			Explode5Entity.init();
			RcxdEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SOLDIERFIRE.get(), SoldierfireEntity.createAttributes().build());
		event.put(EXPLODE_5.get(), Explode5Entity.createAttributes().build());
		event.put(RCXD.get(), RcxdEntity.createAttributes().build());
	}
}
