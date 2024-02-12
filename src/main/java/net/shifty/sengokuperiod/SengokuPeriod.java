package net.shifty.sengokuperiod;

import net.fabricmc.api.ModInitializer;

import net.shifty.sengokuperiod.block.ModBlocks;
import net.shifty.sengokuperiod.block.entity.ModBlockEntities;
import net.shifty.sengokuperiod.item.Moditems;
import net.shifty.sengokuperiod.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SengokuPeriod implements ModInitializer {
	public static final String MOD_ID = "sengokuperiod";
    public static final Logger LOGGER = LoggerFactory.getLogger("sengokuperiod");

	@Override
	public void onInitialize() {
		Moditems.registerModItems();

		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerScreenHandlers();

		LOGGER.info("Hello Fabric world!");
	}
}