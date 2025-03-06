package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class mach_core_fileheader_v2 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_core_fileheader_v2() {
        super(mach_core_fileheader_v2.class);
    }

    @Generated
    protected mach_core_fileheader_v2(Pointer peer) {
        super(peer);
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

    /**
     * 2
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int version();

    /**
     * 2
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVersion(int value);

    /**
     * See the MACH_CORE_FILEHEADER_V2_FLAG_* definitions
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long flags();

    /**
     * See the MACH_CORE_FILEHEADER_V2_FLAG_* definitions
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFlags(long value);

    /**
     * Offset of the public key
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long pub_key_offset();

    /**
     * Offset of the public key
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPub_key_offset(long value);

    /**
     * Length of the public key
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native char pub_key_length();

    /**
     * Length of the public key
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setPub_key_length(char value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long log_offset();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setLog_offset(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long log_length();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setLog_length(long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long num_files();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setNum_files(long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native mach_core_details_v2 files();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setFiles(
            @UncertainArgument("Options: reference, array Fallback: reference") mach_core_details_v2 value);
}