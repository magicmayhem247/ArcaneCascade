package com.magicmayhem247.momentum.common.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MomentumCreativeModeTab
{
    public static final CreativeModeTab MOMENTUM_TAB = new CreativeModeTab("momentumtab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(MomentumItems.INERT_CRYSTAL.get());
        }
    };
}
