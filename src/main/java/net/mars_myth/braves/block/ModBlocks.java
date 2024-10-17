package net.mars_myth.braves.block;

import net.mars_myth.braves.SwordsOfBravery;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {



    public static final Block FLAMITLE_ORE = registerBlock("flamitle_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));


    public static final Block DEEPSLATE_FLAMITLE_ORE = registerBlock("deepslate_flamitle_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SwordsOfBravery.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SwordsOfBravery.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SwordsOfBravery.LOGGER.info("Registering ModBlocks for " + SwordsOfBravery.MOD_ID);
    }
}
