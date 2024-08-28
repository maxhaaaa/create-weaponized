
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.createmilitarysupport.item.TestpunchcardItem;
import net.mcreator.createmilitarysupport.item.SupportcodegeneratorItem;
import net.mcreator.createmilitarysupport.item.SuperleinfeildItem;
import net.mcreator.createmilitarysupport.item.StrikedeviceItem;
import net.mcreator.createmilitarysupport.item.StrikeDeviceanimatedItem;
import net.mcreator.createmilitarysupport.item.ScrewdriverItem;
import net.mcreator.createmilitarysupport.item.Sc500punchcardItem;
import net.mcreator.createmilitarysupport.item.Sc500Item;
import net.mcreator.createmilitarysupport.item.Sc250Item;
import net.mcreator.createmilitarysupport.item.RcxdcardsItem;
import net.mcreator.createmilitarysupport.item.PrimerItem;
import net.mcreator.createmilitarysupport.item.NukecardItem;
import net.mcreator.createmilitarysupport.item.NuclearmortarItem;
import net.mcreator.createmilitarysupport.item.Missle57Item;
import net.mcreator.createmilitarysupport.item.MilitarycurrencycardItem;
import net.mcreator.createmilitarysupport.item.LoopertestItem;
import net.mcreator.createmilitarysupport.item.LoadedBombItem;
import net.mcreator.createmilitarysupport.item.Level5plateItem;
import net.mcreator.createmilitarysupport.item.Level4plateItem;
import net.mcreator.createmilitarysupport.item.Level3plateItem;
import net.mcreator.createmilitarysupport.item.Level2plateItem;
import net.mcreator.createmilitarysupport.item.Level1plateItem;
import net.mcreator.createmilitarysupport.item.Kg50incinderayItem;
import net.mcreator.createmilitarysupport.item.InfpanzerfaustItem;
import net.mcreator.createmilitarysupport.item.HeadbulletItem;
import net.mcreator.createmilitarysupport.item.He57cardItem;
import net.mcreator.createmilitarysupport.item.FinishedreinforcedplateItem;
import net.mcreator.createmilitarysupport.item.DebugItem;
import net.mcreator.createmilitarysupport.item.Constructable250level2Item;
import net.mcreator.createmilitarysupport.item.Construcables250Item;
import net.mcreator.createmilitarysupport.item.ComponenthammerItem;
import net.mcreator.createmilitarysupport.item.Completed9mmbulletItem;
import net.mcreator.createmilitarysupport.item.Bullet9mmlevel3Item;
import net.mcreator.createmilitarysupport.item.Bullet9mmlevel2Item;
import net.mcreator.createmilitarysupport.item.Bullet9mmcasingItem;
import net.mcreator.createmilitarysupport.item.BouncingbettymineItem;
import net.mcreator.createmilitarysupport.item.BombExplosionRadiusItem;
import net.mcreator.createmilitarysupport.item.BombExplosionAmountItem;
import net.mcreator.createmilitarysupport.item.BombCasingItem;
import net.mcreator.createmilitarysupport.item.AnassemblyOfcomponentsItem;
import net.mcreator.createmilitarysupport.block.display.RivetpressDisplayItem;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class CreatemilitarySupportModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<Item> ANASSEMBLY_OFCOMPONENTS = REGISTRY.register("anassembly_ofcomponents", () -> new AnassemblyOfcomponentsItem());
	public static final RegistryObject<Item> COMPONENTTELEPORTER = block(CreatemilitarySupportModBlocks.COMPONENTTELEPORTER);
	public static final RegistryObject<Item> LEVEL_1PLATE = REGISTRY.register("level_1plate", () -> new Level1plateItem());
	public static final RegistryObject<Item> LEVEL_2PLATE = REGISTRY.register("level_2plate", () -> new Level2plateItem());
	public static final RegistryObject<Item> LEVEL_3PLATE = REGISTRY.register("level_3plate", () -> new Level3plateItem());
	public static final RegistryObject<Item> LEVEL_4PLATE = REGISTRY.register("level_4plate", () -> new Level4plateItem());
	public static final RegistryObject<Item> LEVEL_5PLATE = REGISTRY.register("level_5plate", () -> new Level5plateItem());
	public static final RegistryObject<Item> FINISHEDREINFORCEDPLATE = REGISTRY.register("finishedreinforcedplate", () -> new FinishedreinforcedplateItem());
	public static final RegistryObject<Item> SCREWDRIVER = REGISTRY.register("screwdriver", () -> new ScrewdriverItem());
	public static final RegistryObject<Item> SENDERBLOCK = block(CreatemilitarySupportModBlocks.SENDERBLOCK);
	public static final RegistryObject<Item> MILITARYCURRENCYCARD = REGISTRY.register("militarycurrencycard", () -> new MilitarycurrencycardItem());
	public static final RegistryObject<Item> STRIKEDEVICE = REGISTRY.register("strikedevice", () -> new StrikedeviceItem());
	public static final RegistryObject<Item> SUPPORTCODEGENERATOR = REGISTRY.register("supportcodegenerator", () -> new SupportcodegeneratorItem());
	public static final RegistryObject<Item> TESTPUNCHCARD = REGISTRY.register("testpunchcard", () -> new TestpunchcardItem());
	public static final RegistryObject<Item> DEBUG = REGISTRY.register("debug", () -> new DebugItem());
	public static final RegistryObject<Item> SC_250 = REGISTRY.register("sc_250", () -> new Sc250Item());
	public static final RegistryObject<Item> COMPONENTHAMMER = REGISTRY.register("componenthammer", () -> new ComponenthammerItem());
	public static final RegistryObject<Item> LOOPERTEST = REGISTRY.register("loopertest", () -> new LoopertestItem());
	public static final RegistryObject<Item> CONSTRUCABLES_250 = REGISTRY.register("construcables_250", () -> new Construcables250Item());
	public static final RegistryObject<Item> SUPERLEINFEILD = REGISTRY.register("superleinfeild", () -> new SuperleinfeildItem());
	public static final RegistryObject<Item> SOLDIERFIRE_SPAWN_EGG = REGISTRY.register("soldierfire_spawn_egg", () -> new ForgeSpawnEggItem(CreatemilitarySupportModEntities.SOLDIERFIRE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SC_500PUNCHCARD = REGISTRY.register("sc_500punchcard", () -> new Sc500punchcardItem());
	public static final RegistryObject<Item> SC_500 = REGISTRY.register("sc_500", () -> new Sc500Item());
	public static final RegistryObject<Item> EXPLODE_5_SPAWN_EGG = REGISTRY.register("explode_5_spawn_egg", () -> new ForgeSpawnEggItem(CreatemilitarySupportModEntities.EXPLODE_5, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> NUKECARD = REGISTRY.register("nukecard", () -> new NukecardItem());
	public static final RegistryObject<Item> MISSLE_57 = REGISTRY.register("missle_57", () -> new Missle57Item());
	public static final RegistryObject<Item> HE_57CARD = REGISTRY.register("he_57card", () -> new He57cardItem());
	public static final RegistryObject<Item> NUCLEARMORTAR = REGISTRY.register("nuclearmortar", () -> new NuclearmortarItem());
	public static final RegistryObject<Item> BULLET_9MMCASING = REGISTRY.register("bullet_9mmcasing", () -> new Bullet9mmcasingItem());
	public static final RegistryObject<Item> BULLET_9MMLEVEL_2 = REGISTRY.register("bullet_9mmlevel_2", () -> new Bullet9mmlevel2Item());
	public static final RegistryObject<Item> BULLET_9MMLEVEL_3 = REGISTRY.register("bullet_9mmlevel_3", () -> new Bullet9mmlevel3Item());
	public static final RegistryObject<Item> COMPLETED_9MMBULLET = REGISTRY.register("completed_9mmbullet", () -> new Completed9mmbulletItem());
	public static final RegistryObject<Item> PRIMER = REGISTRY.register("primer", () -> new PrimerItem());
	public static final RegistryObject<Item> HEADBULLET = REGISTRY.register("headbullet", () -> new HeadbulletItem());
	public static final RegistryObject<Item> CONSTRUCTABLE_250LEVEL_2 = REGISTRY.register("constructable_250level_2", () -> new Constructable250level2Item());
	public static final RegistryObject<Item> BOUNCINGBETTYMINE = REGISTRY.register("bouncingbettymine", () -> new BouncingbettymineItem());
	public static final RegistryObject<Item> STRIKE_DEVICEANIMATED = REGISTRY.register("strike_deviceanimated", () -> new StrikeDeviceanimatedItem());
	public static final RegistryObject<Item> KG_50INCINDERAY = REGISTRY.register("kg_50incinderay", () -> new Kg50incinderayItem());
	public static final RegistryObject<Item> RCXD_SPAWN_EGG = REGISTRY.register("rcxd_spawn_egg", () -> new ForgeSpawnEggItem(CreatemilitarySupportModEntities.RCXD, -65536, -1, new Item.Properties()));
	public static final RegistryObject<Item> RCXDCARDS = REGISTRY.register("rcxdcards", () -> new RcxdcardsItem());
	public static final RegistryObject<Item> INFPANZERFAUST = REGISTRY.register("infpanzerfaust", () -> new InfpanzerfaustItem());
	public static final RegistryObject<Item> RIVETPRESS = REGISTRY.register(CreatemilitarySupportModBlocks.RIVETPRESS.getId().getPath(), () -> new RivetpressDisplayItem(CreatemilitarySupportModBlocks.RIVETPRESS.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOMB_CASING = REGISTRY.register("bomb_casing", () -> new BombCasingItem());
	public static final RegistryObject<Item> LOADED_BOMB = REGISTRY.register("loaded_bomb", () -> new LoadedBombItem());
	public static final RegistryObject<Item> BOMB_EXPLOSION_AMOUNT = REGISTRY.register("bomb_explosion_amount", () -> new BombExplosionAmountItem());
	public static final RegistryObject<Item> BOMB_EXPLOSION_RADIUS = REGISTRY.register("bomb_explosion_radius", () -> new BombExplosionRadiusItem());
	public static final RegistryObject<Item> BOMB_CRAFTER = block(CreatemilitarySupportModBlocks.BOMB_CRAFTER);
	public static final RegistryObject<Item> BOMBTESTINGBLOCK = block(CreatemilitarySupportModBlocks.BOMBTESTINGBLOCK);
	public static final RegistryObject<Item> TEST_NUKE = block(CreatemilitarySupportModBlocks.TEST_NUKE);
	public static final RegistryObject<Item> SILOTESTER = block(CreatemilitarySupportModBlocks.SILOTESTER);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
