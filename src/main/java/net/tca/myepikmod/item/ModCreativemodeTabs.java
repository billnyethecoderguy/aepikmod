package net.tca.myepikmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tca.myepikmod.block.ModBlocks;
import net.tca.myepikmod.myepikmod;

public class ModCreativemodeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, myepikmod.modId);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("cenite_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(modItems.BANANA.get()))
                    .title(Component.translatable("creativetab.CENITE_TAB"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(modItems.BANANA.get());

                        pOutput.accept(ModBlocks.CENITE_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}