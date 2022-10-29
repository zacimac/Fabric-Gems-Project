package lol.zachary.fabricgemsproject;

import lol.zachary.fabricgemsproject.item.*;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lol.zachary.fabricgemsproject.block.ModBlocks;

public class MainInit implements ModInitializer {
	public static final String MOD_ID = "gemsproject";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		// Tools
		Pickaxes.registerItems();
		Axes.registerItems();
		Shovels.registerItems();
		Hoes.registerItems();

		// Weapons
		Swords.registerItems();
		Crossbows.registerItems();

	}
}
