package com.justAm0dd3r.mob_blocks.registry;

import com.justAm0dd3r.mob_blocks.block.CreeperBlock;
import com.justAm0dd3r.mob_blocks.block_item.BlockItemBase;
import com.justAm0dd3r.mob_blocks.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.justAm0dd3r.mob_blocks.registry.Items.ITEMS;
import static com.justAm0dd3r.mob_blocks.MobBlocks.LOGGER;

@SuppressWarnings("unused")
class Blocks {
    static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    // Creeper Block
    public static final RegistryObject<Block> CREEPER_BLOCK = BLOCKS.register("creeper_block", CreeperBlock::new);
    public static final RegistryObject<Item> CREEPER_BLOCK_ITEM = ITEMS.register("creeper_block",
            () -> new BlockItemBase(CREEPER_BLOCK.get()));


}
