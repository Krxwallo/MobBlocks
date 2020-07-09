package com.justAm0dd3r.mob_blocks.item_group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import javax.annotation.Nonnull;

public class MobBlocksTab extends ItemGroup {

    public MobBlocksTab() {
        super("mob_blocks_tab");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.CREEPER_HEAD);
    }
}
