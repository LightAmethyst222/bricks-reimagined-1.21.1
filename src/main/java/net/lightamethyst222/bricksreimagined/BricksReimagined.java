package net.lightamethyst222.bricksreimagined;

import net.fabricmc.api.ModInitializer;

import net.lightamethyst222.bricksreimagined.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BricksReimagined implements ModInitializer {
	public static final String MOD_ID = "bricksreimagined";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}