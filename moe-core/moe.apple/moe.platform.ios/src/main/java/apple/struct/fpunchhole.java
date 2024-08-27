package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class fpunchhole extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public fpunchhole() {
        super(fpunchhole.class);
    }

    @Generated
    protected fpunchhole(Pointer peer) {
        super(peer);
    }

    @Generated
    public fpunchhole(int fp_flags, int reserved, long fp_offset, long fp_length) {
        super(fpunchhole.class);
        setFp_flags(fp_flags);
        setReserved(reserved);
        setFp_offset(fp_offset);
        setFp_length(fp_length);
    }

    /**
     * unused
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int fp_flags();

    /**
     * unused
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFp_flags(int value);

    /**
     * (to maintain 8-byte alignment)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int reserved();

    /**
     * (to maintain 8-byte alignment)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setReserved(int value);

    /**
     * IN: start of the region
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long fp_offset();

    /**
     * IN: start of the region
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFp_offset(long value);

    /**
     * IN: size of the region
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long fp_length();

    /**
     * IN: size of the region
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFp_length(long value);
}