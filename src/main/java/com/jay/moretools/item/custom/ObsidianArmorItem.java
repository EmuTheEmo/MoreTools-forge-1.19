package com.jay.moretools.item.custom;

import com.jay.moretools.item.ModArmorMaterials;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class ObsidianArmorItem extends ArmorItem {


    public ObsidianArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(ModArmorMaterials.OBSIDIAN, slot, settings);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.moretools.obsidian_armor.tooltip.blastproof"));
            pTooltipComponents.add(Component.translatable("tooltip.moretools.obsidian_armor.tooltip.heavy"));
    }
}
