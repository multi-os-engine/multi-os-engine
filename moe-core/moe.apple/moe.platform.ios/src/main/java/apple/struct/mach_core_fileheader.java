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
public final class mach_core_fileheader extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_core_fileheader() {
        super(mach_core_fileheader.class);
    }

    @Generated
    protected mach_core_fileheader(Pointer peer) {
        super(peer);
    }

    /**
     * MACH_CORE_FILEHEADER_SIGNATURE
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long signature();

    /**
     * MACH_CORE_FILEHEADER_SIGNATURE
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSignature(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long log_offset();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLog_offset(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long log_length();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLog_length(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long num_files();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNum_files(long value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 16)
    @ByValue
    public native mach_core_details files(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 16)
    public native void setFiles(@ByValue mach_core_details value, int field_idx);
}