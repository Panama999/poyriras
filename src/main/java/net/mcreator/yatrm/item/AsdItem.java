
package net.mcreator.yatrm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AsdItem extends Item {
	public AsdItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
