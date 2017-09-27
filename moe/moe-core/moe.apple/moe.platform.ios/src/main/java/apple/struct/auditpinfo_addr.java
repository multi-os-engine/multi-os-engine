package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class auditpinfo_addr extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public auditpinfo_addr() {
        super(auditpinfo_addr.class);
    }

    @Generated
    protected auditpinfo_addr(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int ap_pid();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAp_pid(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int ap_auid();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAp_auid(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native au_mask ap_mask();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAp_mask(@ByValue au_mask value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native au_tid_addr ap_termid();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAp_termid(@ByValue au_tid_addr value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int ap_asid();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAp_asid(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long ap_flags();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setAp_flags(long value);
}