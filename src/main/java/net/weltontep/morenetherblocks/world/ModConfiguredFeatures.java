package net.weltontep.morenetherblocks.world;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MultifaceGrowthBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.PredicatedStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.weltontep.morenetherblocks.MoreNetherBlocks;
import net.weltontep.morenetherblocks.block.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SMOOTH_BASALT_DELTA_ORE_KEY = registerKey("smooth_basalt_delta_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DOWN_DEEPSLATE_ORE_KEY = registerKey("down_deepslate_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DOWN_SMOOTH_BASALT_ORE_KEY = registerKey("down_smooth_basalt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> UP_SMOOTH_BASALT_ORE_KEY = registerKey("up_smooth_basalt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERITE_ORE_KEY = registerKey("netherite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DOWN_NETHERITE_ORE_KEY = registerKey("down_netherite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_ORE_KEY = registerKey("netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> UP_DEEPSLATE_ORE_KEY = registerKey("up_deepslate_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OBSIDIAN_ORE_KEY = registerKey("obsidian_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRYING_OBSIDIAN_ORE_KEY = registerKey("crying_obsidian_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GILDED_BLACKSTONE_ORE_KEY = registerKey("gilded_blackstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGMA_ORE_KEY = registerKey("magma_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAVA_ORE_KEY = registerKey("lava_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_ORE_KEY = registerKey("cobblestone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANDESITE_ORE_KEY = registerKey("andesite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BASALT_COBBLED_ORE_KEY = registerKey("basalt_cobbled_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BASALT_SMOOTH_CRACKED_ORE_KEY = registerKey("basalt_smooth_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACKSTONE_COBBLED_ORE_KEY = registerKey("blackstone_cobbled_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACKSTONE_NETHERITE_ORE_KEY = registerKey("blackstone_netherite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLOODSTONE_COBBLED_ORE_KEY = registerKey("bloodstone_cobbled_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_NETHERRACK_ORE_KEY = registerKey("crimson_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_NETHERRACK_CRACKED_ORE_KEY = registerKey("crimson_netherrack_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRACKED_NETHER_BRICK_ORE_KEY = registerKey("cracked_nether_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERSTONE_COBBLED_ORE_KEY = registerKey("netherstone_cobbled_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERSTONE_POLISHED_CUT_BRICK_ORE_KEY = registerKey("netherstone_polished_cut_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY = registerKey("netherstone_polished_cut_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_KEY = registerKey("crimson_blackstone_polished_large_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_KEY = registerKey("crimson_blackstone_polished_large_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_NETHER_BRICK_ORE_KEY = registerKey("crimson_nether_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_NETHER_BRICK_ORE_KEY = registerKey("red_nether_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_NETHER_BRICK_CRACKED_ORE_KEY = registerKey("red_nether_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_NETHER_BRICK_CRACKED_ORE_KEY = registerKey("crimson_nether_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_RED_NETHER_BRICK_ORE_KEY = registerKey("crimson_red_nether_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_RED_NETHER_BRICK_CRACKED_ORE_KEY = registerKey("crimson_red_nether_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSONSTONE_COBBLED_ORE_KEY = registerKey("crimsonstone_cobbled_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSONSTONE_POLISHED_CUT_BRICK_ORE_KEY = registerKey("crimsonstone_polished_cut_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSONSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY = registerKey("crimsonstone_polished_cut_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_NETHERRACK_ORE_KEY = registerKey("warped_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_NETHERRACK_CRACKED_ORE_KEY = registerKey("warped_netherrack_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_KEY = registerKey("warped_blackstone_polished_large_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_KEY = registerKey("warped_blackstone_polished_large_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_NETHER_BRICK_ORE_KEY = registerKey("warped_nether_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_NETHER_BRICK_ORE_KEY = registerKey("blue_nether_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_NETHER_BRICK_CRACKED_ORE_KEY = registerKey("blue_nether_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_NETHER_BRICK_CRACKED_ORE_KEY = registerKey("warped_nether_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_BLUE_NETHER_BRICK_ORE_KEY = registerKey("warped_blue_nether_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_BLUE_NETHER_BRICK_CRACKED_ORE_KEY = registerKey("warped_blue_nether_brick_cracked_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPEDSTONE_COBBLED_ORE_KEY = registerKey("warpedstone_cobbled_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPEDSTONE_POLISHED_CUT_BRICK_ORE_KEY = registerKey("warpedstone_polished_cut_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY = registerKey("warpedstone_polished_cut_brick_cracked_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CHARCOAL_KEY = registerKey("charcoal_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CHARCOAL_SAPLING_KEY = registerKey("charcoal_sapling_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> SOUL_SAND_LOOSE_DISK_KEY = registerKey("soul_sand_loose_disk");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_MYCELIAL_THREADS_MULTIFACE_GROWTH_KEY = registerKey("crimson_mycelial_threads_multiface_growth");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_TENDRILS_KEY = registerKey("crimson_tendrils");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //CF -> PF -> BM

        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest basaltReplaceables = new BlockMatchRuleTest(Blocks.BASALT);
        RuleTest blackstoneReplaceables = new BlockMatchRuleTest(Blocks.BLACKSTONE);
        RuleTest blackstoneLargeBrickReplaceables = new BlockMatchRuleTest(Blocks.POLISHED_BLACKSTONE_BRICKS);
        RuleTest blackstoneLargeBrickCrackedReplaceables = new BlockMatchRuleTest(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        RuleTest netherBrickReplaceables = new BlockMatchRuleTest(Blocks.NETHER_BRICKS);

        List<OreFeatureConfig.Target> smoothBasaltDeltaOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.SMOOTH_BASALT.getDefaultState()));
        List<OreFeatureConfig.Target> downDeepslateOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> downSmoothBasaltOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.SMOOTH_BASALT.getDefaultState()));
        List<OreFeatureConfig.Target> upSmoothBasaltOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.SMOOTH_BASALT.getDefaultState()));
        List<OreFeatureConfig.Target> netheriteOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.ANCIENT_DEBRIS.getDefaultState()));
        List<OreFeatureConfig.Target> downNetheriteOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.ANCIENT_DEBRIS.getDefaultState()));
        List<OreFeatureConfig.Target> netherrackOres =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, Blocks.NETHERRACK.getDefaultState()));
        List<OreFeatureConfig.Target> upDeepslateOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.DEEPSLATE.getDefaultState()));
        List<OreFeatureConfig.Target> obsidianOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.OBSIDIAN.getDefaultState()));
        List<OreFeatureConfig.Target> cryingObsidianOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.CRYING_OBSIDIAN.getDefaultState()));
        List<OreFeatureConfig.Target> gildedBlackstonenOres =
                List.of(OreFeatureConfig.createTarget(blackstoneReplaceables, Blocks.GILDED_BLACKSTONE.getDefaultState()));
        List<OreFeatureConfig.Target> magmaOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.MAGMA_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> lavaOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.LAVA.getDefaultState()));
        List<OreFeatureConfig.Target> cobblestoneOres =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, Blocks.COBBLESTONE.getDefaultState()));
        List<OreFeatureConfig.Target> andesiteOres =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, Blocks.ANDESITE.getDefaultState()));
        List<OreFeatureConfig.Target> basaltCobbledOres =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, BasaltBlocks.BASALT_COBBLED.getDefaultState()));
        List<OreFeatureConfig.Target> basaltSmoothCrackedOres =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, BasaltBlocks.BASALT_SMOOTH_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> blackstoneCobbledOres =
                List.of(OreFeatureConfig.createTarget(blackstoneReplaceables, BlackstoneBlocks.BLACKSTONE_COBBLED.getDefaultState()));
        List<OreFeatureConfig.Target> blackstoneNetheriteOres =
                List.of(OreFeatureConfig.createTarget(blackstoneReplaceables, Blocks.ANCIENT_DEBRIS.getDefaultState()));
        List<OreFeatureConfig.Target> bloodstoneCobbledOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, BloodstoneBlocks.BLOODSTONE_COBBLED.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonNetherrackOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, CrimsonBlocks.CRIMSON_NETHERRACK.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonNetherrackCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, CrimsonBlocks.CRIMSON_NETHERRACK_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> netherBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, Blocks.CRACKED_NETHER_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> netherStoneCobbledOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, NetherstoneBlocks.NETHERSTONE_COBBLED.getDefaultState()));
        List<OreFeatureConfig.Target> netherStonePolishedCutBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, NetherstoneBlocks.NETHERSTONE_POLISHED_CUT_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> netherStonePolishedCutBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, NetherstoneBlocks.NETHERSTONE_POLISHED_CUT_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonBlackstoneLargeBrickOres =
                List.of(OreFeatureConfig.createTarget(blackstoneLargeBrickReplaceables, CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonBlackstoneLargeBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(blackstoneLargeBrickCrackedReplaceables, CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonNetherBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, CrimsonBlocks.CRIMSON_NETHER_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonNetherBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, CrimsonBlocks.CRIMSON_NETHER_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> redNetherBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, Blocks.RED_NETHER_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> redNetherBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, MiscBlocks.RED_NETHER_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonRedNetherBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, CrimsonBlocks.CRIMSON_RED_NETHER_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonRedNetherBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, CrimsonBlocks.CRIMSON_RED_NETHER_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonstoneCobbledOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, CrimsonstoneBlocks.CRIMSONSTONE_COBBLED.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonstoneCutBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, CrimsonstoneBlocks.CRIMSONSTONE_POLISHED_CUT_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> crimsonstoneCutBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, CrimsonstoneBlocks.CRIMSONSTONE_POLISHED_CUT_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> warpedNetherrackOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, WarpedBlocks.WARPED_NETHERRACK.getDefaultState()));
        List<OreFeatureConfig.Target> warpedNetherrackCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, WarpedBlocks.WARPED_NETHERRACK_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> warpedBlackstoneLargeBrickOres =
                List.of(OreFeatureConfig.createTarget(blackstoneLargeBrickReplaceables, WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> warpedBlackstoneLargeBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(blackstoneLargeBrickCrackedReplaceables, WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> warpedNetherBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, WarpedBlocks.WARPED_NETHER_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> warpedNetherBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, WarpedBlocks.WARPED_NETHER_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> blueNetherBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, MiscBlocks.BLUE_NETHER_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> blueNetherBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, MiscBlocks.BLUE_NETHER_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> warpedBlueNetherBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, WarpedBlocks.WARPED_BLUE_NETHER_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> warpedBlueNetherBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, WarpedBlocks.WARPED_BLUE_NETHER_BRICKS_CRACKED.getDefaultState()));
        List<OreFeatureConfig.Target> warpedstoneCobbledOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, WarpedstoneBlocks.WARPEDSTONE_COBBLED.getDefaultState()));
        List<OreFeatureConfig.Target> warpedstoneCutBrickOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS.getDefaultState()));
        List<OreFeatureConfig.Target> warpedstoneCutBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS_CRACKED.getDefaultState()));

        register(context, SMOOTH_BASALT_DELTA_ORE_KEY, Feature.ORE, new OreFeatureConfig(smoothBasaltDeltaOres, 6));
        register(context, DOWN_DEEPSLATE_ORE_KEY, Feature.ORE, new OreFeatureConfig(downDeepslateOres, 32, 1f));
        register(context, DOWN_SMOOTH_BASALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(downSmoothBasaltOres, 24, 1f));
        register(context, UP_SMOOTH_BASALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(upSmoothBasaltOres, 16, 1f));
        register(context, NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netheriteOres, 4, 1f));
        register(context, DOWN_NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(downNetheriteOres, 1, 1f));
        register(context, NETHERRACK_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherrackOres, 64));
        register(context, UP_DEEPSLATE_ORE_KEY, Feature.ORE, new OreFeatureConfig(upDeepslateOres, 32, 1f));
        register(context, OBSIDIAN_ORE_KEY, Feature.ORE, new OreFeatureConfig(obsidianOres, 4));
        register(context, CRYING_OBSIDIAN_ORE_KEY, Feature.ORE, new OreFeatureConfig(cryingObsidianOres, 1));
        register(context, GILDED_BLACKSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(gildedBlackstonenOres, 1, 0f));
        register(context, MAGMA_ORE_KEY, Feature.ORE, new OreFeatureConfig(magmaOres, 12));
        register(context, LAVA_ORE_KEY, Feature.ORE, new OreFeatureConfig(lavaOres, 3));
        register(context, COBBLESTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(cobblestoneOres, 16, 1f));
        register(context, ANDESITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(andesiteOres, 16, 1f));
        register(context, BASALT_COBBLED_ORE_KEY, Feature.ORE, new OreFeatureConfig(basaltCobbledOres, 6));
        register(context, BASALT_SMOOTH_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(basaltSmoothCrackedOres, 6));
        register(context, BLACKSTONE_COBBLED_ORE_KEY, Feature.ORE, new OreFeatureConfig(blackstoneCobbledOres, 16, 0f));
        register(context, BLACKSTONE_NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(blackstoneNetheriteOres, 3, 1f));
        register(context, BLOODSTONE_COBBLED_ORE_KEY, Feature.ORE, new OreFeatureConfig(bloodstoneCobbledOres, 32, 0f));
        register(context, CRIMSON_NETHERRACK_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonNetherrackOres, 8, 0f));
        register(context, CRIMSON_NETHERRACK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonNetherrackCrackedOres, 8, 0f));
        register(context, CRACKED_NETHER_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherBrickCrackedOres, 32, 0f));
        register(context, NETHERSTONE_COBBLED_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherStoneCobbledOres, 32, 0f));
        register(context, NETHERSTONE_POLISHED_CUT_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherStonePolishedCutBrickOres, 32, 0f));
        register(context, NETHERSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherStonePolishedCutBrickCrackedOres, 32, 0f));
        register(context, CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonBlackstoneLargeBrickOres, 32, 0f));
        register(context, CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonBlackstoneLargeBrickCrackedOres, 32, 0f));
        register(context, CRIMSON_NETHER_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonNetherBrickOres, 32, 0f));
        register(context, CRIMSON_NETHER_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonNetherBrickCrackedOres, 32, 0f));
        register(context, RED_NETHER_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(redNetherBrickOres, 32, 0f));
        register(context, RED_NETHER_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(redNetherBrickCrackedOres, 32, 0f));
        register(context, CRIMSON_RED_NETHER_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonRedNetherBrickOres, 32, 0f));
        register(context, CRIMSON_RED_NETHER_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonRedNetherBrickCrackedOres, 32, 0f));
        register(context, CRIMSONSTONE_COBBLED_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonstoneCobbledOres, 32, 0f));
        register(context, CRIMSONSTONE_POLISHED_CUT_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonstoneCutBrickOres, 32, 0f));
        register(context, CRIMSONSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(crimsonstoneCutBrickCrackedOres, 32, 0f));
        register(context, WARPED_NETHERRACK_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedNetherrackOres, 8, 0f));
        register(context, WARPED_NETHERRACK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedNetherrackCrackedOres, 8, 0f));
        register(context, WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedBlackstoneLargeBrickOres, 32, 0f));
        register(context, WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedBlackstoneLargeBrickCrackedOres, 32, 0f));
        register(context, WARPED_NETHER_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedNetherBrickOres, 32, 0f));
        register(context, WARPED_NETHER_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedNetherBrickCrackedOres, 32, 0f));
        register(context, BLUE_NETHER_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(blueNetherBrickOres, 32, 0f));
        register(context, BLUE_NETHER_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(blueNetherBrickCrackedOres, 32, 0f));
        register(context, WARPED_BLUE_NETHER_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedBlueNetherBrickOres, 32, 0f));
        register(context, WARPED_BLUE_NETHER_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedBlueNetherBrickCrackedOres, 32, 0f));
        register(context, WARPEDSTONE_COBBLED_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedstoneCobbledOres, 32, 0f));
        register(context, WARPEDSTONE_POLISHED_CUT_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedstoneCutBrickOres, 32, 0f));
        register(context, WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY, Feature.ORE, new OreFeatureConfig(warpedstoneCutBrickCrackedOres, 32, 0f));

        register(context, CHARCOAL_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MiscBlocks.CHARCOAL_LOG),
                new LargeOakTrunkPlacer(5, 6,3),
                BlockStateProvider.of(Blocks.AIR),
                new BlobFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1), 3),
                new TwoLayersFeatureSize(1,0,2)).dirtProvider(BlockStateProvider.of(Blocks.SOUL_SOIL)).build());

        register(context, CHARCOAL_SAPLING_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(MiscBlocks.CHARCOAL_SAPLING.getDefaultState())),
                        List.of(Blocks.SOUL_SOIL, Blocks.SOUL_SAND)
                )
        );

        register(context, SOUL_SAND_LOOSE_DISK_KEY, Feature.DISK, new DiskFeatureConfig(
                PredicatedStateProvider.of(SoulSandstoneBlocks.SOUL_SAND_LOOSE),
                BlockPredicate.matchingBlocks(List.of(Blocks.SOUL_SAND, Blocks.SOUL_SOIL)),
                UniformIntProvider.create(2, 3), 2
        ));

        register(context, CRIMSON_MYCELIAL_THREADS_MULTIFACE_GROWTH_KEY, Feature.MULTIFACE_GROWTH, new MultifaceGrowthFeatureConfig(
                (MultifaceGrowthBlock) CrimsonBlocks.CRIMSON_MYCELIAL_THREADS,
                20,
                true,
                true,
                true,
                1F,
                RegistryEntryList.of(
                        Block::getRegistryEntry,
                        Blocks.NETHERRACK,
                        Blocks.NETHER_WART_BLOCK,
                        Blocks.CRIMSON_NYLIUM,
                        Blocks.CRIMSON_STEM,
                        Blocks.NETHER_BRICKS,
                        Blocks.CRACKED_NETHER_BRICKS,
                        Blocks.BLACKSTONE,
                        Blocks.POLISHED_BLACKSTONE_BRICKS,
                        Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                        BlackstoneBlocks.BLACKSTONE_COBBLED,
                        Blocks.BASALT,
                        Blocks.POLISHED_BASALT,
                        CrimsonBlocks.CRIMSON_NETHERRACK,
                        CrimsonBlocks.CRIMSON_NETHERRACK_CRACKED,
                        CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICKS,
                        CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICKS_CRACKED,
                        CrimsonBlocks.CRIMSON_NETHER_BRICKS,
                        CrimsonBlocks.CRIMSON_NETHER_BRICKS_CRACKED,
                        NetherstoneBlocks.NETHERSTONE_COBBLED,
                        Blocks.RED_NETHER_BRICKS,
                        MiscBlocks.RED_NETHER_BRICKS_CRACKED,
                        CrimsonBlocks.CRIMSON_RED_NETHER_BRICKS,
                        CrimsonBlocks.CRIMSON_RED_NETHER_BRICKS_CRACKED,
                        CrimsonstoneBlocks.CRIMSONSTONE_COBBLED
                )
        ));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreNetherBlocks.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                    RegistryKey<ConfiguredFeature<?, ?>> key, F Feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(Feature, configuration));
    }
}
