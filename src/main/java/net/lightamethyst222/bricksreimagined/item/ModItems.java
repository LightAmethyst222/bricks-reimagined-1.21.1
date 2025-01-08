package net.lightamethyst222.bricksreimagined.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lightamethyst222.bricksreimagined.BricksReimagined;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GROUT_BALL = registerItem("grout_ball", new Item(new Item.Settings()));
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new Item.Settings().fireproof()));
    public static final Item GILDING_ANDESITE_TEMPLATE = registerItem("gilding_andesite_template", new Item(new Item.Settings()));
    public static final Item GILDING_BRASS_TEMPLATE = registerItem("gilding_brass_template", new Item(new Item.Settings()));
    public static final Item GILDING_COPPER_TEMPLATE = registerItem("gilding_copper_template", new Item(new Item.Settings()));
    public static final Item GILDING_DIAMOND_TEMPLATE = registerItem("gilding_diamond_template", new Item(new Item.Settings()));
    public static final Item GILDING_GOLD_TEMPLATE = registerItem("gilding_gold_template", new Item(new Item.Settings()));
    public static final Item GILDING_IRON_TEMPLATE = registerItem("gilding_iron_template", new Item(new Item.Settings()));
    public static final Item GILDING_NETHERITE_TEMPLATE = registerItem("gilding_netherite_template", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BricksReimagined.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BricksReimagined.LOGGER.info("Registering Mod Items for " + BricksReimagined.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //reorder once I move this to a custom group
            entries.add(GROUT_BALL);
            entries.add(NETHERITE_NUGGET);
            entries.add(GILDING_ANDESITE_TEMPLATE);
            entries.add(GILDING_BRASS_TEMPLATE);
            entries.add(GILDING_COPPER_TEMPLATE);
            entries.add(GILDING_DIAMOND_TEMPLATE);
            entries.add(GILDING_GOLD_TEMPLATE);
            entries.add(GILDING_IRON_TEMPLATE);
            entries.add(GILDING_NETHERITE_TEMPLATE);
        });
    }
}
