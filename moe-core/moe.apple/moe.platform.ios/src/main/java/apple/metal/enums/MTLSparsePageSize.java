package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MTLSparsePageSize
 * 
 * Physical size of sparse resource page in KBs.
 * 
 * API-Since: 16.0
 */
@Generated
public final class MTLSparsePageSize {
    @Generated
    private MTLSparsePageSize() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Size16 = 0x0000000000000065L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Size64 = 0x0000000000000066L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Size256 = 0x0000000000000067L;
}