package com.justAm0dd3r.mob_blocks.block_item;

import com.justAm0dd3r.mob_blocks.item_group.ItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Properties().group(ItemGroups.MOB_BLOCKS_TAB));
    }
}
