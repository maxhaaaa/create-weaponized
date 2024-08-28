package net.mcreator.createmilitarysupport.client.gui;

public class SiloguiScreen extends AbstractContainerScreen<SiloguiMenu> {

	private final static HashMap<String, Object> guistate = SiloguiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SiloguiScreen(SiloguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("createmilitary_support:textures/screens/silogui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.createmilitary_support.silogui.label_in_progress"), 15, 10, -12829636, false);
		guiGraphics.drawString(this.font,

				YCORDSOFBOMBProcedure.execute(world, x, y, z), 17, 31, -12829636, false);
	}

	@Override
	public void init() {
		super.init();

	}

}
