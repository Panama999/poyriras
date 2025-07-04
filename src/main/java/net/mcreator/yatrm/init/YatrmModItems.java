
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yatrm.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.yatrm.item.AsdItem;
import net.mcreator.yatrm.YatrmMod;

public class YatrmModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(YatrmMod.MODID);
	public static final DeferredItem<Item> ASD = REGISTRY.register("asd", AsdItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
