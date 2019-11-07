/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.snir;

import fr.freeboxos.ftb.snir.common.utils.OreGeneration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SnirMod.MOD_ID)

/**
 *
 * @author alan
 */
public class SnirMod {

    public static final String MOD_ID = "snirmod";

    // le logger du mod
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public SnirMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    public static OreGeneration oreGeneration = new OreGeneration();

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Modtutoriel setup");
        oreGeneration.init();
    }

    private void clientSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Mod tutoriel client setup");
    }

    private void serverSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Mod tutoriel server setup");
    }
}
