package net.weltontep.morenetherblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.weltontep.morenetherblocks.block.GlowstoneBlocks;
import net.weltontep.morenetherblocks.block.MiscBlocks;

public class MoreNetherBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GlowstoneBlocks.GLOWSTONE_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MiscBlocks.CHARCOAL_SAPLING, RenderLayer.getCutout());
    }
}
