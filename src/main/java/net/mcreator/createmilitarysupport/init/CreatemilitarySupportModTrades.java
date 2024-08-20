
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.createmilitarysupport.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CreatemilitarySupportModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == CreatemilitarySupportModVillagerProfessions.SUPPORTEXPLORER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CreatemilitarySupportModBlocks.COMPONENTTELEPORTER.get()), new ItemStack(Items.EMERALD, 5), new ItemStack(Blocks.EMERALD_BLOCK), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CreatemilitarySupportModBlocks.SENDERBLOCK.get()), new ItemStack(Items.EMERALD, 5), new ItemStack(Blocks.EMERALD_BLOCK), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CreatemilitarySupportModItems.MILITARYCURRENCYCARD.get()),

					new ItemStack(Items.EMERALD, 3), 10, 5, 0.05f));
		}
	}
}
