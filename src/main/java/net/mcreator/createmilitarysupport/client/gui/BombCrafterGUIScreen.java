package net.mcreator.createmilitarysupport.client.gui;

public class BombCrafterGUIScreen extends AbstractContainerScreen<BombCrafterGUIMenu> {

	private final static HashMap<String, Object> guistate = BombCrafterGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_craft;

	public BombCrafterGUIScreen(BombCrafterGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("createmilitary_support:textures/screens/bomb_crafter_gui.png");

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

		guiGraphics.blit(new ResourceLocation("createmilitary_support:textures/screens/cog_image.png"), this.leftPos + 123, this.topPos + 43, 0, 0, 32, 32, 32, 32);

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
	}

	@Override
	public void init() {
		super.init();

		button_craft = Button.builder(Component.translatable("gui.createmilitary_support.bomb_crafter_gui.button_craft"), e -> {
			if (true) {
				CreatemilitarySupportMod.PACKET_HANDLER.sendToServer(new BombCrafterGUIButtonMessage(0, x, y, z));
				BombCrafterGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 114, this.topPos + 16, 51, 20).build();

		guistate.put("button:button_craft", button_craft);
		this.addRenderableWidget(button_craft);

	}

}
