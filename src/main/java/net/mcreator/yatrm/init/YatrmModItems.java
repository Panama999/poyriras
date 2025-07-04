
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yatrm.init;

import org.checkerframework.checker.units.qual.A;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.yatrm.item.AItem;
import net.mcreator.yatrm.YatrmMod;

public class YatrmModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(YatrmMod.MODID);
	public static final DeferredItem<Item> A = REGISTRY.register("a", AItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
