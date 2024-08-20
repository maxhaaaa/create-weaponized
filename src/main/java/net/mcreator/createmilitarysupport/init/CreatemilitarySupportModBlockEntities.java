
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.createmilitarysupport.block.entity.SenderblockBlockEntity;
import net.mcreator.createmilitarysupport.block.entity.RivetpressTileEntity;
import net.mcreator.createmilitarysupport.block.entity.ComponentteleporterBlockEntity;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

public class CreatemilitarySupportModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreatemilitarySupportMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COMPONENTTELEPORTER = register("componentteleporter", CreatemilitarySupportModBlocks.COMPONENTTELEPORTER, ComponentteleporterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SENDERBLOCK = register("senderblock", CreatemilitarySupportModBlocks.SENDERBLOCK, SenderblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<RivetpressTileEntity>> RIVETPRESS = REGISTRY.register("rivetpress", () -> BlockEntityType.Builder.of(RivetpressTileEntity::new, CreatemilitarySupportModBlocks.RIVETPRESS.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
