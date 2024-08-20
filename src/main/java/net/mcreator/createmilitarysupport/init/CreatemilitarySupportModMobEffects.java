
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.createmilitarysupport.potion.HudshakyMobEffect;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class CreatemilitarySupportModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<MobEffect> HUDSHAKY = REGISTRY.register("hudshaky", () -> new HudshakyMobEffect());
}
