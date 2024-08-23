
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.createmilitarysupport.client.particle.SmokeParticle;
import net.mcreator.createmilitarysupport.client.particle.NuclearsmokeParticle;
import net.mcreator.createmilitarysupport.client.particle.NuclearfireeParticle;
import net.mcreator.createmilitarysupport.client.particle.NuclearfireParticle;
import net.mcreator.createmilitarysupport.client.particle.FireParticle;
import net.mcreator.createmilitarysupport.client.particle.ExplosionsmokeParticle;
import net.mcreator.createmilitarysupport.client.particle.BuzzFlashParticle;
import net.mcreator.createmilitarysupport.client.particle.BasicsinbombsexplosionorangeParticle;
import net.mcreator.createmilitarysupport.client.particle.BasicsinbombsexplosionFire1Particle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatemilitarySupportModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.FIRE.get(), FireParticle::provider);
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.SMOKE.get(), SmokeParticle::provider);
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.NUCLEARFIRE.get(), NuclearfireParticle::provider);
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.NUCLEARSMOKE.get(), NuclearsmokeParticle::provider);
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.NUCLEARFIREE.get(), NuclearfireeParticle::provider);
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.BASICSINBOMBSEXPLOSION_FIRE_1.get(), BasicsinbombsexplosionFire1Particle::provider);
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.BASICSINBOMBSEXPLOSIONORANGE.get(), BasicsinbombsexplosionorangeParticle::provider);
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.BUZZ_FLASH.get(), BuzzFlashParticle::provider);
		event.registerSpriteSet(CreatemilitarySupportModParticleTypes.EXPLOSIONSMOKE.get(), ExplosionsmokeParticle::provider);
	}
}
