package net.adventurestudio.adventureessentials.item;

import net.adventurestudio.adventureessentials.AdventureEssentials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdventureEssentials.MOD_ID);

    public static final RegistryObject<Item> EMPTY_KANISTER = ITEMS.register("empty_kanister",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FULL_KANISTER = ITEMS.register("full_kanister",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
