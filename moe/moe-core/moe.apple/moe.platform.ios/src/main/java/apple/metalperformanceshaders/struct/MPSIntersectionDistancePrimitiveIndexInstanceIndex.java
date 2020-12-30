package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSIntersectionDistancePrimitiveIndexInstanceIndex extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSIntersectionDistancePrimitiveIndexInstanceIndex() {
        super(MPSIntersectionDistancePrimitiveIndexInstanceIndex.class);
    }

    @Generated
    protected MPSIntersectionDistancePrimitiveIndexInstanceIndex(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSIntersectionDistancePrimitiveIndexInstanceIndex(float distance, int primitiveIndex, int instanceIndex) {
        super(MPSIntersectionDistancePrimitiveIndexInstanceIndex.class);
        setDistance(distance);
        setPrimitiveIndex(primitiveIndex);
        setInstanceIndex(instanceIndex);
    }

    /**
     * @brief Distance from the ray origin to the intersection point along the ray direction
     * vector such that intersection = ray.origin + ray.direction * distance. Is negative if
     * there is no intersection. If the intersection type is MPSIntersectionTypeAny, is
     * a positive value for a hit or a negative value for a miss.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float distance();

    /**
     * @brief Distance from the ray origin to the intersection point along the ray direction
     * vector such that intersection = ray.origin + ray.direction * distance. Is negative if
     * there is no intersection. If the intersection type is MPSIntersectionTypeAny, is
     * a positive value for a hit or a negative value for a miss.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDistance(float value);

    /**
     * @brief Index of the intersected primitive. Undefined if the ray does not intersect
     * a primitive or if the intersection type is MPSIntersectionTypeAny.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int primitiveIndex();

    /**
     * @brief Index of the intersected primitive. Undefined if the ray does not intersect
     * a primitive or if the intersection type is MPSIntersectionTypeAny.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPrimitiveIndex(int value);

    /**
     * @brief Index of the intersected instance. Undefined if the ray does not intersect a
     * primitive, if the acceleration structure is not an instance acceleration structure,
     * or if the intersection type is MPSIntersectionTypeAny.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int instanceIndex();

    /**
     * @brief Index of the intersected instance. Undefined if the ray does not intersect a
     * primitive, if the acceleration structure is not an instance acceleration structure,
     * or if the intersection type is MPSIntersectionTypeAny.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInstanceIndex(int value);
}