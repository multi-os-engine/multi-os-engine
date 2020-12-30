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

    /**
     * IN: Offset in the file to look for a signature, -1 for any signature
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long fg_file_start();

    /**
     * IN: Offset in the file to look for a signature, -1 for any signature
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFg_file_start(long value);

    /**
     * IN: Key indicating the info requested
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int fg_info_request();

    /**
     * IN: Key indicating the info requested
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFg_info_request(int value);

    /**
     * OUT: 1 if the signature is a plat form binary, 0 if not
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int fg_sig_is_platform();

    /**
     * OUT: 1 if the signature is a plat form binary, 0 if not
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFg_sig_is_platform(int value);
}