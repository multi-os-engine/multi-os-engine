package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSIntersectionDistance extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSIntersectionDistance() {
        super(MPSIntersectionDistance.class);
    }

    @Generated
    protected MPSIntersectionDistance(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSIntersectionDistance(float distance) {
        super(MPSIntersectionDistance.class);
        setDistance(distance);
    }

    /**
     * Distance from the ray origin to the intersection point along the ray direction
     * vector such that intersection = ray.origin + ray.direction * distance. Is negative if
     * there is no intersection. If the intersection type is MPSIntersectionTypeAny, is
     * a positive value for a hit or a negative value for a miss.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float distance();

    /**
     * Distance from the ray origin to the intersection point along the ray direction
     * vector such that intersection = ray.origin + ray.direction * distance. Is negative if
     * there is no intersection. If the intersection type is MPSIntersectionTypeAny, is
     * a positive value for a hit or a negative value for a miss.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDistance(float value);
}