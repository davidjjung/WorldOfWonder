package earth.terrarium.worldofwonder.common.tileentity;

import earth.terrarium.worldofwonder.init.WonderTileEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WonderHangingSignBlockEntity extends HangingSignBlockEntity {

	public WonderHangingSignBlockEntity(BlockPos p_250603_, BlockState p_251674_) {
		super(p_250603_, p_251674_);
	}
	
	@Override
    public BlockEntityType<?> getType() {
        return WonderTileEntities.HANGING_SIGN.get();
    }

}
