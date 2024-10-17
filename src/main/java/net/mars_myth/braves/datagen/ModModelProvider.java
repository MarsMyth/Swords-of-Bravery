package net.mars_myth.braves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mars_myth.braves.block.ModBlocks;
import net.mars_myth.braves.item.ModItems;
import net.mars_myth.braves.item.swords.ModSwords;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_FLAMITLE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLAMITLE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModSwords.SWORD_OF_POWER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RAW_FLAMITLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLAMITLE, Models.GENERATED);
    }
}
