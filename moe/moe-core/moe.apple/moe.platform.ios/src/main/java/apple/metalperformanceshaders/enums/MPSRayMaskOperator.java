package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @brief Options for the MPSRayIntersector ray mask operator property
 */
@Generated
public final class MPSRayMaskOperator {
    @Generated
    private MPSRayMaskOperator() {
    }

    /**
     * @brief Accept the intersection if (primitive mask & ray mask) != 0.
     */
    @Generated @NUInt public static final long And = 0x0000000000000000L;
    /**
     * @brief Accept the intersection if ~(primitive mask & ray mask) != 0.
     */
    @Generated @NUInt public static final long NotAnd = 0x0000000000000001L;
    /**
     * @brief Accept the intersection if (primitive mask | ray mask) != 0.
     */
    @Generated @NUInt public static final long Or = 0x0000000000000002L;
    /**
     * @brief Accept the intersection if ~(primitive mask | ray mask) != 0.
     */
    @Generated @NUInt public static final long NotOr = 0x0000000000000003L;
    /**
     * @brief Accept the intersection if (primitive mask ^ ray mask) != 0.
     */
    @Generated @NUInt public static final long Xor = 0x0000000000000004L;
    /**
     * @brief Accept the intersection if ~(primitive mask ^ ray mask) != 0.
     */
    @Generated @NUInt public static final long NotXor = 0x0000000000000005L;
    /**
     * @brief Accept the intersection if primitive mask < ray mask.
     */
    @Generated @NUInt public static final long LessThan = 0x0000000000000006L;
    /**
     * @brief Accept the intersection if primitive mask <= ray mask.
     */
    @Generated @NUInt public static final long LessThanOrEqualTo = 0x0000000000000007L;
    /**
     * @brief Accept the intersection if primitive mask > ray mask.
     */
    @Generated @NUInt public static final long GreaterThan = 0x0000000000000008L;
    /**
     * @brief Accept the intersection if primitive mask >= ray mask.
     */
    @Generated @NUInt public static final long GreaterThanOrEqualTo = 0x0000000000000009L;
    /**
     * @brief Accept the intersection if primitive mask == ray mask.
     */
    @Generated @NUInt public static final long Equal = 0x000000000000000AL;
    /**
     * @brief Accept the intersection if primitive mask != ray mask.
     */
    @Generated @NUInt public static final long NotEqual = 0x000000000000000BL;
}