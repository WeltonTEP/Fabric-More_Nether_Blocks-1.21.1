package net.weltontep.morenetherblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.weltontep.morenetherblocks.block.*;

import java.util.concurrent.CompletableFuture;

public class ModMiscBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModMiscBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.NYLIUM)
                .add(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS)
                .add(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS_CRACKED)
                .add(CrimsonBlocks.CRIMSON_BLUE_NYLIUM_BRICKS)
                .add(CrimsonBlocks.CRIMSON_BLUE_NYLIUM_BRICKS_CRACKED)
                .add(CrimsonBlocks.CRIMSON_NYLIUM_BRICKS)
                .add(CrimsonBlocks.CRIMSON_NYLIUM_BRICKS_CRACKED)
                .add(CrimsonBlocks.CRIMSON_RED_NYLIUM_BRICKS)
                .add(CrimsonBlocks.CRIMSON_RED_NYLIUM_BRICKS_CRACKED)
                .add(CrimsonBlocks.CRIMSON_NETHERRACK_NYLIUM)
                .add(CrimsonBlocks.CRIMSON_NETHERRACK_NYLIUM_CRACKED)
                .add(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS)
                .add(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS_CRACKED)
                .add(WarpedBlocks.WARPED_BLUE_NYLIUM_BRICKS)
                .add(WarpedBlocks.WARPED_BLUE_NYLIUM_BRICKS_CRACKED)
                .add(WarpedBlocks.WARPED_NYLIUM_BRICKS)
                .add(WarpedBlocks.WARPED_NYLIUM_BRICKS_CRACKED)
                .add(WarpedBlocks.WARPED_RED_NYLIUM_BRICKS)
                .add(WarpedBlocks.WARPED_RED_NYLIUM_BRICKS_CRACKED)
                .add(WarpedBlocks.WARPED_NETHERRACK_NYLIUM)
                .add(WarpedBlocks.WARPED_NETHERRACK_NYLIUM_CRACKED);

        getOrCreateTagBuilder(BlockTags.IMPERMEABLE)
                .add(GlowstoneBlocks.GLOWSTONE_GLASS)
                .add(ObsidianBlocks.OBSIDIAN_GLASS);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(MiscBlocks.CHARCOAL_LOG)
                .add(MiscBlocks.CHARCOAL_WOOD)
                .add(MiscBlocks.CHARCOAL_LOG_STRIPPED)
                .add(MiscBlocks.CHARCOAL_WOOD_STRIPPED);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(MiscBlocks.CHARCOAL_LOG)
                .add(MiscBlocks.CHARCOAL_WOOD)
                .add(MiscBlocks.CHARCOAL_LOG_STRIPPED)
                .add(MiscBlocks.CHARCOAL_WOOD_STRIPPED)
                .add(MiscBlocks.CHARCOAL_PLANKS)
                .add(MiscBlocks.CHARCOAL_SLAB)
                .add(MiscBlocks.CHARCOAL_STAIRS)
                .add(MiscBlocks.CHARCOAL_FENCE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(GlowstoneBlocks.GLOW_SAND)
                .add(ObsidianBlocks.OBSIDIAN_SAND)
                .add(SoulSandstoneBlocks.SOUL_SAND_LOOSE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(MiscBlocks.BLUE_NETHER_BRICK_FENCE)
                .add(MiscBlocks.BLUE_NETHER_BRICK_CRACKED_FENCE)
                .add(MiscBlocks.NETHER_BRICK_CRACKED_FENCE)
                .add(MiscBlocks.RED_NETHER_BRICK_FENCE)
                .add(MiscBlocks.RED_NETHER_BRICK_CRACKED_FENCE)
                .add(MiscBlocks.CHARCOAL_FENCE);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(MiscBlocks.CHARCOAL_PLANKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(PlatinumBlocks.NETHERITE_ORE)
                .add(PlatinumBlocks.NETHERITE_SCRAP_BLOCK)
                .add(PlatinumBlocks.NETHERITE_SCRAP_STAIRS)
                .add(PlatinumBlocks.NETHERITE_SCRAP_SLAB)
                .add(PlatinumBlocks.NETHERITE_SCRAP_WALL);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(PlatinumBlocks.PLATINUM_BLOCK);
    }
    }