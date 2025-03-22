package net.weltontep.morenetherblocks;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.weltontep.morenetherblocks.datagen.ModBlockTagAtoMProvider;
import net.weltontep.morenetherblocks.datagen.ModBlockTagNtoZProvider;
import net.weltontep.morenetherblocks.datagen.ModWallsBlockTagProvider;
import net.weltontep.morenetherblocks.datagen.ModMiscBlockTagProvider;
import net.weltontep.morenetherblocks.datagen.ModItemTagProvider;
import net.weltontep.morenetherblocks.world.ModConfiguredFeatures;
import net.weltontep.morenetherblocks.world.ModPlacedFeatures;
import net.weltontep.morenetherblocks.datagen.ModRegistryDataGenerator;

public class MoreNetherBlocksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModBlockTagAtoMProvider::new);
		pack.addProvider(ModBlockTagNtoZProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
		pack.addProvider(ModWallsBlockTagProvider::new);
		pack.addProvider(ModMiscBlockTagProvider::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);

	}
}
