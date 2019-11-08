/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.snir.common.utils;

import fr.freeboxos.ftb.snir.common.block.SnirModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

/**
 *
 * @author alan
 */
public class OreGeneration {

    public void init() {
        //OreGenerator
        for (Biome biome : ForgeRegistries.BIOMES) {

            /**
             * Generation nugget emerald
             */
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SnirModBlocks.BLOCK_NUGGET_EMERALD.getDefaultState(), 6
            ), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 128)));

            /**
             * Generation nugget diamond
             */
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SnirModBlocks.BLOCK_NUGGET_DIAMOND.getDefaultState(), 6
            ), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 128)));

            /**
             * Generation dust netherstar
             */
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SnirModBlocks.BLOCK_DUST_NETHERSTAR.getDefaultState(), 10
            ), Placement.COUNT_RANGE, new CountRangeConfig(1, 20, 0, 128)));

            /**
             * Generation gold brut
             */
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SnirModBlocks.BLOCK_GOLD_BRUT.getDefaultState(), 6
            ), Placement.COUNT_RANGE, new CountRangeConfig(20, 20, 0, 128)));
        }
    }

}
