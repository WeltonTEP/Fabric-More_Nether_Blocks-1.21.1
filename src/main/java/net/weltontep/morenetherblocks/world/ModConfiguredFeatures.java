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

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERITE_ORE_KEY = registerKey("netherite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_ORE_KEY = registerKey("netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DOWN_DEEPSLATE_ORE_KEY = registerKey("down_deepslate_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> UP_DEEPSLATE_ORE_KEY = registerKey("up_deepslate_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //CF -> PF -> BM

        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest basaltReplaceables = new BlockMatchRuleTest(Blocks.BASALT);
        RuleTest downdeepslateReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest updeepslateReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        List<OreFeatureConfig.Target> netheriteOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, Blocks.ANCIENT_DEBRIS.getDefaultState()));
        List<OreFeatureConfig.Target> netherrackOres =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, Blocks.NETHERRACK.getDefaultState()));
        List<OreFeatureConfig.Target> downdeepslateOres =
                List.of(OreFeatureConfig.createTarget(downdeepslateReplaceables, Blocks.WATER.getDefaultState()));
        List<OreFeatureConfig.Target> updeepslateOres =
                List.of(OreFeatureConfig.createTarget(updeepslateReplaceables, Blocks.WATER.getDefaultState()));

        register(context, NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netheriteOres, 4));
        register(context, NETHERRACK_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherrackOres, 64));
        register(context, DOWN_DEEPSLATE_ORE_KEY, Feature.ORE, new OreFeatureConfig(downdeepslateOres, 16));
        register(context, UP_DEEPSLATE_ORE_KEY, Feature.ORE, new OreFeatureConfig(updeepslateOres, 16));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreNetherBlocks.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                    RegistryKey<ConfiguredFeature<?, ?>> key, F Feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(Feature, configuration));
    }
}
