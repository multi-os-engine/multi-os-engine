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

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float distance();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDistance(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int primitiveIndex();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPrimitiveIndex(int value);
}