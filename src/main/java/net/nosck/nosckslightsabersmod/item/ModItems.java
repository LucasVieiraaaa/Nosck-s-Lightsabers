package net.nosck.nosckslightsabersmod.item;

import io.netty.resolver.DefaultHostsFileEntriesResolver;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nosck.nosckslightsabersmod.NoscksLightsabersMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NoscksLightsabersMod.MOD_ID);

    public static final RegistryObject<Item> KYBERCRYSTAL = ITEMS.register("kybercrystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_KYBERCRYSTAL = ITEMS.register("red_kybercrystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGNETIC_STABILIZING_RING = ITEMS.register("magnetic_stabilizing_ring",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CYCLING_FIELD_ENERGIZERS = ITEMS.register("cycling_field_energizers",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYSTAL_ENERGY_CHAMBER = ITEMS.register("crystal_energy_chamber",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
