package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSRayOriginMinDistanceDirectionMaxDistance extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSRayOriginMinDistanceDirectionMaxDistance() {
        super(MPSRayOriginMinDistanceDirectionMaxDistance.class);
    }

    @Generated
    protected MPSRayOriginMinDistanceDirectionMaxDistance(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSRayOriginMinDistanceDirectionMaxDistance(@ByValue MPSPackedFloat3 origin, float minDistance,
            @ByValue MPSPackedFloat3 direction, float maxDistance) {
        super(MPSRayOriginMinDistanceDirectionMaxDistance.class);
        setOrigin(origin);
        setMinDistance(minDistance);
        setDirection(direction);
        setMaxDistance(maxDistance);
    }

    /**
     * Ray origin. The intersection test will be skipped if the origin contains NaNs
     * or infinities.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MPSPackedFloat3 origin();

    /**
     * Ray origin. The intersection test will be skipped if the origin contains NaNs
     * or infinities.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOrigin(@ByValue MPSPackedFloat3 value);

    /**
     * Minimum intersection distance from the origin along the ray direction. The
     * intersection test will be skipped if the minimum distance is equal to positive
     * infinity or NaN.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float minDistance();

    /**
     * Minimum intersection distance from the origin along the ray direction. The
     * intersection test will be skipped if the minimum distance is equal to positive
     * infinity or NaN.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMinDistance(float value);

    /**
     * Ray direction. Does not need to be normalized. The intersection test will be
     * skipped if the direction has length zero or contains NaNs or infinities.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native MPSPackedFloat3 direction();

    /**
     * Ray direction. Does not need to be normalized. The intersection test will be
     * skipped if the direction has length zero or contains NaNs or infinities.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDirection(@ByValue MPSPackedFloat3 value);

    /**
     * Maximum intersection distance from the origin along the ray direction. May be
     * infinite. The intersection test will be skipped if the maximum distance is less than
     * zero, NaN, or less than the minimum intersection distance.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float maxDistance();

    /**
     * Maximum intersection distance from the origin along the ray direction. May be
     * infinite. The intersection test will be skipped if the maximum distance is less than
     * zero, NaN, or less than the minimum intersection distance.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMaxDistance(float value);
}