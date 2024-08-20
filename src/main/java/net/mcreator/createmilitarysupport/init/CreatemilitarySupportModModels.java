
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.createmilitarysupport.client.model.Modelpz_roket;
import net.mcreator.createmilitarysupport.client.model.Modelbomb;
import net.mcreator.createmilitarysupport.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreatemilitarySupportModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelbomb.LAYER_LOCATION, Modelbomb::createBodyLayer);
		event.registerLayerDefinition(Modelpz_roket.LAYER_LOCATION, Modelpz_roket::createBodyLayer);
	}
}
