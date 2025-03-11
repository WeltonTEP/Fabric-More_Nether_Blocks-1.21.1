package net.weltontep.morenetherblocks;

import net.fabricmc.api.ModInitializer;

import net.weltontep.morenetherblocks.block.BasaltBlocks;
import net.weltontep.morenetherblocks.block.BlackstoneBlocks;
import net.weltontep.morenetherblocks.block.BloodstoneBlocks;
import net.weltontep.morenetherblocks.block.CrimsonBlocks;
import net.weltontep.morenetherblocks.item.ModItemGroups;
import net.weltontep.morenetherblocks.item.ModItems;
import net.weltontep.morenetherblocks.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNetherBlocks implements ModInitializer {
	public static final String MOD_ID = "morenetherblocks";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		BasaltBlocks.registerModBlocks();
		BlackstoneBlocks.registerModBlocks();
		BloodstoneBlocks.registerModBlocks();
		CrimsonBlocks.registerModBlocks();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModWorldGeneration.generateModWorldGen();

		LOGGER.info("Hello Fabric world!");
	}
}