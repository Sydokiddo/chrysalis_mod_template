package net.sydokiddo.mod_id;

import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import net.sydokiddo.chrysalis.Chrysalis;
import net.sydokiddo.chrysalis.util.helpers.DebugHelper;
import net.sydokiddo.mod_id.common.ModNameRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
@Mod(ModName.MOD_ID)
public class ModName {

    public static final Logger LOGGER = LoggerFactory.getLogger("Mod Name");
    public static RegistryAccess registryAccess;

    public static final String
        MOD_ID = "mod_id",
        MOD_VERSION = FMLLoader.getLoadingModList().getModFileById(ModName.MOD_ID).versionString()
    ;

    public ModName(ModContainer container, IEventBus eventBus) {
        if (Chrysalis.CHRYSALIS_INITIALIZED) {
            ModNameRegistry.registerAll(eventBus);
            DebugHelper.sendInitializedMessage(ModName.LOGGER, ModName.MOD_VERSION, false);
        }
    }

    // region Common Methods

    public static ResourceLocation resourceLocationId(String name) {
        return ResourceLocation.fromNamespaceAndPath(ModName.MOD_ID, name);
    }

    public static String stringId(String name) {
        return ModName.MOD_ID + ":" + name;
    }

    // endregion

    @SuppressWarnings("unused")
    @Mod(value = ModName.MOD_ID, dist = Dist.CLIENT)
    public static class ModNameClient {

        public ModNameClient(ModContainer container, IEventBus eventBus) {}
    }
}