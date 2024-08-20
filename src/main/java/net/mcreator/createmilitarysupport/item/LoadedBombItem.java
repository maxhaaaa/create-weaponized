
package net.mcreator.createmilitarysupport.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class LoadedBombItem extends Item {
	public LoadedBombItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		LoadedBombRightclickedProcedure.execute();
		return ar;
	}
}