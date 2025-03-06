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
public final class __Reply__host_kernel_version_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__host_kernel_version_t() {
        super(__Reply__host_kernel_version_t.class);
    }

    @Generated
    protected __Reply__host_kernel_version_t(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native mach_msg_header_t Head();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHead(@ByValue mach_msg_header_t value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native NDR_record_t NDR();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNDR(@ByValue NDR_record_t value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int RetCode();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRetCode(int value);

    /**
     * MiG doesn't use it
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int kernel_versionOffset();

    /**
     * MiG doesn't use it
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setKernel_versionOffset(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int kernel_versionCnt();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setKernel_versionCnt(int value);

    @Generated
    @StructureField(order = 5, isGetter = true, count = 512)
    public native byte kernel_version(int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = false, count = 512)
    public native void setKernel_version(byte value, int field_idx);
}