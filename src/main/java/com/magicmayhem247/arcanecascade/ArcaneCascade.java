package com.magicmayhem247.arcanecascade;

import com.magicmayhem247.arcanecascade.common.registry.ArcaneBlocks;
import com.magicmayhem247.arcanecascade.common.registry.ArcaneItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

@Mod(ArcaneCascade.MOD_ID)
public class ArcaneCascade
{

    public static final String MOD_ID = "arcade";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ArcaneCascade()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ArcaneItems.register(eventBus);
        ArcaneBlocks.register(eventBus);


        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
