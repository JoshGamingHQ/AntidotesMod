package com.jghq.ww.antidotes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import com.jghq.ww.antidotes.item.BadOmenAntidoteItem;
import com.jghq.ww.antidotes.item.BlindnessAntidoteItem;
import com.jghq.ww.antidotes.item.DarknessAntidoteItem;
import com.jghq.ww.antidotes.item.HungerAntidoteItem;
import com.jghq.ww.antidotes.item.MiningFatigueAntidoteItem;
import com.jghq.ww.antidotes.item.NauseaAntidoteItem;
import com.jghq.ww.antidotes.item.PoisonAntidoteItem;
import com.jghq.ww.antidotes.item.SlownessAntidoteItem;
import com.jghq.ww.antidotes.item.WeaknessAntidoteItem;
import com.jghq.ww.antidotes.item.WitherAntidoteItem;

public class Antidotes implements ModInitializer {

	public static final Item WARPED_WART = new Item(new FabricItemSettings());

	public static final Item PLASTIC_LUMP = new Item(new FabricItemSettings());

	public static final Item ANTIDOTE_DULL = new Item(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_SLOW = new SlownessAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_WEAKMINE = new MiningFatigueAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_SICK = new NauseaAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_BLIND = new BlindnessAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_FOOD = new HungerAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_WEAK = new WeaknessAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_TOXIC = new PoisonAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_WITHER = new WitherAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_RAID = new BadOmenAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));
	public static final Item ANTIDOTE_DARK = new DarknessAntidoteItem(new FabricItemSettings().maxCount(8).food(new FoodComponent.Builder().hunger(0).saturationModifier(0f).alwaysEdible().build()));

	@Override
	public void onInitialize() {
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "warped_wart"), WARPED_WART);

		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "plastic_lump"), PLASTIC_LUMP);

		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "dull_antidote"), ANTIDOTE_DULL);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "slowness_antidote"), ANTIDOTE_SLOW);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "mining_fatigue_antidote"), ANTIDOTE_WEAKMINE);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "nausea_antidote"), ANTIDOTE_SICK);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "blindness_antidote"), ANTIDOTE_BLIND);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "hunger_antidote"), ANTIDOTE_FOOD);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "weakness_antidote"), ANTIDOTE_WEAK);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "poison_antidote"), ANTIDOTE_TOXIC);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "wither_antidote"), ANTIDOTE_WITHER);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "bad_omen_antidote"), ANTIDOTE_RAID);
		  Registry.register(Registries.ITEM, new Identifier("wwantidotes", "darkness_antidote"), ANTIDOTE_DARK);
	}
}