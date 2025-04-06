//Modul foloseste licenta MIT, mai mult detalli pe GitHub!

package net.hackovina.firstmod;

import net.fabricmc.api.ModInitializer;
import net.hackovina.firstmod.block.ModBlocks;
import net.hackovina.firstmod.item.ModItemGroups;
import net.hackovina.firstmod.custom.BurnableFuel;
import net.hackovina.firstmod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Firstmod implements ModInitializer {
    public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.reigsterModBlocks();
        BurnableFuel.reigsterModFuel();
    }
}
