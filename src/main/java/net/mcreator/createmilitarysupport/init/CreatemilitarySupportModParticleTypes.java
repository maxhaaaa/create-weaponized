
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class CreatemilitarySupportModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<SimpleParticleType> FIRE = REGISTRY.register("fire", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SMOKE = REGISTRY.register("smoke", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> NUCLEARFIRE = REGISTRY.register("nuclearfire", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> NUCLEARSMOKE = REGISTRY.register("nuclearsmoke", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> NUCLEARFIREE = REGISTRY.register("nuclearfiree", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BASICSINBOMBSEXPLOSION_FIRE_1 = REGISTRY.register("basicsinbombsexplosion_fire_1", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BASICSINBOMBSEXPLOSIONORANGE = REGISTRY.register("basicsinbombsexplosionorange", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BUZZ_FLASH = REGISTRY.register("buzz_flash", () -> new SimpleParticleType(true));
}
