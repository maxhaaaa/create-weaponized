
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.createmilitarysupport.world.inventory.SupportCodegeneratorguiMenu;
import net.mcreator.createmilitarysupport.world.inventory.StrikeguiMenu;
import net.mcreator.createmilitarysupport.world.inventory.SenderblockguiMenu;
import net.mcreator.createmilitarysupport.world.inventory.ComponenttelporterguiMenu;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class CreatemilitarySupportModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<MenuType<ComponenttelporterguiMenu>> COMPONENTTELPORTERGUI = REGISTRY.register("componenttelportergui", () -> IForgeMenuType.create(ComponenttelporterguiMenu::new));
	public static final RegistryObject<MenuType<SenderblockguiMenu>> SENDERBLOCKGUI = REGISTRY.register("senderblockgui", () -> IForgeMenuType.create(SenderblockguiMenu::new));
	public static final RegistryObject<MenuType<StrikeguiMenu>> STRIKEGUI = REGISTRY.register("strikegui", () -> IForgeMenuType.create(StrikeguiMenu::new));
	public static final RegistryObject<MenuType<SupportCodegeneratorguiMenu>> SUPPORT_CODEGENERATORGUI = REGISTRY.register("support_codegeneratorgui", () -> IForgeMenuType.create(SupportCodegeneratorguiMenu::new));
}
