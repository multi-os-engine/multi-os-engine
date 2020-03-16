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

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float distance();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDistance(float value);
}