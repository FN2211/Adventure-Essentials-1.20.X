package net.adventurestudio.adventureessentials.item;

import net.adventurestudio.adventureessentials.AdventureEssentials;
import net.adventurestudio.adventureessentials.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdventureEssentials.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ADVENTURE2_TAB = CREATIVE_MODE_TABS.register("adventure2_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KANISTER.get()))
                    .title(Component.translatable("creativetab.adventure2_tab"))
                    .displayItems((itemDisplayParameters, output) -> {


                        output.accept(ModItems.KANISTER.get());
                        output.accept(ModBlocks.FUEL_BARREL.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
