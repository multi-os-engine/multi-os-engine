package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_core_fileheader_base extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_core_fileheader_base() {
        super(mach_core_fileheader_base.class);
    }

    @Generated
    protected mach_core_fileheader_base(Pointer peer) {
        super(peer);
    }

    @Generated
    public mach_core_fileheader_base(long signature, int version) {
        super(mach_core_fileheader_base.class);
        setSignature(signature);
        setVersion(version);
    }

    /**
     * MACH_CORE_FILEHEADER_V2_SIGNATURE
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long signature();

    /**
     * MACH_CORE_FILEHEADER_V2_SIGNATURE
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSignature(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVersion(int value);
}