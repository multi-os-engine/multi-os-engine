package apple.corefoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;

@Generated
@Structure()
public final class CGAffineTransform extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGAffineTransform() {
        super(CGAffineTransform.class);
    }

    @Generated
    protected CGAffineTransform(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double a();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setA(@NFloat double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NFloat
    public native double b();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setB(@NFloat double value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NFloat
    public native double c();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setC(@NFloat double value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NFloat
    public native double d();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setD(@NFloat double value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NFloat
    public native double tx();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTx(@NFloat double value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NFloat
    public native double ty();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setTy(@NFloat double value);
}