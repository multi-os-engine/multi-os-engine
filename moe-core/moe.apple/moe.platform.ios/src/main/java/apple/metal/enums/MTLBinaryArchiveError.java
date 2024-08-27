package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class MTLBinaryArchiveError {
    @Generated
    private MTLBinaryArchiveError() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long InvalidFile = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long UnexpectedElement = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long CompilationFailure = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long InternalError = 0x0000000000000004L;
}