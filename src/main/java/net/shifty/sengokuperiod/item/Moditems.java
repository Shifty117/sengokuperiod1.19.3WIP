package net.shifty.sengokuperiod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shifty.sengokuperiod.SengokuPeriod;

public class Moditems {
    public static final Item TAMAHAGANE = registerItem("tamahagane",
            new Item(new FabricItemSettings()));
    public static final Item SHARPENEDTAMAHAGANE = registerItem("sharpenedtamahagane",
            new Item(new FabricItemSettings()));
    public static final Item KATANAHILT = registerItem("katanahilt",
            new Item(new FabricItemSettings()));
    public static final Item SPEARSTAFF = registerItem("spearstaff",
            new Item(new FabricItemSettings()));
    public static final Item KATANABLADE = registerItem("katanablade",
            new Item(new FabricItemSettings()));
    public static final Item KATANA = registerItem("katana",
            new SwordItem(ModToolMaterial.TAMAHAGANE, 3, 1f, new FabricItemSettings()));
    public static final Item ASHIGARUSPEAR = registerItem("ashigaruspear",
            new SwordItem(ModToolMaterial.TAMAHAGANE, 3, 0, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SengokuPeriod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, TAMAHAGANE);
        addToItemGroup(ItemGroups.INGREDIENTS, SHARPENEDTAMAHAGANE);
        addToItemGroup(ItemGroups.COMBAT, KATANAHILT);
        addToItemGroup(ItemGroups.COMBAT, SPEARSTAFF);
        addToItemGroup(ItemGroups.COMBAT, KATANABLADE);
        addToItemGroup(ItemGroups.COMBAT, KATANA);
        addToItemGroup(ItemGroups.COMBAT, ASHIGARUSPEAR);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
    ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        SengokuPeriod.LOGGER.info("Registering Mod Items for " + SengokuPeriod.MOD_ID);

        addItemsToItemGroup();
    }
}
