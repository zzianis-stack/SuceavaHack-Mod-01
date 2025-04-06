package net.hackovina.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hackovina.firstmod.Firstmod;
import net.hackovina.firstmod.block.ModBlocks;
import net.minecraft.class_1761;
import net.minecraft.class_1799;
import net.minecraft.class_2378;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public class ModItemGroups {
    public static final class_1761 PERIODIC_ELEMENTS = class_2378.method_10230(class_7923.field_44687,
            new class_2960(Firstmod.MOD_ID, "hydrogen"),
            FabricItemGroup.builder().method_47321(class_2561.method_43471("itemgroup.elements"))
                    .method_47320(() -> new class_1799(ModItems.HYDROGEN)).method_47317((displayContext, entries) -> {
                        entries.method_45421(ModItems.HYDROGEN);
                        entries.method_45421(ModItems.OXYGEN);
                        entries.method_45421(ModItems.ALUMINIUM);
                        entries.method_45421(ModItems.ARGON);
                        entries.method_45421(ModItems.BERILIU);
                        entries.method_45421(ModItems.BOR);
                        entries.method_45421(ModItems.CARBON);
                        entries.method_45421(ModItems.CLOR);
                        entries.method_45421(ModItems.FLUOR);
                        entries.method_45421(ModItems.HELIUM);
                        entries.method_45421(ModItems.LITHIUM);
                        entries.method_45421(ModItems.MAGNESIUM);
                        entries.method_45421(ModItems.NEON);
                        entries.method_45421(ModItems.PHOSPHOR);
                        entries.method_45421(ModItems.SILICON);
                        entries.method_45421(ModItems.SULFUR);
                        entries.method_45421(ModItems.SODIU);
                        entries.method_45421(ModItems.AZOT);

                        entries.method_45421(ModBlocks.SULFUR_BLOCK);
                    }).method_47324());

    public static void registerItemGroups() {
        Firstmod.LOGGER.info("Registering Item Groups for " + Firstmod.MOD_ID);
    }
}
