
package net.mcreator.createmilitarysupport.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.createmilitarysupport.world.inventory.SupportCodegeneratorguiMenu;
import net.mcreator.createmilitarysupport.procedures.IncreasebuttonProcedure;
import net.mcreator.createmilitarysupport.procedures.GeneratecardProcedure;
import net.mcreator.createmilitarysupport.procedures.DecreasebuttonProcedure;
import net.mcreator.createmilitarysupport.CreatemilitarySupportMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SupportCodegeneratorguiButtonMessage {
	private final int buttonID, x, y, z;

	public SupportCodegeneratorguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SupportCodegeneratorguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SupportCodegeneratorguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SupportCodegeneratorguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = SupportCodegeneratorguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GeneratecardProcedure.execute(entity);
		}
		if (buttonID == 1) {

			DecreasebuttonProcedure.execute(entity);
		}
		if (buttonID == 2) {

			IncreasebuttonProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CreatemilitarySupportMod.addNetworkMessage(SupportCodegeneratorguiButtonMessage.class, SupportCodegeneratorguiButtonMessage::buffer, SupportCodegeneratorguiButtonMessage::new, SupportCodegeneratorguiButtonMessage::handler);
	}
}
