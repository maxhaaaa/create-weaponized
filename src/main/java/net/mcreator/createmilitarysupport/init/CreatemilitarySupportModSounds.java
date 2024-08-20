
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class CreatemilitarySupportModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<SoundEvent> BULLET_HIT = REGISTRY.register("bullet_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("createmilitary_support", "bullet_hit")));
	public static final RegistryObject<SoundEvent> BULLET_HIT_2 = REGISTRY.register("bullet_hit_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("createmilitary_support", "bullet_hit_2")));
	public static final RegistryObject<SoundEvent> DISTANT_NUKE = REGISTRY.register("distant_nuke", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("createmilitary_support", "distant_nuke")));
}
