package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class NDR_record_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public NDR_record_t() {
        super(NDR_record_t.class);
    }

    @Generated
    protected NDR_record_t(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte mig_vers();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMig_vers(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte if_vers();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIf_vers(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte reserved1();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setReserved1(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte mig_encoding();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMig_encoding(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte int_rep();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setInt_rep(byte value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native byte char_rep();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setChar_rep(byte value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native byte float_rep();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setFloat_rep(byte value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native byte reserved2();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setReserved2(byte value);
}