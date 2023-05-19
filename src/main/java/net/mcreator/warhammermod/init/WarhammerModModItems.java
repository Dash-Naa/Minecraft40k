
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.warhammermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.warhammermod.item.HighGradeCeramiteItem;
import net.mcreator.warhammermod.item.FlakArmourItem;
import net.mcreator.warhammermod.item.CeramiteItem;
import net.mcreator.warhammermod.item.AdamantiumSwordItem;
import net.mcreator.warhammermod.item.AdamantiumShovelItem;
import net.mcreator.warhammermod.item.AdamantiumPickaxeItem;
import net.mcreator.warhammermod.item.AdamantiumIngotItem;
import net.mcreator.warhammermod.item.AdamantiumHoeItem;
import net.mcreator.warhammermod.item.AdamantiumAxeItem;
import net.mcreator.warhammermod.item.AdamantiumArmorItem;
import net.mcreator.warhammermod.WarhammerModMod;

public class WarhammerModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WarhammerModMod.MODID);
	public static final RegistryObject<Item> CERAMITE = REGISTRY.register("ceramite", () -> new CeramiteItem());
	public static final RegistryObject<Item> CERAMITE_BRICK_SLAB = block(WarhammerModModBlocks.CERAMITE_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CERAMITE_BRICK = block(WarhammerModModBlocks.CERAMITE_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CERAMITE_BRICK_STAIRS = block(WarhammerModModBlocks.CERAMITE_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CERAMITE_WALL = block(WarhammerModModBlocks.CERAMITE_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FLAK_ARMOUR_HELMET = REGISTRY.register("flak_armour_helmet", () -> new FlakArmourItem.Helmet());
	public static final RegistryObject<Item> FLAK_ARMOUR_CHESTPLATE = REGISTRY.register("flak_armour_chestplate", () -> new FlakArmourItem.Chestplate());
	public static final RegistryObject<Item> FLAK_ARMOUR_LEGGINGS = REGISTRY.register("flak_armour_leggings", () -> new FlakArmourItem.Leggings());
	public static final RegistryObject<Item> FLAK_ARMOUR_BOOTS = REGISTRY.register("flak_armour_boots", () -> new FlakArmourItem.Boots());
	public static final RegistryObject<Item> ADAMANTIUM_ARMOR_HELMET = REGISTRY.register("adamantium_armor_helmet", () -> new AdamantiumArmorItem.Helmet());
	public static final RegistryObject<Item> ADAMANTIUM_ARMOR_CHESTPLATE = REGISTRY.register("adamantium_armor_chestplate", () -> new AdamantiumArmorItem.Chestplate());
	public static final RegistryObject<Item> ADAMANTIUM_ARMOR_LEGGINGS = REGISTRY.register("adamantium_armor_leggings", () -> new AdamantiumArmorItem.Leggings());
	public static final RegistryObject<Item> ADAMANTIUM_ARMOR_BOOTS = REGISTRY.register("adamantium_armor_boots", () -> new AdamantiumArmorItem.Boots());
	public static final RegistryObject<Item> ADAMANTIUM_ORE = block(WarhammerModModBlocks.ADAMANTIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ADAMANTIUM_BLOCK = block(WarhammerModModBlocks.ADAMANTIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ADAMANTIUM_INGOT = REGISTRY.register("adamantium_ingot", () -> new AdamantiumIngotItem());
	public static final RegistryObject<Item> ADAMANTIUM_AXE = REGISTRY.register("adamantium_axe", () -> new AdamantiumAxeItem());
	public static final RegistryObject<Item> ADAMANTIUM_PICKAXE = REGISTRY.register("adamantium_pickaxe", () -> new AdamantiumPickaxeItem());
	public static final RegistryObject<Item> ADAMANTIUM_SWORD = REGISTRY.register("adamantium_sword", () -> new AdamantiumSwordItem());
	public static final RegistryObject<Item> ADAMANTIUM_SHOVEL = REGISTRY.register("adamantium_shovel", () -> new AdamantiumShovelItem());
	public static final RegistryObject<Item> ADAMANTIUM_HOE = REGISTRY.register("adamantium_hoe", () -> new AdamantiumHoeItem());
	public static final RegistryObject<Item> HIGH_GRADE_CERAMITE = REGISTRY.register("high_grade_ceramite", () -> new HighGradeCeramiteItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
