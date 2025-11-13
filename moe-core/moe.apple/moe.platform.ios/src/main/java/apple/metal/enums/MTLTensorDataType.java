package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The possible data types for the elements of a tensor.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTLTensorDataType {
    @Generated
    private MTLTensorDataType() {
    }

    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Float32 = 0x0000000000000003L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Float16 = 0x0000000000000010L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long BFloat16 = 0x0000000000000079L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Int8 = 0x000000000000002DL;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long UInt8 = 0x0000000000000031L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Int16 = 0x0000000000000025L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long UInt16 = 0x0000000000000029L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Int32 = 0x000000000000001DL;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long UInt32 = 0x0000000000000021L;
}