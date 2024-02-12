package net.shifty.sengokuperiod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shifty.sengokuperiod.SengokuPeriod;
import net.shifty.sengokuperiod.block.ModBlocks;

public class ModBlockEntities {

    public static final BlockEntityType<TamahaganeSharpeningBlockEntity> TAMAHAGANE_SHARPENING_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SengokuPeriod.MOD_ID, "wetstone_sharpening_be"),
                    FabricBlockEntityTypeBuilder.create(TamahaganeSharpeningBlockEntity::new,
                            ModBlocks.TAMAHAGANE_SHARPENING).build());

    public static void registerBlockEntities() {
        SengokuPeriod.LOGGER.info("Registering Block Entities for " + SengokuPeriod.MOD_ID);
    }

}
