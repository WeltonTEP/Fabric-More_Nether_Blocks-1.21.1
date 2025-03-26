package net.weltontep.morenetherblocks.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class TallHangingPlantBlock extends Block {
    public static final EnumProperty<DoubleBlockHalf> HALF = Properties.DOUBLE_BLOCK_HALF;
    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);

    public TallHangingPlantBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.UPPER));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HALF);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World world = ctx.getWorld();
        BlockPos abovePos = blockPos.up();
        BlockState aboveState = world.getBlockState(abovePos);
        BlockPos belowPos = blockPos.down();

        if (aboveState.isSideSolidFullSquare(world, abovePos, Direction.DOWN) && world.getBlockState(belowPos).isAir()) {
            world.setBlockState(belowPos, this.getDefaultState().with(HALF, DoubleBlockHalf.LOWER), 3);
            return this.getDefaultState().with(HALF, DoubleBlockHalf.UPPER);
        }
        return null;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            if (state.get(HALF) == DoubleBlockHalf.UPPER) {
                world.removeBlock(pos.down(), false);
            } else {
                world.removeBlock(pos.up(), false);
            }
        }
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (state.get(HALF) == DoubleBlockHalf.UPPER) {
            BlockPos abovePos = pos.up();
            return world.getBlockState(abovePos).isSideSolidFullSquare(world, abovePos, Direction.DOWN);
        }
        return world.getBlockState(pos.up()).isOf(this);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        DoubleBlockHalf half = state.get(HALF);

        if (half == DoubleBlockHalf.UPPER && world.getBlockState(pos.down()).isOf(this)) {
            return state;
        } else if (half == DoubleBlockHalf.LOWER && world.getBlockState(pos.up()).isOf(this)) {
            return state;
        }
        return Blocks.AIR.getDefaultState();
    }
}
