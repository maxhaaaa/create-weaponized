
package net.mcreator.createmilitarysupport.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BombCasingItem extends Item {
	public BombCasingItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
