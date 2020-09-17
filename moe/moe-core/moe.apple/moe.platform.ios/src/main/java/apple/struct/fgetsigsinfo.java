package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class fgetsigsinfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public fgetsigsinfo() {
        super(fgetsigsinfo.class);
    }

    @Generated
    protected fgetsigsinfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public fgetsigsinfo(long fg_file_start, int fg_info_request, int fg_sig_is_platform) {
        super(fgetsigsinfo.class);
        setFg_file_start(fg_file_start);
        setFg_info_request(fg_info_request);
        setFg_sig_is_platform(fg_sig_is_platform);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long fg_file_start();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFg_file_start(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int fg_info_request();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFg_info_request(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int fg_sig_is_platform();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFg_sig_is_platform(int value);
}