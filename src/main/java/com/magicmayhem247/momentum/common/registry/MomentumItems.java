package com.magicmayhem247.momentum.common.registry;

import com.magicmayhem247.momentum.Momentum;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MomentumItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Momentum.MOD_ID);

    //Crafting Items
    public static final RegistryObject<Item> INERT_CRYSTAL = ITEMS.register("inert_crystal", () -> new Item(new Item.Properties().stacksTo(64).tab(MomentumCreativeModeTab.MOMENTUM_TAB)));
    public static final RegistryObject<Item> CHARGED_CRYSTAL = ITEMS.register("charged_crystal", () -> new Item(new Item.Properties().stacksTo(64).tab(MomentumCreativeModeTab.MOMENTUM_TAB)));
    public static final RegistryObject<Item> POTENTIAL_CRYSTAL = ITEMS.register("potential_crystal", () -> new Item(new Item.Properties().stacksTo(64).tab(MomentumCreativeModeTab.MOMENTUM_TAB)));
    public static final RegistryObject<Item> KINETIC_CRYSTAL = ITEMS.register("kinetic_crystal", () -> new Item(new Item.Properties().stacksTo(64).tab(MomentumCreativeModeTab.MOMENTUM_TAB)));

    //Tools

    //Utils

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
