
package net.mcreator.createmilitarysupport.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BombExplosionRadiusItem extends Item {
	public BombExplosionRadiusItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
