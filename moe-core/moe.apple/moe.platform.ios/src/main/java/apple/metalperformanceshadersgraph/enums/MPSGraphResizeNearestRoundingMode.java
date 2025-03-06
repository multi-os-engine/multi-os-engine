package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The rounding mode to use when using nearest resize mode.
 */
@Generated
public final class MPSGraphResizeNearestRoundingMode {
    @Generated
    private MPSGraphResizeNearestRoundingMode() {
    }

    /**
     * Rounds values to the nearest integer value, with 0.5f offset rounding toward +inf.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long RoundPreferCeil = 0x0000000000000000L;
    /**
     * Rounds values to the nearest integer value, with 0.5f rounding toward -inf.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long RoundPreferFloor = 0x0000000000000001L;
    /**
     * Rounds values toward +inf.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Ceil = 0x0000000000000002L;
    /**
     * Rounds values toward -inf.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Floor = 0x0000000000000003L;
    /**
     * Rounds values to the nearest integer value, with 0.5f rounding toward the closest even value.
     * 
     * API-Since: 16.3
     */
    @Generated @NUInt public static final long RoundToEven = 0x0000000000000004L;
    /**
     * Rounds values to the nearest integer value, with 0.5f rounding toward the closest odd value.
     * 
     * API-Since: 16.3
     */
    @Generated @NUInt public static final long RoundToOdd = 0x0000000000000005L;
}