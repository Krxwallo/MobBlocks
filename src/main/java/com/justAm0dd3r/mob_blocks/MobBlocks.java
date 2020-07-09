package com.justAm0dd3r.mob_blocks;

import com.justAm0dd3r.mob_blocks.reference.Reference;
import com.justAm0dd3r.mob_blocks.registry.Registries;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class MobBlocks
{
    public static final Logger LOGGER = LogManager.getLogger();

    public MobBlocks() {
        LOGGER.info(Reference.MOD_NAME + " Version " + Reference.VERSION + " by " + Reference.AUTHOR + " started up.");

        Registries.init();
    }
}
