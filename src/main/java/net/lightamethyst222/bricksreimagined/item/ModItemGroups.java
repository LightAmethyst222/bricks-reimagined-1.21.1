package net.lightamethyst222.bricksreimagined.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lightamethyst222.bricksreimagined.BricksReimagined;
import net.lightamethyst222.bricksreimagined.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup BRICKS_REIMAGINED_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BricksReimagined.MOD_ID, "bricks_reimagined_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GROUT_BALL))
                    .displayName(Text.translatable("itemgroup.bricksreimagined.bricks_reimagined_item_group"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.GROUT_BALL);
                      entries.add(ModBlocks.GROUT_BLOCK);
                      entries.add(ModItems.NETHERITE_NUGGET);
                      entries.add(ModItems.GILDING_ANDESITE_TEMPLATE);
                      entries.add(ModItems.GILDING_BRASS_TEMPLATE);
                      entries.add(ModItems.GILDING_COPPER_TEMPLATE);
                      entries.add(ModItems.GILDING_DIAMOND_TEMPLATE);
                      entries.add(ModItems.GILDING_GOLD_TEMPLATE);
                      entries.add(ModItems.GILDING_IRON_TEMPLATE);
                      entries.add(ModItems.GILDING_NETHERITE_TEMPLATE);
                      entries.add(ModItems.BRICKS_1X1_EVEN_TEMPLATE);
                      entries.add(ModItems.BRICKS_1X1_OFFSET_TEMPLATE);
                      entries.add(ModItems.BRICKS_1X2_EVEN_TEMPLATE);
                      entries.add(ModItems.BRICKS_1X2_OFFSET_TEMPLATE);
                      entries.add(ModItems.BRICKS_1X4_EVEN_TEMPLATE);
                      entries.add(ModItems.BRICKS_1X4_OFFSET_TEMPLATE);
                      entries.add(ModItems.BRICKS_2X2_EVEN_TEMPLATE);
                      entries.add(ModItems.BRICKS_2X2_OFFSET_TEMPLATE);
                      entries.add(ModItems.BRICKS_2X4_EVEN_TEMPLATE);
                      entries.add(ModItems.BRICKS_2X4_OFFSET_TEMPLATE);
                      entries.add(ModItems.BRICKS_4X4_EVEN_TEMPLATE);
                      entries.add(ModItems.BRICKS_4X4_OFFSET_TEMPLATE);
                      entries.add(ModItems.BRICKS_CHISELED_TEMPLATE);
                    }).build());

    //1x1 Even Bricks
    public static final ItemGroup BRICKS_REIMAGINED_1X1_EVEN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BricksReimagined.MOD_ID, "bricks_reimagined_1x1_even_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BRICKS_1X1_EVEN_TEMPLATE))
                    .displayName(Text.translatable("itemgroup.bricksreimagined.bricks_reimagined_1x1_even_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.UNCOLORED_1X1_EVEN_UNCOLORED_BRICKS);
                    }).build());

    //1x1 Offset Bricks
    public static final ItemGroup BRICKS_REIMAGINED_1X1_OFFSET_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BricksReimagined.MOD_ID, "bricks_reimagined_1x1_offset_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BRICKS_1X1_OFFSET_TEMPLATE))
                    .displayName(Text.translatable("itemgroup.bricksreimagined.bricks_reimagined_1x1_offset_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.UNCOLORED_1X1_OFFSET_UNCOLORED_BRICKS);
                    }).build());


    public static void registerItemGroups() {
        BricksReimagined.LOGGER.info("Registering Item Group for " + BricksReimagined.MOD_ID);
    }
}
