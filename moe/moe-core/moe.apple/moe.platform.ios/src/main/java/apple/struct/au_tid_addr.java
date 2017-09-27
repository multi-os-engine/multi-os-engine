package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class au_tid_addr extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public au_tid_addr() {
        super(au_tid_addr.class);
    }

    @Generated
    protected au_tid_addr(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int at_port();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAt_port(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int at_type();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAt_type(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 4)
    public native int at_addr(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 4)
    public native void setAt_addr(int value, int field_idx);
}