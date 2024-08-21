
package net.mcreator.createmilitarysupport.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BombExplosionAmountItem extends Item {
	public BombExplosionAmountItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
