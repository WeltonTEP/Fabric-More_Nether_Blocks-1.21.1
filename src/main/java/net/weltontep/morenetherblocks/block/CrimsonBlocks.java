package net.weltontep.morenetherblocks.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.weltontep.morenetherblocks.MoreNetherBlocks;
import net.weltontep.morenetherblocks.block.custom.CrimsonBlackstoneBrickBlock;
import net.weltontep.morenetherblocks.block.custom.BlackstoneNyliumBrickBlock;

public class CrimsonBlocks {

    public static final Block CRIMSON_BLACKSTONE_POLISHED_BRICKS = registerBlock("crimson/crimson_blackstone_polished_bricks",
            new CrimsonBlackstoneBrickBlock(
                    AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_BRICK_STAIRS = registerBlock("crimson/crimson_blackstone_polished_brick_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_BRICK_SLAB = registerBlock("crimson/crimson_blackstone_polished_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_BRICK_WALL = registerBlock("crimson/crimson_blackstone_polished_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_BRICKS_CRACKED = registerBlock("crimson/crimson_blackstone_polished_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_BRICK_CRACKED_STAIRS = registerBlock("crimson/crimson_blackstone_polished_brick_cracked_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_BRICK_CRACKED_SLAB = registerBlock("crimson/crimson_blackstone_polished_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_BRICK_CRACKED_WALL = registerBlock("crimson/crimson_blackstone_polished_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_NYLIUM_BRICKS = registerBlock("crimson/crimson_blackstone_polished_nylium_bricks",
            new BlackstoneNyliumBrickBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLACKSTONE_POLISHED_NYLIUM_BRICKS_CRACKED = registerBlock("crimson/crimson_blackstone_polished_nylium_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block CRIMSON_BLUE_NETHER_BRICKS = registerBlock("crimson/crimson_blue_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NETHER_BRICK_STAIRS = registerBlock("crimson/crimson_blue_nether_brick_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NETHER_BRICK_SLAB = registerBlock("crimson/crimson_blue_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NETHER_BRICK_WALL = registerBlock("crimson/crimson_blue_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NETHER_BRICKS_CRACKED = registerBlock("crimson/crimson_blue_nether_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NETHER_BRICK_CRACKED_STAIRS = registerBlock("crimson/crimson_blue_nether_brick_cracked_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NETHER_BRICK_CRACKED_SLAB = registerBlock("crimson/crimson_blue_nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NETHER_BRICK_CRACKED_WALL = registerBlock("crimson/crimson_blue_nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NYLIUM_BRICKS = registerBlock("crimson/crimson_blue_nylium_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_BLUE_NYLIUM_BRICKS_CRACKED = registerBlock("crimson/crimson_blue_nylium_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NETHER_BRICKS = registerBlock("crimson/crimson_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NETHER_BRICK_STAIRS = registerBlock("crimson/crimson_nether_brick_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NETHER_BRICK_SLAB = registerBlock("crimson/crimson_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NETHER_BRICK_WALL = registerBlock("crimson/crimson_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NETHER_BRICKS_CRACKED = registerBlock("crimson/crimson_nether_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NETHER_BRICK_CRACKED_STAIRS = registerBlock("crimson/crimson_nether_brick_cracked_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NETHER_BRICK_CRACKED_SLAB = registerBlock("crimson/crimson_nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NETHER_BRICK_CRACKED_WALL = registerBlock("crimson/crimson_nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NYLIUM_BRICKS = registerBlock("crimson/crimson_nylium_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_NYLIUM_BRICKS_CRACKED = registerBlock("crimson/crimson_nylium_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NETHER_BRICKS = registerBlock("crimson/crimson_red_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NETHER_BRICK_STAIRS = registerBlock("crimson/crimson_red_nether_brick_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NETHER_BRICK_SLAB = registerBlock("crimson/crimson_red_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NETHER_BRICK_WALL = registerBlock("crimson/crimson_red_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NETHER_BRICKS_CRACKED = registerBlock("crimson/crimson_red_nether_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NETHER_BRICK_CRACKED_STAIRS = registerBlock("crimson/crimson_red_nether_brick_cracked_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NETHER_BRICK_CRACKED_SLAB = registerBlock("crimson/crimson_red_nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NETHER_BRICK_CRACKED_WALL = registerBlock("crimson/crimson_red_nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NYLIUM_BRICKS = registerBlock("crimson/crimson_red_nylium_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRIMSON_RED_NYLIUM_BRICKS_CRACKED = registerBlock("crimson/crimson_red_nylium_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreNetherBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreNetherBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreNetherBlocks.LOGGER.info("Registering Crimson Blocks for " + MoreNetherBlocks.MOD_ID);
    }
}
