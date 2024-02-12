package net.shifty.sengokuperiod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.shifty.sengokuperiod.screen.ModScreenHandlers;
import net.shifty.sengokuperiod.screen.TamahaganeSharpeningScreen;

public class SengokuPeriodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.TAMAHAGANE_SHARPENING_SCREEN_HANDLER, TamahaganeSharpeningScreen::new);

    }
}
