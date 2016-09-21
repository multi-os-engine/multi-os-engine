package apple.gss.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class gss_iov_buffer_desc_struct extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public gss_iov_buffer_desc_struct() {
        super(gss_iov_buffer_desc_struct.class);
    }

    @Generated
    protected gss_iov_buffer_desc_struct(Pointer peer) {
        super(peer);
    }

    @Generated
    public gss_iov_buffer_desc_struct(int type, @ByValue gss_buffer_desc_struct buffer) {
        super(gss_iov_buffer_desc_struct.class);
        setType(type);
        setBuffer(buffer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int type();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setType(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native gss_buffer_desc_struct buffer();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBuffer(@ByValue gss_buffer_desc_struct value);
}