package net.hackovina.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hackovina.firstmod.Firstmod;
import net.minecraft.class_1792;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_7706;
import net.minecraft.class_7923;

public class ModItems {
    public static final class_1792 HYDROGEN = registerItem("hydrogen", new class_1792(new FabricItemSettings()));
    public static final class_1792 OXYGEN = registerItem("oxygen", new class_1792(new FabricItemSettings()));
    public static final class_1792 ALUMINIUM = registerItem("aluminium", new class_1792(new FabricItemSettings()));
    public static final class_1792 ARGON = registerItem("argon", new class_1792(new FabricItemSettings()));
    public static final class_1792 BERILIU = registerItem("beriliu", new class_1792(new FabricItemSettings()));
    public static final class_1792 BOR = registerItem("bor", new class_1792(new FabricItemSettings()));
    public static final class_1792 CARBON = registerItem("carbon", new class_1792(new FabricItemSettings()));
    public static final class_1792 CLOR = registerItem("clor", new class_1792(new FabricItemSettings()));
    public static final class_1792 FLUOR = registerItem("fluor", new class_1792(new FabricItemSettings()));
    public static final class_1792 HELIUM = registerItem("helium", new class_1792(new FabricItemSettings()));
    public static final class_1792 LITHIUM = registerItem("lithium", new class_1792(new FabricItemSettings()));
    public static final class_1792 MAGNESIUM = registerItem("magnesium", new class_1792(new FabricItemSettings()));
    public static final class_1792 NEON = registerItem("neon", new class_1792(new FabricItemSettings()));
    public static final class_1792 PHOSPHOR = registerItem("phosphor", new class_1792(new FabricItemSettings()));
    public static final class_1792 SILICON = registerItem("silicon", new class_1792(new FabricItemSettings()));
    public static final class_1792 SODIU = registerItem("sodiu", new class_1792(new FabricItemSettings()));
    public static final class_1792 SULFUR = registerItem("sulfur", new class_1792(new FabricItemSettings()));
    public static final class_1792 AZOT = registerItem("azot", new class_1792(new FabricItemSettings()));

    private static void addItemsToIngridienetTabItemGroup(FabricItemGroupEntries entries) {
        entries.method_45421(HYDROGEN);
        entries.method_45421(OXYGEN);
        entries.method_45421(ALUMINIUM);
        entries.method_45421(ARGON);
        entries.method_45421(BERILIU);
        entries.method_45421(BOR);
        entries.method_45421(CARBON);
        entries.method_45421(CLOR);
        entries.method_45421(FLUOR);
        entries.method_45421(HELIUM);
        entries.method_45421(LITHIUM);
        entries.method_45421(MAGNESIUM);
        entries.method_45421(NEON);
        entries.method_45421(PHOSPHOR);
        entries.method_45421(SILICON);
        entries.method_45421(SULFUR);
        entries.method_45421(SODIU);
        entries.method_45421(AZOT);
    }

    private static class_1792 registerItem(String name, class_1792 item){
        return class_2378.method_10230(class_7923.field_41178, new class_2960(Firstmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Firstmod.LOGGER.info("Registering Mod Items for " + Firstmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(class_7706.field_41062).register(ModItems::addItemsToIngridienetTabItemGroup);
    }
}
