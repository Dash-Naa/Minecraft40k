
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.warhammermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.warhammermod.block.CeramiteWallBlock;
import net.mcreator.warhammermod.block.CeramiteBrickStairsBlock;
import net.mcreator.warhammermod.block.CeramiteBrickSlabBlock;
import net.mcreator.warhammermod.block.CeramiteBrickBlock;
import net.mcreator.warhammermod.block.AdamantiumOreBlock;
import net.mcreator.warhammermod.block.AdamantiumBlockBlock;
import net.mcreator.warhammermod.WarhammerModMod;

public class WarhammerModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WarhammerModMod.MODID);
	public static final RegistryObject<Block> CERAMITE_BRICK_SLAB = REGISTRY.register("ceramite_brick_slab", () -> new CeramiteBrickSlabBlock());
	public static final RegistryObject<Block> CERAMITE_BRICK = REGISTRY.register("ceramite_brick", () -> new CeramiteBrickBlock());
	public static final RegistryObject<Block> CERAMITE_BRICK_STAIRS = REGISTRY.register("ceramite_brick_stairs", () -> new CeramiteBrickStairsBlock());
	public static final RegistryObject<Block> CERAMITE_WALL = REGISTRY.register("ceramite_wall", () -> new CeramiteWallBlock());
	public static final RegistryObject<Block> ADAMANTIUM_ORE = REGISTRY.register("adamantium_ore", () -> new AdamantiumOreBlock());
	public static final RegistryObject<Block> ADAMANTIUM_BLOCK = REGISTRY.register("adamantium_block", () -> new AdamantiumBlockBlock());
}
