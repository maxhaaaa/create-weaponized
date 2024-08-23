package net.mcreator.createmilitarysupport.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MushroomfunctionsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Mushroomcloudpart1Procedure.execute(world, x, y, z);
		Mushroomcloudpart2Procedure.execute(world, x, y, z);
	}
}
