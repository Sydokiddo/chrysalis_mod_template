package net.sydokiddo.mod_id.common;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.sydokiddo.chrysalis.util.helpers.DebugHelper;
import net.sydokiddo.mod_id.ModName;

@SuppressWarnings("unused")
public class ModNameRegistry {

    public static void registerAll(IEventBus eventBus) {}

    @EventBusSubscriber(modid = ModName.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientRegistry {

        @SubscribeEvent
        private static void onClientSetup(FMLClientSetupEvent event) {
            DebugHelper.sendInitializedMessage(ModName.LOGGER, ModName.MOD_VERSION, true);
        }
    }
}