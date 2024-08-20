package net.mcreator.createmilitarysupport.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.createmilitarysupport.init.CreatemilitarySupportModBlockEntities;
import net.mcreator.createmilitarysupport.block.renderer.RivetpressTileRenderer;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

@Mod.EventBusSubscriber(modid = CreatemilitarySupportMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(CreatemilitarySupportModBlockEntities.RIVETPRESS.get(), context -> new RivetpressTileRenderer());
	}
}
