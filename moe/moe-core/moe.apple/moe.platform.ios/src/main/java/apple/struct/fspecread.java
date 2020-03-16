package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class fspecread extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public fspecread() {
        super(fspecread.class);
    }

    @Generated
    protected fspecread(Pointer peer) {
        super(peer);
    }

    @Generated
    public fspecread(int fsr_flags, int reserved, long fsr_offset, long fsr_length) {
        super(fspecread.class);
        setFsr_flags(fsr_flags);
        setReserved(reserved);
        setFsr_offset(fsr_offset);
        setFsr_length(fsr_length);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int fsr_flags();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFsr_flags(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int reserved();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setReserved(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long fsr_offset();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFsr_offset(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long fsr_length();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFsr_length(long value);
}