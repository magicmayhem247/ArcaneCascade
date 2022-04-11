package com.magicmayhem247.momentum;

import com.magicmayhem247.momentum.common.registry.MomentumBlocks;
import com.magicmayhem247.momentum.common.registry.MomentumItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Momentum.MOD_ID)
public class Momentum
{

    public static final String MOD_ID = "momentum";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Momentum()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MomentumItems.register(eventBus);
        MomentumBlocks.register(eventBus);


        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
