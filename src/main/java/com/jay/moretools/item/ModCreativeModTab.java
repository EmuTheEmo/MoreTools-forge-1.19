package com.jay.moretools.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModTab {
    public static final CreativeModeTab MTOOLS_TAB = new CreativeModeTab("mtoolstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.ARMOR_STAND);
        }
    };
}
