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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
