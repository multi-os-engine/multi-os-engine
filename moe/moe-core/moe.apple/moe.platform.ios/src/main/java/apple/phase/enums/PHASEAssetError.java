package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASEAssetError
 * 
 * Asset error
 */
@Generated
public final class PHASEAssetError {
    @Generated
    private PHASEAssetError() {
    }

    @Generated @NInt public static final long FailedToLoad = 0x0000000050486161L;
    @Generated @NInt public static final long InvalidEngineInstance = 0x0000000050486162L;
    @Generated @NInt public static final long BadParameters = 0x0000000050486163L;
    @Generated @NInt public static final long AlreadyExists = 0x0000000050486164L;
    @Generated @NInt public static final long GeneralError = 0x0000000050486165L;
    @Generated @NInt public static final long MemoryAllocation = 0x0000000050486166L;
}
