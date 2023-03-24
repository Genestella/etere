package net.natale.etere.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.natale.etere.Etere;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Etere.MOD_ID);
    public static final RegistryObject<Item> ETERE = ITEMS.register("etere",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DAVIDE_PIEROTTI_TAB)));
    public static final RegistryObject<Item> ETERE_PURO = ITEMS.register("etere_puro",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DAVIDE_PIEROTTI_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
