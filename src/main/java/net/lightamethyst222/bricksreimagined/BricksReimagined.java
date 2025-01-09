package net.lightamethyst222.bricksreimagined;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.lightamethyst222.bricksreimagined.block.ModBlocks;
import net.lightamethyst222.bricksreimagined.item.ModItemGroups;
import net.lightamethyst222.bricksreimagined.item.ModItems;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BricksReimagined implements ModInitializer {
	public static final String MOD_ID = "bricksreimagined";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.UNCOLORED_1X1_EVEN_UNCOLORED_BRICKS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.UNCOLORED_1X1_OFFSET_UNCOLORED_BRICKS, RenderLayer.getCutout());
	}
}