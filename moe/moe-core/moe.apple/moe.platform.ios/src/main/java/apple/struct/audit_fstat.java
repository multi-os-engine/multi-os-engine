package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class audit_fstat extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public audit_fstat() {
        super(audit_fstat.class);
    }

    @Generated
    protected audit_fstat(Pointer peer) {
        super(peer);
    }

    @Generated
    public audit_fstat(long af_filesz, long af_currsz) {
        super(audit_fstat.class);
        setAf_filesz(af_filesz);
        setAf_currsz(af_currsz);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long af_filesz();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAf_filesz(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long af_currsz();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAf_currsz(long value);
}