package net.mcreator.createmilitarysupport.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.createmilitarysupport.world.inventory.StrikedevicenewguiMenu;
import net.mcreator.createmilitarysupport.procedures.YCORDSOFBOMBProcedure;
import net.mcreator.createmilitarysupport.procedures.StrikelauncherblockylocateProcedure;
import net.mcreator.createmilitarysupport.procedures.LookinglocationzProcedure;
import net.mcreator.createmilitarysupport.procedures.LookinglocationyProcedure;
import net.mcreator.createmilitarysupport.procedures.LookinglocationXProcedure;
import net.mcreator.createmilitarysupport.procedures.LauncherblocklocatezProcedure;
import net.mcreator.createmilitarysupport.procedures.LauncherblocklocatexProcedure;
import net.mcreator.createmilitarysupport.network.StrikedevicenewguiButtonMessage;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StrikedevicenewguiScreen extends AbstractContainerScreen<StrikedevicenewguiMenu> {
	private final static HashMap<String, Object> guistate = StrikedevicenewguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_launch;

	public StrikedevicenewguiScreen(StrikedevicenewguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 287;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("createmilitary_support:textures/screens/strikedevicenewgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.strikedevicenewgui.label_launcher_block_x"), 5, 8, -12829636, false);
		guiGraphics.drawString(this.font,

				LauncherblocklocatexProcedure.execute(entity), 100, 8, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.strikedevicenewgui.label_launcher_block_y"), 5, 25, -12829636, false);
		guiGraphics.drawString(this.font,

				StrikelauncherblockylocateProcedure.execute(entity), 97, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.strikedevicenewgui.label_launcher_block_z"), 5, 43, -12829636, false);
		guiGraphics.drawString(this.font,

				LauncherblocklocatezProcedure.execute(entity), 94, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.strikedevicenewgui.label_target_cords_x"), 6, 57, -12829636, false);
		guiGraphics.drawString(this.font,

				LookinglocationXProcedure.execute(entity), 90, 57, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.strikedevicenewgui.label_target_cords_y"), 5, 72, -12829636, false);
		guiGraphics.drawString(this.font,

				LookinglocationzProcedure.execute(entity), 88, 89, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.strikedevicenewgui.label_target_cords_z"), 5, 88, -12829636, false);
		guiGraphics.drawString(this.font,

				LookinglocationyProcedure.execute(entity), 85, 73, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.strikedevicenewgui.label_recent_bomb_y_value"), 7, 105, -12829636, false);
		guiGraphics.drawString(this.font,

				YCORDSOFBOMBProcedure.execute(world, entity), 73, 106, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_launch = Button.builder(Component.translatable("gui.createmilitary_support.strikedevicenewgui.button_launch"), e -> {
			if (true) {
				CreatemilitarySupportMod.PACKET_HANDLER.sendToServer(new StrikedevicenewguiButtonMessage(0, x, y, z));
				StrikedevicenewguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 182, this.topPos + 121, 56, 20).build();
		guistate.put("button:button_launch", button_launch);
		this.addRenderableWidget(button_launch);
	}
}
