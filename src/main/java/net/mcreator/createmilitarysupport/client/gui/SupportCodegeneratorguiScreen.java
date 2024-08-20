package net.mcreator.createmilitarysupport.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.createmilitarysupport.world.inventory.SupportCodegeneratorguiMenu;
import net.mcreator.createmilitarysupport.procedures.TextgeneratorProcedure;
import net.mcreator.createmilitarysupport.procedures.OptionstextgeneratorProcedure;
import net.mcreator.createmilitarysupport.network.SupportCodegeneratorguiButtonMessage;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SupportCodegeneratorguiScreen extends AbstractContainerScreen<SupportCodegeneratorguiMenu> {
	private final static HashMap<String, Object> guistate = SupportCodegeneratorguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_generate_s250_card;
	Button button_empty;
	Button button_empty1;

	public SupportCodegeneratorguiScreen(SupportCodegeneratorguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("createmilitary_support:textures/screens/support_codegeneratorgui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.support_codegeneratorgui.label_currency_on_card"), 15, 12, -12829636, false);
		guiGraphics.drawString(this.font,

				TextgeneratorProcedure.execute(entity), 65, 13, -12829636, false);
		guiGraphics.drawString(this.font,

				OptionstextgeneratorProcedure.execute(entity), 38, 43, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_generate_s250_card = Button.builder(Component.translatable("gui.createmilitary_support.support_codegeneratorgui.button_generate_s250_card"), e -> {
			if (true) {
				CreatemilitarySupportMod.PACKET_HANDLER.sendToServer(new SupportCodegeneratorguiButtonMessage(0, x, y, z));
				SupportCodegeneratorguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 30, this.topPos + 59, 119, 20).build();
		guistate.put("button:button_generate_s250_card", button_generate_s250_card);
		this.addRenderableWidget(button_generate_s250_card);
		button_empty = Button.builder(Component.translatable("gui.createmilitary_support.support_codegeneratorgui.button_empty"), e -> {
			if (true) {
				CreatemilitarySupportMod.PACKET_HANDLER.sendToServer(new SupportCodegeneratorguiButtonMessage(1, x, y, z));
				SupportCodegeneratorguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 25, this.topPos + 106, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.createmilitary_support.support_codegeneratorgui.button_empty1"), e -> {
			if (true) {
				CreatemilitarySupportMod.PACKET_HANDLER.sendToServer(new SupportCodegeneratorguiButtonMessage(2, x, y, z));
				SupportCodegeneratorguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 119, this.topPos + 106, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
