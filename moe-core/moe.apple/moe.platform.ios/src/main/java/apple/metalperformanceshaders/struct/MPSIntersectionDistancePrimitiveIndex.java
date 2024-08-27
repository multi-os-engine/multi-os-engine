package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSIntersectionDistancePrimitiveIndex extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSIntersectionDistancePrimitiveIndex() {
        super(MPSIntersectionDistancePrimitiveIndex.class);
    }

    @Generated
    protected MPSIntersectionDistancePrimitiveIndex(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSIntersectionDistancePrimitiveIndex(float distance, int primitiveIndex) {
        super(MPSIntersectionDistancePrimitiveIndex.class);
        setDistance(distance);
        setPrimitiveIndex(primitiveIndex);
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

    /**
     * Index of the intersected primitive. Undefined if the ray does not intersect
     * a primitive or if the intersection type is MPSIntersectionTypeAny.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int primitiveIndex();

    /**
     * Index of the intersected primitive. Undefined if the ray does not intersect
     * a primitive or if the intersection type is MPSIntersectionTypeAny.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPrimitiveIndex(int value);
}