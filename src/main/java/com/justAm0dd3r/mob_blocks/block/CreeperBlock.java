package com.justAm0dd3r.mob_blocks.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CreeperBlock extends Block {
    public CreeperBlock() {
        super(AbstractBlock.Properties
                .create(Material.MISCELLANEOUS)
                .hardnessAndResistance(1.0f)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
