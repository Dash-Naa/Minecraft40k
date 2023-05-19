
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.warhammermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.warhammermod.world.features.ores.AdamantiumOreFeature;
import net.mcreator.warhammermod.WarhammerModMod;

@Mod.EventBusSubscriber
public class WarhammerModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WarhammerModMod.MODID);
	public static final RegistryObject<Feature<?>> ADAMANTIUM_ORE = REGISTRY.register("adamantium_ore", AdamantiumOreFeature::feature);
}
