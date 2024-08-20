
package net.mcreator.createmilitarysupport.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.createmilitarysupport.procedures.MilitarycurrencycardRightclickedProcedure;

public class MilitarycurrencycardItem extends Item {
	public MilitarycurrencycardItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		MilitarycurrencycardRightclickedProcedure.execute(entity);
		return ar;
	}
}
