package com.jghq.ww.antidotes.item;

import java.util.List;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class SlownessAntidoteItem extends Item {
    public SlownessAntidoteItem(Settings settings) {
        super(settings);
    }

public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

    tooltip.add(Text.translatable("item.wwantidotes.blank_line.desc"));
    tooltip.add(Text.translatable("item.wwantidotes.antidote_action.desc").formatted(Formatting.DARK_PURPLE));
    tooltip.add(Text.translatable("item.wwantidotes.slowness_antidote.desc"));

}

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        if (!world.isClient) {
            user.removeStatusEffect(StatusEffects.SLOWNESS);
        }

        return stack;
    }

}
