
package net.mcreator.createmilitarysupport.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.createmilitarysupport.procedures.HudshakyActiveTickConditionProcedure;

public class HudshakyMobEffect extends MobEffect {
	public HudshakyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HudshakyActiveTickConditionProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
