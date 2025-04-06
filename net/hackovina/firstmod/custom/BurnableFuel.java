package net.hackovina.firstmod.custom;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.hackovina.firstmod.Firstmod;
import net.hackovina.firstmod.item.ModItems;

public class BurnableFuel {

    private static void burnableFuel() {
        FuelRegistry.INSTANCE.add(ModItems.SULFUR, 400);
        FuelRegistry.INSTANCE.add(ModItems.HYDROGEN, 100);
        FuelRegistry.INSTANCE.add(ModItems.CARBON, 200);
    }

    public static void reigsterModFuel() {
        Firstmod.LOGGER.info("Registering ModFuel for " + Firstmod.MOD_ID);

        burnableFuel();
    }
}
