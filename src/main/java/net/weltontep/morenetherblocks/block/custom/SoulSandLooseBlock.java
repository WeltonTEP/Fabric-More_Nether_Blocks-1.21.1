package net.weltontep.morenetherblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.LandingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SoulSandLooseBlock extends FallingBlock implements LandingBlock {
    public SoulSandLooseBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends FallingBlock> getCodec() {
        return null;
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        Vec3d vec3d = new Vec3d(0.25, 0.05F, 0.25);
        if (entity instanceof LivingEntity livingEntity && livingEntity.hasStatusEffect(StatusEffects.WEAVING)) {
            vec3d = new Vec3d(0.5, 0.25, 0.5);
        }

        entity.slowMovement(state, vec3d);
    }
}
