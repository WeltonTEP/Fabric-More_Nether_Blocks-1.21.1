package net.weltontep.morenetherblocks.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.weltontep.morenetherblocks.MoreNetherBlocks;
import net.weltontep.morenetherblocks.block.BasaltBlocks;
import net.weltontep.morenetherblocks.block.BlackstoneBlocks;
import net.weltontep.morenetherblocks.block.BloodstoneBlocks;

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
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRACKED_NETHER_BRICK_ORE_KEY = registerKey("cracked_nether_brick_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRACKED_NETHER_BRICK_ORE_KEY2 = registerKey("cracked_nether_brick_ore2");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRACKED_NETHER_BRICK_ORE_KEY3 = registerKey("cracked_nether_brick_ore3");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRACKED_NETHER_BRICK_ORE_KEY4 = registerKey("cracked_nether_brick_ore4");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //CF -> PF -> BM

        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest basaltReplaceables = new BlockMatchRuleTest(Blocks.BASALT);
        RuleTest blackstoneReplaceables = new BlockMatchRuleTest(Blocks.BLACKSTONE);
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
        List<OreFeatureConfig.Target> netherBrickCrackedOres =
                List.of(OreFeatureConfig.createTarget(netherBrickReplaceables, Blocks.CRACKED_NETHER_BRICKS.getDefaultState()));


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
        register(context, CRACKED_NETHER_BRICK_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherBrickCrackedOres, 32, 0f));
        register(context, CRACKED_NETHER_BRICK_ORE_KEY2, Feature.ORE, new OreFeatureConfig(netherBrickCrackedOres, 32, 0f));
        register(context, CRACKED_NETHER_BRICK_ORE_KEY3, Feature.ORE, new OreFeatureConfig(netherBrickCrackedOres, 32, 0f));
        register(context, CRACKED_NETHER_BRICK_ORE_KEY4, Feature.ORE, new OreFeatureConfig(netherBrickCrackedOres, 32, 0f));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreNetherBlocks.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                    RegistryKey<ConfiguredFeature<?, ?>> key, F Feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(Feature, configuration));
    }
}
