
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.warhammermod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.warhammermod.client.model.ModelFlakArmourConverted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WarhammerModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelFlakArmourConverted.LAYER_LOCATION, ModelFlakArmourConverted::createBodyLayer);
	}
}
