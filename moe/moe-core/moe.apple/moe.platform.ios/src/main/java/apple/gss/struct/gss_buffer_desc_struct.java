package apple.gss.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class gss_buffer_desc_struct extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public gss_buffer_desc_struct() {
        super(gss_buffer_desc_struct.class);
    }

    @Generated
    protected gss_buffer_desc_struct(Pointer peer) {
        super(peer);
    }

    @Generated
    public gss_buffer_desc_struct(@NUInt long length, VoidPtr value) {
        super(gss_buffer_desc_struct.class);
        setLength(length);
        setValue(value);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long length();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setLength(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr value();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setValue(VoidPtr value);
}