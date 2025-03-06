package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLPackedFloatQuaternion extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTLPackedFloatQuaternion() {
        super(MTLPackedFloatQuaternion.class);
    }

    @Generated
    protected MTLPackedFloatQuaternion(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLPackedFloatQuaternion(float x, float y, float z, float w) {
        super(MTLPackedFloatQuaternion.class);
        setX(x);
        setY(y);
        setZ(z);
        setW(w);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float x();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float y();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float z();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setZ(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float w();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setW(float value);
}