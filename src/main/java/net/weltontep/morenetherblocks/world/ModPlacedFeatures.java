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
    public static final RegistryKey<PlacedFeature> NETHERITE_ORE_PLACED_KEY = registryKey("netherite_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_ORE_PLACED_KEY = registryKey("netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> DOWN_DEEPSLATE_ORE_PLACED_KEY = registryKey("down_deepslate_ore_placed");
    public static final RegistryKey<PlacedFeature> UP_DEEPSLATE_ORE_PLACED_KEY = registryKey("up_deepslate_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, NETHERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(128)))
        );

        register(context, NETHERRACK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERRACK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(32)))
        );

        register(context, DOWN_DEEPSLATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOWN_DEEPSLATE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(8)))
        );

        register(context, UP_DEEPSLATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.UP_DEEPSLATE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(127), YOffset.fixed(120)))
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
