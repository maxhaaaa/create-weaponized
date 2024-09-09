
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.createmilitarysupport.client.renderer.TestibcmRenderer;
import net.mcreator.createmilitarysupport.client.renderer.TestbombRenderer;
import net.mcreator.createmilitarysupport.client.renderer.SoldierfireRenderer;
import net.mcreator.createmilitarysupport.client.renderer.RcxdRenderer;
import net.mcreator.createmilitarysupport.client.renderer.PzrocketRenderer;
import net.mcreator.createmilitarysupport.client.renderer.Explode5Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatemilitarySupportModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreatemilitarySupportModEntities.TESTPROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.MARKER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.SPECIALBULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.SOLDIERFIRE.get(), SoldierfireRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.SC_500PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.SC_500MARKET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.NUKETEST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.EXPLODE_5.get(), Explode5Renderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.MISSLE_57KG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.BURNYBOI.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.RCXD.get(), RcxdRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.PZROCKET.get(), PzrocketRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.TESTBOMB.get(), TestbombRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.BEAV_TEST_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreatemilitarySupportModEntities.TESTIBCM.get(), TestibcmRenderer::new);
	}
}
