
package net.mcreator.createmilitarysupport.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PrimerItem extends Item {
	public PrimerItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
