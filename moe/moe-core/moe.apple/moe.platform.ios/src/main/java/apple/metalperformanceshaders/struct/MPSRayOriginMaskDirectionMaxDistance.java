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
public final class MPSRayOriginMaskDirectionMaxDistance extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSRayOriginMaskDirectionMaxDistance() {
        super(MPSRayOriginMaskDirectionMaxDistance.class);
    }

    @Generated
    protected MPSRayOriginMaskDirectionMaxDistance(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSRayOriginMaskDirectionMaxDistance(@ByValue MPSPackedFloat3 origin, int mask,
            @ByValue MPSPackedFloat3 direction, float maxDistance) {
        super(MPSRayOriginMaskDirectionMaxDistance.class);
        setOrigin(origin);
        setMask(mask);
        setDirection(direction);
        setMaxDistance(maxDistance);
    }

    /**
     * @brief Ray origin. The intersection test will be skipped if the origin contains NaNs
     * or infinities.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MPSPackedFloat3 origin();

    /**
     * @brief Ray origin. The intersection test will be skipped if the origin contains NaNs
     * or infinities.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOrigin(@ByValue MPSPackedFloat3 value);

    /**
     * @brief Ray mask which is bitwise AND-ed with instance and primitive masks to filter out
     * intersections. The intersection test will be skipped if the mask is zero.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mask();

    /**
     * @brief Ray mask which is bitwise AND-ed with instance and primitive masks to filter out
     * intersections. The intersection test will be skipped if the mask is zero.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMask(int value);

    /**
     * @brief Ray direction. Does not need to be normalized. The intersection test will be
     * skipped if the direction has length zero or contains NaNs or infinities.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native MPSPackedFloat3 direction();

    /**
     * @brief Ray direction. Does not need to be normalized. The intersection test will be
     * skipped if the direction has length zero or contains NaNs or infinities.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDirection(@ByValue MPSPackedFloat3 value);

    /**
     * @brief Maximum intersection distance from the origin along the ray direction. May be
     * infinite. The intersection test will be skipped if the maximum distance is less than
     * zero or NaN.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float maxDistance();

    /**
     * @brief Maximum intersection distance from the origin along the ray direction. May be
     * infinite. The intersection test will be skipped if the maximum distance is less than
     * zero or NaN.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMaxDistance(float value);
}