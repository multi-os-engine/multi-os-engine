package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for the MPSRayIntersector ray mask operator property
 * 
 * API-Since: 13.0
 * Deprecated-Since: 17.0
 */
@Deprecated
@Generated
public final class MPSRayMaskOperator {
    @Generated
    private MPSRayMaskOperator() {
    }

    /**
     * Accept the intersection if (primitive mask & ray mask) != 0.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long And = 0x0000000000000000L;
    /**
     * Accept the intersection if ~(primitive mask & ray mask) != 0.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long NotAnd = 0x0000000000000001L;
    /**
     * Accept the intersection if (primitive mask | ray mask) != 0.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long Or = 0x0000000000000002L;
    /**
     * Accept the intersection if ~(primitive mask | ray mask) != 0.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long NotOr = 0x0000000000000003L;
    /**
     * Accept the intersection if (primitive mask ^ ray mask) != 0.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long Xor = 0x0000000000000004L;
    /**
     * Accept the intersection if ~(primitive mask ^ ray mask) != 0.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long NotXor = 0x0000000000000005L;
    /**
     * Accept the intersection if primitive mask < ray mask.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long LessThan = 0x0000000000000006L;
    /**
     * Accept the intersection if primitive mask <= ray mask.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long LessThanOrEqualTo = 0x0000000000000007L;
    /**
     * Accept the intersection if primitive mask > ray mask.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long GreaterThan = 0x0000000000000008L;
    /**
     * Accept the intersection if primitive mask >= ray mask.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long GreaterThanOrEqualTo = 0x0000000000000009L;
    /**
     * Accept the intersection if primitive mask == ray mask.
     * 
     * API-Since: 13.4
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long Equal = 0x000000000000000AL;
    /**
     * Accept the intersection if primitive mask != ray mask.
     * 
     * API-Since: 13.4
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long NotEqual = 0x000000000000000BL;
}