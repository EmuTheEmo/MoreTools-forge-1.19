package com.jay.moretools.events;

import com.jay.moretools.item.custom.ObsidianArmorItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class ObsidianArmorEvent {

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent e) {
        if(!e.getEntityLiving().level.isClientSide && e.getSource() != null) {
            obsidianArmor(e);
        }
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.PlayerTickEvent event)
    {
        int armorCount = getWearingSetCount(event.player, ObsidianArmorItem.class);
        if(armorCount > 0 && armorCount <= 3) {
            event.player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            event.player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 0, true, false, false));

        }
        else if(armorCount >= 4)
        {
            event.player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 1, true, false, false));
        }
        else if(armorCount <= 0)
        {
            event.player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
        }
    }

    private boolean obsidianArmor(LivingHurtEvent e) {
        LivingEntity hurt = e.getEntityLiving();

        int armorCount = getWearingSetCount(hurt, ObsidianArmorItem.class);
        if(armorCount > 0)
        {
            if(e.getSource().isExplosion()) {
                e.setAmount(e.getAmount() * (1 - armorCount / 4F));
            }

            return true;
        }
        return false;
    }

    public static int getWearingSetCount(LivingEntity entity, Class<? extends ArmorItem> armorClass) {
        ItemStack HEAD, CHEST, LEGS, FEET;
        HEAD = entity.getItemBySlot(EquipmentSlot.HEAD);
        CHEST = entity.getItemBySlot(EquipmentSlot.CHEST);
        LEGS = entity.getItemBySlot(EquipmentSlot.LEGS);
        FEET = entity.getItemBySlot(EquipmentSlot.FEET);

        boolean helmet = !HEAD.isEmpty() && armorClass.isInstance(HEAD.getItem());
        boolean chest = !CHEST.isEmpty() && armorClass.isInstance(CHEST.getItem());
        boolean legs = !LEGS.isEmpty() && armorClass.isInstance(LEGS.getItem());
        boolean boots = !FEET.isEmpty() && armorClass.isInstance(FEET.getItem());
        return (helmet ? 1 : 0) + (chest ? 1 : 0) + (legs ? 1 : 0) + (boots ? 1 : 0);
    }
}
