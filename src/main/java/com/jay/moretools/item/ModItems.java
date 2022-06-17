package com.jay.moretools.item;

import com.jay.moretools.MoreTools;
import com.jay.moretools.item.custom.ObsidianArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreTools.MOD_ID);

    //Copper Armor
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));

    //Emerald Armor
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));

    //Obsidian Armor
    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ObsidianArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ObsidianArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ObsidianArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ObsidianArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.MTOOLS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
