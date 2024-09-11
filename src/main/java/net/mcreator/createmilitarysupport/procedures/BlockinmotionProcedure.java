package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class BlockinmotionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("/summon falling_block ~ ~ ~ {BlockState:{Name:\"" + "" + ForgeRegistries.BLOCKS.getKey(Blocks.EMERALD_BLOCK).toString() + "\"},Time:1,Motion:[" + (Mth.nextDouble(RandomSource.create(), -2, 2)) + "d," + 2 + "d,"
							+ (Mth.nextDouble(RandomSource.create(), -2, 2)) + "d]}"));
	}
}
