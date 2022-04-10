package com.magicmayhem247.arcanecascade.common.registry;

import com.magicmayhem247.arcanecascade.ArcaneCascade;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArcaneItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneCascade.MOD_ID);

    //Crafting Items
    public static final RegistryObject<Item> INERT_CRYSTAL = ITEMS.register("inert_crystal", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CHARGED_CRYSTAL = ITEMS.register("charged_crystal", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
