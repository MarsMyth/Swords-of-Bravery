package net.mars_myth.braves;

import net.fabricmc.api.ModInitializer;

import net.mars_myth.braves.block.ModBlocks;
import net.mars_myth.braves.item.ModItems;
import net.mars_myth.braves.item.swords.ModSwords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwordsOfBravery implements ModInitializer {
	public static final String MOD_ID = "braves";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");


		ModBlocks.registerModBlocks();
		ModSwords.registerSwords();
		ModItems.registerItems();

	}
}