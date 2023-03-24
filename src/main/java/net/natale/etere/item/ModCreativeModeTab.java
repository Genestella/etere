package net.natale.etere.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DAVIDE_PIEROTTI_TAB = new CreativeModeTab("davidepierottitab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ETERE.get());

        }

    };
}
