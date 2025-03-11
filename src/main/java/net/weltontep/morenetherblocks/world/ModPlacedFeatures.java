package net.weltontep.morenetherblocks.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.weltontep.morenetherblocks.MoreNetherBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SMOOTH_BASALT_DELTA_ORE_PLACED_KEY = registryKey("smooth_basalt_delta_ore_placed");
    public static final RegistryKey<PlacedFeature> DOWN_DEEPSLATE_ORE_PLACED_KEY = registryKey("down_deepslate_ore_placed");
    public static final RegistryKey<PlacedFeature> DOWN_SMOOTH_BASALT_ORE_PLACED_KEY = registryKey("down_smooth_basalt_ore_placed");
    public static final RegistryKey<PlacedFeature> UP_SMOOTH_BASALT_ORE_PLACED_KEY = registryKey("up_smooth_basalt_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERITE_ORE_PLACED_KEY = registryKey("netherite_ore_placed");
    public static final RegistryKey<PlacedFeature> DOWN_NETHERITE_ORE_PLACED_KEY = registryKey("down_netherite_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_ORE_PLACED_KEY = registryKey("netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> UP_DEEPSLATE_ORE_PLACED_KEY = registryKey("up_deepslate_ore_placed");
    public static final RegistryKey<PlacedFeature> OBSIDIAN_ORE_PLACED_KEY = registryKey("obsidian_ore_placed");
    public static final RegistryKey<PlacedFeature> CRYING_OBSIDIAN_ORE_PLACED_KEY = registryKey("crying_ore_placed");
    public static final RegistryKey<PlacedFeature> GILDED_BLACKSTONE_ORE_PLACED_KEY = registryKey("gilded_blackstone_ore_placed");
    public static final RegistryKey<PlacedFeature> MAGMA_ORE_PLACED_KEY = registryKey("magma_ore_placed");
    public static final RegistryKey<PlacedFeature> LAVA_ORE_PLACED_KEY = registryKey("lava_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_ORE_PLACED_KEY = registryKey("cobblestone_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_ORE_PLACED_KEY = registryKey("andesite_ore_placed");
    public static final RegistryKey<PlacedFeature> BASALT_COBBLED_ORE_PLACED_KEY = registryKey("basalt_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> BASALT_SMOOTH_CRACKED_ORE_PLACED_KEY = registryKey("basalt_smooth_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> BLACKSTONE_COBBLED_ORE_PLACED_KEY = registryKey("blackstone_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> BLACKSTONE_NETHERITE_ORE_PLACED_KEY = registryKey("blackstone_netherite_ore_placed");
    public static final RegistryKey<PlacedFeature> BLOODSTONE_COBBLED_ORE_PLACED_KEY = registryKey("bloodstone_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> CRACKED_NETHER_BRICK_ORE_PLACED_KEY = registryKey("cracked_nether_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> CRACKED_NETHER_BRICK_ORE_PLACED_KEY2 = registryKey("cracked_nether_brick_ore_placed2");
    public static final RegistryKey<PlacedFeature> CRACKED_NETHER_BRICK_ORE_PLACED_KEY3 = registryKey("cracked_nether_brick_ore_placed3");
    public static final RegistryKey<PlacedFeature> CRACKED_NETHER_BRICK_ORE_PLACED_KEY4 = registryKey("cracked_nether_brick_ore_placed4");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SMOOTH_BASALT_DELTA_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMOOTH_BASALT_DELTA_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, DOWN_DEEPSLATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOWN_DEEPSLATE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(7)))
        );

        register(context, DOWN_SMOOTH_BASALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOWN_SMOOTH_BASALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(16)))
        );

        register(context, UP_SMOOTH_BASALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.UP_SMOOTH_BASALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(111), YOffset.fixed(127)))
        );

        register(context, NETHERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(128)))
        );

        register(context, DOWN_NETHERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOWN_NETHERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(32)))
        );

        register(context, NETHERRACK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERRACK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, UP_DEEPSLATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.UP_DEEPSLATE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(48,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(119), YOffset.fixed(127)))
        );

        register(context, OBSIDIAN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OBSIDIAN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(15)))
        );

        register(context, CRYING_OBSIDIAN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRYING_OBSIDIAN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, GILDED_BLACKSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GILDED_BLACKSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(128,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(128)))
        );

        register(context, MAGMA_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGMA_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, LAVA_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LAVA_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, COBBLESTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COBBLESTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, ANDESITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANDESITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, BASALT_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BASALT_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, BASALT_SMOOTH_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BASALT_SMOOTH_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, BLACKSTONE_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACKSTONE_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );
        register(context, BLACKSTONE_NETHERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACKSTONE_NETHERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );
        register(context, BLOODSTONE_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLOODSTONE_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(31)))
        );
        register(context, CRACKED_NETHER_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRACKED_NETHER_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );
        register(context, CRACKED_NETHER_BRICK_ORE_PLACED_KEY2, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRACKED_NETHER_BRICK_ORE_KEY2),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );
        register(context, CRACKED_NETHER_BRICK_ORE_PLACED_KEY3, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRACKED_NETHER_BRICK_ORE_KEY3),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );
        register(context, CRACKED_NETHER_BRICK_ORE_PLACED_KEY4, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRACKED_NETHER_BRICK_ORE_KEY4),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );
    }

    public static RegistryKey<PlacedFeature> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MoreNetherBlocks.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
