package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for the MPSRayIntersector bounding box intersection test type property
 */
@Generated
public final class MPSBoundingBoxIntersectionTestType {
    @Generated
    private MPSBoundingBoxIntersectionTestType() {
    }

    /**
     * Use the default MPSBoundingBoxIntersectionTestTypeAxisAligned ray/bounding box
     * intersection test.
     * 
     * Note: this option was equivalent to MPSBoundingBoxIntersectionTestTypeFast in
     * macOS 10.14/iOS 12.0. This option was changed in macOS 10.15/iOS 13.0 to handle axis-aligned
     * rays correctly by default. The old behavior can be restored by explicitly setting the
     * intersection test type to MPSBoundingBoxIntersectionTestTypeFast on macOS 10.15/iOS 13.0
     * and above.
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * This intersection test is potentially slower than
     * MPSBoundingBoxIntersectionTestTypeFast but does not generate false negatives for
     * axis aligned rays (i.e. rays which have one or more components of their direction set to
     * zero). These rays often do not come up in practice due to perspective projections and
     * randomized ray distributions. However, synthetic ray distributions or orthographic
     * projections can generate these rays. It may be faster to slightly perturb the ray
     * direction and use the fast intersection test type.
     */
    @Generated @NUInt public static final long AxisAligned = 0x0000000000000001L;
    /**
     * This intersection test is potentially faster than
     * MPSBoundingBoxIntersectionTestTypeAxisAligned but can generate false negatives for
     * axis aligned rays (i.e. rays which have one or more components of their direction set to
     * zero). These rays often do not come up in practice due to perspective projections and
     * randomized ray distributions. However, synthetic ray distributions or orthographic
     * projections can generate these rays.
     */
    @Generated @NUInt public static final long Fast = 0x0000000000000002L;
}