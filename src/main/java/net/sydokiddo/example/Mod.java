package net.sydokiddo.example;

import net.fabricmc.api.ModInitializer;
import net.sydokiddo.chrysalis.Chrysalis;
import net.sydokiddo.example.registry.ModRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class Mod implements ModInitializer {

	public static final String MOD_ID = "modid";
	public static final Logger LOGGER = LoggerFactory.getLogger("Mod Name");

	@Override
	public void onInitialize() {
		if (Chrysalis.CHRYSALIS_INITIALIZED) {
			ModRegistry.registerAll();
			LOGGER.info("Thank you for downloading " + LOGGER.getName() + "!");
		} else {
			LOGGER.error("Failed to initialize mod, Chrysalis is not installed!", new Exception());
		}
	}
}