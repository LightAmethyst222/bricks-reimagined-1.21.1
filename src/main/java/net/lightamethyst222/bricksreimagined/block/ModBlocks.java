package net.lightamethyst222.bricksreimagined.block;

import net.lightamethyst222.bricksreimagined.BricksReimagined;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block GROUT_BLOCK = registerBlock("grout_block",
            new Block(AbstractBlock.Settings.create().strength(0.5f)
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.SNARE)
                    .sounds(BlockSoundGroup.SAND)));

    //Uncolored 1x1 Even Bricks
    public static final Block UNCOLORED_1X1_EVEN_UNCOLORED_BRICKS = registerBlock("uncolored_1x1_even_uncolored_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block UNCOLORED_1X1_OFFSET_UNCOLORED_BRICKS = registerBlock("uncolored_1x1_offset_uncolored_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BricksReimagined.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BricksReimagined.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        BricksReimagined.LOGGER.info("Registering Mod Blocks for " + BricksReimagined.MOD_ID);
    }
}
