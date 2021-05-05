package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the target of a ray used for raycasting.
 */
@Generated
public final class ARRaycastTarget {
    @Generated
    private ARRaycastTarget() {
    }

    /**
     * Ray's target is an already detected plane, considering the plane's estimated size and shape.
     */
    @Generated @NInt public static final long ExistingPlaneGeometry = 0x0000000000000000L;
    /**
     * Ray's target is an already detected plane, without considering the plane's size.
     */
    @Generated @NInt public static final long ExistingPlaneInfinite = 0x0000000000000001L;
    /**
     * Ray's target is a plane that is estimated using the feature points around the ray.
     * When alignment is ARRaycastTargetAlignmentAny, alignment of estimated planes is based on the normal of the real world
     * surface corresponding to the estimated plane.
     */
    @Generated @NInt public static final long EstimatedPlane = 0x0000000000000002L;
}