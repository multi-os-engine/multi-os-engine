package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class _OSUnalignedU16 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public _OSUnalignedU16() {
        super(_OSUnalignedU16.class);
    }

    @Generated
    protected _OSUnalignedU16(Pointer peer) {
        super(peer);
    }

    @Generated
    public _OSUnalignedU16(char __val) {
        super(_OSUnalignedU16.class);
        set__val(__val);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char __val();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__val(char value);
}