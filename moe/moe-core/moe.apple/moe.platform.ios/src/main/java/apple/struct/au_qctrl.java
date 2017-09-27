package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class au_qctrl extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public au_qctrl() {
        super(au_qctrl.class);
    }

    @Generated
    protected au_qctrl(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int aq_hiwater();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAq_hiwater(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int aq_lowater();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAq_lowater(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int aq_bufsz();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAq_bufsz(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int aq_delay();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAq_delay(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int aq_minfree();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAq_minfree(int value);
}