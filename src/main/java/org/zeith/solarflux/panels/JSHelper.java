package org.zeith.solarflux.panels;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class JSHelper
{
	public static ItemLike item(String id)
	{
		return () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(id));
	}

	public static ItemLike item(String mod, String id)
	{
		return () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(mod, id));
	}

	public static Supplier<TagKey<Item>> tag(String id)
	{
		return () -> TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(id));
	}

	public static Supplier<TagKey<Item>> tag(String mod, String id)
	{
		return () -> TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(mod, id));
	}
}