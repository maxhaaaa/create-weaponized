
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.createmilitarysupport.network.MilitarysupportinteractkeyMessage;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreatemilitarySupportModKeyMappings {
	public static final KeyMapping MILITARYSUPPORTINTERACTKEY = new KeyMapping("key.createmilitary_support.militarysupportinteractkey", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MILITARYSUPPORTINTERACTKEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MILITARYSUPPORTINTERACTKEY_LASTPRESS);
				CreatemilitarySupportMod.PACKET_HANDLER.sendToServer(new MilitarysupportinteractkeyMessage(1, dt));
				MilitarysupportinteractkeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long MILITARYSUPPORTINTERACTKEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MILITARYSUPPORTINTERACTKEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MILITARYSUPPORTINTERACTKEY.consumeClick();
			}
		}
	}
}
