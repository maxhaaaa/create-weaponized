
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreatemilitarySupportModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<CreativeModeTab> BULLETMILITARYSUPPORT = REGISTRY.register("bulletmilitarysupport",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.createmilitary_support.bulletmilitarysupport")).icon(() -> new ItemStack(CreatemilitarySupportModItems.DEBUG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreatemilitarySupportModItems.BULLET_9MMCASING.get());
				tabData.accept(CreatemilitarySupportModItems.BULLET_9MMLEVEL_2.get());
				tabData.accept(CreatemilitarySupportModItems.BULLET_9MMLEVEL_3.get());
				tabData.accept(CreatemilitarySupportModItems.PRIMER.get());
				tabData.accept(CreatemilitarySupportModItems.HEADBULLET.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MILITARYSUPPORT = REGISTRY.register("militarysupport",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.createmilitary_support.militarysupport")).icon(() -> new ItemStack(CreatemilitarySupportModBlocks.SENDERBLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreatemilitarySupportModBlocks.COMPONENTTELEPORTER.get().asItem());
				tabData.accept(CreatemilitarySupportModItems.SCREWDRIVER.get());
				tabData.accept(CreatemilitarySupportModBlocks.SENDERBLOCK.get().asItem());
				tabData.accept(CreatemilitarySupportModItems.MILITARYCURRENCYCARD.get());
				tabData.accept(CreatemilitarySupportModItems.STRIKEDEVICE.get());
				tabData.accept(CreatemilitarySupportModItems.SUPPORTCODEGENERATOR.get());
				tabData.accept(CreatemilitarySupportModItems.TESTPUNCHCARD.get());
				tabData.accept(CreatemilitarySupportModItems.DEBUG.get());
				tabData.accept(CreatemilitarySupportModItems.SC_250.get());
				tabData.accept(CreatemilitarySupportModItems.LOOPERTEST.get());
				tabData.accept(CreatemilitarySupportModItems.CONSTRUCABLES_250.get());
				tabData.accept(CreatemilitarySupportModItems.SUPERLEINFEILD.get());
				tabData.accept(CreatemilitarySupportModItems.SC_500PUNCHCARD.get());
				tabData.accept(CreatemilitarySupportModItems.SC_500.get());
				tabData.accept(CreatemilitarySupportModItems.NUKECARD.get());
				tabData.accept(CreatemilitarySupportModItems.MISSLE_57.get());
				tabData.accept(CreatemilitarySupportModItems.HE_57CARD.get());
				tabData.accept(CreatemilitarySupportModItems.NUCLEARMORTAR.get());
				tabData.accept(CreatemilitarySupportModItems.COMPLETED_9MMBULLET.get());
				tabData.accept(CreatemilitarySupportModItems.CONSTRUCTABLE_250LEVEL_2.get());
				tabData.accept(CreatemilitarySupportModItems.BOUNCINGBETTYMINE.get());
				tabData.accept(CreatemilitarySupportModItems.STRIKE_DEVICEANIMATED.get());
				tabData.accept(CreatemilitarySupportModItems.KG_50INCINDERAY.get());
				tabData.accept(CreatemilitarySupportModItems.RCXD_SPAWN_EGG.get());
				tabData.accept(CreatemilitarySupportModItems.RCXDCARDS.get());
				tabData.accept(CreatemilitarySupportModItems.INFPANZERFAUST.get());
				tabData.accept(CreatemilitarySupportModItems.BOMB_CASING.get());
				tabData.accept(CreatemilitarySupportModItems.LOADED_BOMB.get());
				tabData.accept(CreatemilitarySupportModItems.BOMB_EXPLOSION_AMOUNT.get());
				tabData.accept(CreatemilitarySupportModItems.BOMB_EXPLOSION_RADIUS.get());
				tabData.accept(CreatemilitarySupportModBlocks.BOMB_CRAFTER.get().asItem());
				tabData.accept(CreatemilitarySupportModBlocks.BOMBTESTINGBLOCK.get().asItem());
				tabData.accept(CreatemilitarySupportModBlocks.TEST_NUKE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(CreatemilitarySupportModItems.ANASSEMBLY_OFCOMPONENTS.get());

		}
	}
}
