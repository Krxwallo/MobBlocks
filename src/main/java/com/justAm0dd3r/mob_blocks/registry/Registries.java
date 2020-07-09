package com.justAm0dd3r.mob_blocks.registry;

import static com.justAm0dd3r.mob_blocks.MobBlocks.LOGGER;

public class Registries {
    public static void init() {
        Blocks.init();
        Items.init();
        LOGGER.info("Registered all registries.");
    }
}
