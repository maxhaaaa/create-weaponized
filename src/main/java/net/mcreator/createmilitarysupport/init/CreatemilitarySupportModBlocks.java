
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createmilitarysupport.block.TrinitytowerBlock;
import net.mcreator.createmilitarysupport.block.TestNukeBlock;
import net.mcreator.createmilitarysupport.block.SilotesterBlock;
import net.mcreator.createmilitarysupport.block.SenderblockBlock;
import net.mcreator.createmilitarysupport.block.RivetpressBlock;
import net.mcreator.createmilitarysupport.block.ComponentteleporterBlock;
import net.mcreator.createmilitarysupport.block.BombtestingblockBlock;
import net.mcreator.createmilitarysupport.block.BombCrafterBlock;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class CreatemilitarySupportModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<Block> COMPONENTTELEPORTER = REGISTRY.register("componentteleporter", () -> new ComponentteleporterBlock());
	public static final RegistryObject<Block> SENDERBLOCK = REGISTRY.register("senderblock", () -> new SenderblockBlock());
	public static final RegistryObject<Block> RIVETPRESS = REGISTRY.register("rivetpress", () -> new RivetpressBlock());
	public static final RegistryObject<Block> BOMB_CRAFTER = REGISTRY.register("bomb_crafter", () -> new BombCrafterBlock());
	public static final RegistryObject<Block> BOMBTESTINGBLOCK = REGISTRY.register("bombtestingblock", () -> new BombtestingblockBlock());
	public static final RegistryObject<Block> TEST_NUKE = REGISTRY.register("test_nuke", () -> new TestNukeBlock());
	public static final RegistryObject<Block> SILOTESTER = REGISTRY.register("silotester", () -> new SilotesterBlock());
	public static final RegistryObject<Block> TRINITYTOWER = REGISTRY.register("trinitytower", () -> new TrinitytowerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
