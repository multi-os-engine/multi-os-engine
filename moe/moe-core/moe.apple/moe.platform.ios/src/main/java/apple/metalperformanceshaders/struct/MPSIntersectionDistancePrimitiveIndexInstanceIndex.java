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

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int instanceIndex();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInstanceIndex(int value);
}