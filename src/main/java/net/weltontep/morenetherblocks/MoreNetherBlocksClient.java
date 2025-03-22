package net.weltontep.morenetherblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.weltontep.morenetherblocks.block.CrimsonBlocks;
import net.weltontep.morenetherblocks.block.GlowstoneBlocks;
import net.weltontep.morenetherblocks.block.MiscBlocks;
import net.weltontep.morenetherblocks.block.ObsidianBlocks;

public class MoreNetherBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GlowstoneBlocks.GLOWSTONE_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ObsidianBlocks.OBSIDIAN_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MiscBlocks.CHARCOAL_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MiscBlocks.SULPHUR_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CrimsonBlocks.CRIMSON_MYCELIAL_THREADS, RenderLayer.getCutout());
    }
}
