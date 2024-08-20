package net.mcreator.createmilitarysupport.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.createmilitarysupport.world.inventory.SenderblockguiMenu;
import net.mcreator.createmilitarysupport.network.SenderblockguiButtonMessage;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SenderblockguiScreen extends AbstractContainerScreen<SenderblockguiMenu> {
	private final static HashMap<String, Object> guistate = SenderblockguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_send_finished_product;

	public SenderblockguiScreen(SenderblockguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 179;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("createmilitary_support:textures/screens/senderblockgui.png");

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

		guiGraphics.blit(new ResourceLocation("createmilitary_support:textures/screens/arrow.png"), this.leftPos + 23, this.topPos + 36, 0, 0, 8, 8, 8, 8);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.senderblockgui.label_empty"), 55, 13, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_send_finished_product = Button.builder(Component.translatable("gui.createmilitary_support.senderblockgui.button_send_finished_product"), e -> {
			if (true) {
				CreatemilitarySupportMod.PACKET_HANDLER.sendToServer(new SenderblockguiButtonMessage(0, x, y, z));
				SenderblockguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 39, this.topPos + 32, 134, 20).build();
		guistate.put("button:button_send_finished_product", button_send_finished_product);
		this.addRenderableWidget(button_send_finished_product);
	}
}
