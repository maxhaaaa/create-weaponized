
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.createmilitarysupport.client.gui.SupportCodegeneratorguiScreen;
import net.mcreator.createmilitarysupport.client.gui.StrikeguiScreen;
import net.mcreator.createmilitarysupport.client.gui.SenderblockguiScreen;
import net.mcreator.createmilitarysupport.client.gui.ComponenttelporterguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatemilitarySupportModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CreatemilitarySupportModMenus.COMPONENTTELPORTERGUI.get(), ComponenttelporterguiScreen::new);
			MenuScreens.register(CreatemilitarySupportModMenus.SENDERBLOCKGUI.get(), SenderblockguiScreen::new);
			MenuScreens.register(CreatemilitarySupportModMenus.STRIKEGUI.get(), StrikeguiScreen::new);
			MenuScreens.register(CreatemilitarySupportModMenus.SUPPORT_CODEGENERATORGUI.get(), SupportCodegeneratorguiScreen::new);
		});
	}
}
