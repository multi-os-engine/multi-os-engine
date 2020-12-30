package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @enum MTLSparseTextureMappingMode
 * @abstract Type of mapping operation for sparse texture
 */
@Generated
public final class MTLSparseTextureMappingMode {
    @Generated
    private MTLSparseTextureMappingMode() {
    }

    @Generated @NUInt public static final long Map = 0x0000000000000000L;
    @Generated @NUInt public static final long Unmap = 0x0000000000000001L;
}