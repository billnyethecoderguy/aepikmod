package net.tca.myepikmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tca.myepikmod.myepikmod;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, myepikmod.modId);



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
