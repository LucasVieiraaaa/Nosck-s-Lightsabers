package net.nosck.nosckslightsabersmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nosck.nosckslightsabersmod.NoscksLightsabersMod;
import net.nosck.nosckslightsabersmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NoscksLightsabersMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("nosckslightsabersmod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KYBERCRYSTAL.get()))
                    .title(Component.translatable("creativetab.nosckslightsabersmod"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KYBERCRYSTAL.get());
                        pOutput.accept(ModItems.RED_KYBERCRYSTAL.get());
                        pOutput.accept(ModItems.MAGNETIC_STABILIZING_RING.get());
                        pOutput.accept(ModItems.CYCLING_FIELD_ENERGIZERS.get());
                        pOutput.accept(ModItems.CRYSTAL_ENERGY_CHAMBER.get());
                        pOutput.accept(ModItems.POWER_FIELD_CONDUCTOR.get());
                        pOutput.accept(ModItems.DIATIUM_POWER_CELL.get());
                        pOutput.accept(ModItems.COMPLETED_POWER_FIELD_CONDUCTOR.get());
                        pOutput.accept(ModBlocks.LIGHT_BOOKSHELF.get());
                        pOutput.accept(ModBlocks.DARK_BOOKSHELF.get());
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}