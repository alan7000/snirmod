/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.snir.common.block;

import fr.freeboxos.ftb.snir.SnirMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = SnirMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

/**
 *
 * @author alan
 */
public class SnirModBlocks {

    /**
     * Block nugget emerald ore
     */
    @ObjectHolder(SnirMod.MOD_ID + ":block_nugget_emerald")
    public static final Block BLOCK_NUGGET_EMERALD = null;

    /**
     * Block nugget diamond ore
     */
    @ObjectHolder(SnirMod.MOD_ID + ":block_nugget_diamond")
    public static final Block BLOCK_NUGGET_DIAMOND = null;

    /**
     * Block dust nether star ore
     */
    @ObjectHolder(SnirMod.MOD_ID + ":block_dust_netherstar")
    public static final Block BLOCK_DUST_NETHERSTAR = null;

    /**
     * Déclaration de tous les blocs du mod.
     *
     * @param event
     */
    @SubscribeEvent
    public static void registerBlock(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockNuggetEmerald(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("block_nugget_emerald"));
        event.getRegistry().register(new BlockNuggetDiamond(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("block_nugget_diamond"));
        event.getRegistry().register(new BlockDustNetherStar(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName("block_dust_netherstar"));
    }

    /**
     * Déclaration de tous les item lier au blocs du mod.
     *
     * @param event
     */
    @SubscribeEvent
    public static void registerItem(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(BLOCK_NUGGET_EMERALD, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BLOCK_NUGGET_EMERALD.getRegistryName()));
        event.getRegistry().register(new BlockItem(BLOCK_NUGGET_DIAMOND, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BLOCK_NUGGET_DIAMOND.getRegistryName()));
        event.getRegistry().register(new BlockItem(BLOCK_DUST_NETHERSTAR, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BLOCK_DUST_NETHERSTAR.getRegistryName()));
    }

}
