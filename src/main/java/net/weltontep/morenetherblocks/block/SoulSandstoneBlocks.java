package net.weltontep.morenetherblocks.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.weltontep.morenetherblocks.MoreNetherBlocks;

public class SoulSandstoneBlocks {

    public static final Block SOUL_SAND_LOOSE = registerBlock("soulsandstone/soul_sand_loose",
            new FallingBlock(AbstractBlock.Settings.create().strength(0.5F)
                    .suffocates(Blocks::always)
                    .sounds(BlockSoundGroup.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() {
                    return null;
                }
            });

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreNetherBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreNetherBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreNetherBlocks.LOGGER.info("Registering Soul Sandstone Blocks for " + MoreNetherBlocks.MOD_ID);
    }
}
