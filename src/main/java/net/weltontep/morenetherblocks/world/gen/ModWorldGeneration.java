package net.weltontep.morenetherblocks.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
        ModVegetationGeneration.generateVegetation();
        ModDiskGeneration.generateDisks();
    }
}
