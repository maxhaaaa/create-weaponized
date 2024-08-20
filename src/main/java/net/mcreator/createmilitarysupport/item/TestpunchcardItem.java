
package net.mcreator.createmilitarysupport.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TestpunchcardItem extends Item {
	public TestpunchcardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
