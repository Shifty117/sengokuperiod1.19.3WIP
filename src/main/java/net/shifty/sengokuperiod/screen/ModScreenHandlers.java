package net.shifty.sengokuperiod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.shifty.sengokuperiod.SengokuPeriod;

public class ModScreenHandlers {
    public static final ScreenHandlerType<TamahaganeSharpeningScreenHandler> TAMAHAGANE_SHARPENING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SengokuPeriod.MOD_ID, "tamahagane_sharpening"),
                    new ExtendedScreenHandlerType<>(TamahaganeSharpeningScreenHandler::new));

    public static void registerScreenHandlers() {
        SengokuPeriod.LOGGER.info("Registering Screen Handlers" + SengokuPeriod.MOD_ID);
    }
}
