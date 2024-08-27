package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vImage_PerpsectiveTransform extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vImage_PerpsectiveTransform() {
        super(vImage_PerpsectiveTransform.class);
    }

    @Generated
    protected vImage_PerpsectiveTransform(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float a();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setA(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float b();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setB(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float c();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setC(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float d();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setD(float value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float tx();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTx(float value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float ty();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setTy(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float vx();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setVx(float value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native float vy();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setVy(float value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native float v();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setV(float value);
}