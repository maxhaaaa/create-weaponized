
package net.mcreator.createmilitarysupport.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.createmilitarysupport.procedures.BombycoProcedure;
import net.mcreator.createmilitarysupport.procedures.BomboverlayDisplayOverlayIngameProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class BomboverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (BomboverlayDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("createmilitary_support:textures/screens/aim.png"), w / 2 + -7, h / 2 + -9, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.createmilitary_support.bomboverlay.label_0"), w / 2 + -2, h / 2 + -5, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.createmilitary_support.bomboverlay.label_empty"), w / 2 + -97, h / 2 + -113, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.createmilitary_support.bomboverlay.label_control_in_progress"), w / 2 + -40, h / 2 + -101, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					BombycoProcedure.execute(entity), w / 2 + -197, h / 2 + -92, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
