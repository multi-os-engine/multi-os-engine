package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class _OSUnalignedU64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public _OSUnalignedU64() {
        super(_OSUnalignedU64.class);
    }

    @Generated
    protected _OSUnalignedU64(Pointer peer) {
        super(peer);
    }

    @Generated
    public _OSUnalignedU64(long __val) {
        super(_OSUnalignedU64.class);
        set__val(__val);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long __val();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__val(long value);
}