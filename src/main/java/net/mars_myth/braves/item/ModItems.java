package net.mars_myth.braves.item;

import net.mars_myth.braves.SwordsOfBravery;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item RAW_FLAMITLE = registerItem("raw_flamitle",
            new Item(new Item.Settings()));

    public static final Item FLAMITLE = registerItem("flamitle",
            new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SwordsOfBravery.MOD_ID, name), item);
    }

    public static void registerItems() {
        SwordsOfBravery.LOGGER.info("Registering Mod Items for " + SwordsOfBravery.MOD_ID);
    }
}

