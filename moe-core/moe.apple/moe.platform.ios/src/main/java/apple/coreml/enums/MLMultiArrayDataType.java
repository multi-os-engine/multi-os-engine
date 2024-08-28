package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Allowed data types for multidimensional arrays
 * 
 * API-Since: 11.0
 */
@Generated
public final class MLMultiArrayDataType {
    @Generated
    private MLMultiArrayDataType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Double = 0x0000000000010040L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Float32 = 0x0000000000010020L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Int32 = 0x0000000000020020L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Float64 = 0x0000000000010040L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Float = 0x0000000000010020L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Float16 = 0x0000000000010010L;
}