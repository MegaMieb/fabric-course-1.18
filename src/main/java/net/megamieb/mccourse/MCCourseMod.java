package net.megamieb.mccourse;

import net.fabricmc.api.ModInitializer;
import net.megamieb.mccourse.block.ModBlocks;
import net.megamieb.mccourse.item.ModItems;
import net.megamieb.mccourse.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// A comment
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
	}
}
