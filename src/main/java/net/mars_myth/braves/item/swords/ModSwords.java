package net.mars_myth.braves.item.swords;

import net.mars_myth.braves.SwordsOfBravery;
import net.mars_myth.braves.item.ModToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModSwords {


    public static final Item SWORD_OF_POWER = registerItem("sword_of_power",
            new SwordItem(ModToolMaterial.POWER, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    ModToolMaterial.POWER, 3,-2.4f))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SwordsOfBravery.MOD_ID, name), item);
    }

    public static void registerSwords() {
        SwordsOfBravery.LOGGER.info("Registering Mod Swords for " + SwordsOfBravery.MOD_ID);
    }
}

