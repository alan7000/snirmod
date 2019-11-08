/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.snir.common.item;

import fr.freeboxos.ftb.snir.SnirMod;
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
public class SnirModItems {

    /**
     * Item nugget emerald
     */
    @ObjectHolder(SnirMod.MOD_ID + ":item_nugget_emerald")
    public static final Item ITEM_NUGGET_EMERALD = null;

    /**
     * Item nugget diamond
     */
    @ObjectHolder(SnirMod.MOD_ID + ":item_nugget_diamond")
    public static final Item ITEM_NUGGET_DIAMOND = null;

    /**
     * Item dust nether star
     */
    @ObjectHolder(SnirMod.MOD_ID + ":item_dust_netherstar")
    public static final Item ITEM_DUST_NETHERSTAR = null;

    /**
     * Item nether star ingot
     */
    @ObjectHolder(SnirMod.MOD_ID + ":item_netherstar_ingot")
    public static final Item ITEM_NETHERSTAR_INGOT = null;

    /**
     * Item gold brut
     */
    @ObjectHolder(SnirMod.MOD_ID + ":item_gold_brut")
    public static final Item ITEM_GOLD_BRUT = null;

    /**
     * Creation de tous les items
     *
     * @param event
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemNuggetEmerald(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("item_nugget_emerald"));
        event.getRegistry().register(new ItemNuggetDiamond(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("item_nugget_diamond"));
        event.getRegistry().register(new ItemDustNetherStar(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("item_dust_netherstar"));
        event.getRegistry().register(new ItemNetherStarIngot(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("item_netherstar_ingot"));
        event.getRegistry().register(new ItemGoldBrut(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("item_gold_brut"));
    }

}
