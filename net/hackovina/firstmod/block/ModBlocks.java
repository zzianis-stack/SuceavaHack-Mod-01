package net.hackovina.firstmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hackovina.firstmod.Firstmod;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2378;
import net.minecraft.class_2498;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public class ModBlocks {
    public static final class_2248 SULFUR_BLOCK = registerBlock("sulfur_block",
            new class_2248(FabricBlockSettings.copyOf(class_2246.field_10085).method_9626(class_2498.field_22150)));

    public static final class_2248 CHEMICAL_DECOMPOSER = registerBlock("chemical_decomposer",
            new class_2248(FabricBlockSettings.copyOf(class_2246.field_10085).method_22488()));
    
    private static class_2248 registerBlock(String name, class_2248 block) {
        registerBlockItem(name, block);
        return class_2378.method_10230(class_7923.field_41175, new class_2960(Firstmod.MOD_ID, name), block);
    }
    
    private static class_1792 registerBlockItem(String name, class_2248 block) {
        return class_2378.method_10230(class_7923.field_41178, new class_2960(Firstmod.MOD_ID, name),
                new class_1747(block, new FabricItemSettings()));
    }

    public static void reigsterModBlocks() {
        Firstmod.LOGGER.info("Registering ModBlocks for " + Firstmod.MOD_ID);
    }
}
