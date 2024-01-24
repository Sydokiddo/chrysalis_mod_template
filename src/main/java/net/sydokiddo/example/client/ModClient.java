package net.sydokiddo.example.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.sydokiddo.chrysalis.Chrysalis;

@Environment(EnvType.CLIENT)
public class ModClient implements ClientModInitializer {

    @SuppressWarnings("all")
    @Override
    public void onInitializeClient() {
        if (Chrysalis.CHRYSALIS_INITIALIZED) {
            // Client Registry
        }
    }
}