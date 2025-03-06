package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class dylib_use_command extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public dylib_use_command() {
        super(dylib_use_command.class);
    }

    @Generated
    protected dylib_use_command(Pointer peer) {
        super(peer);
    }

    /**
     * LC_LOAD_DYLIB or LC_LOAD_WEAK_DYLIB
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_LOAD_DYLIB or LC_LOAD_WEAK_DYLIB
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * overall size, including path
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * overall size, including path
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * == 28, dylibs's path offset
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int nameoff();

    /**
     * == 28, dylibs's path offset
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setNameoff(int value);

    /**
     * == DYLIB_USE_MARKER
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int marker();

    /**
     * == DYLIB_USE_MARKER
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMarker(int value);

    /**
     * dylib's current version number
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int current_version();

    /**
     * dylib's current version number
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCurrent_version(int value);

    /**
     * dylib's compatibility version number
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int compat_version();

    /**
     * dylib's compatibility version number
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setCompat_version(int value);

    /**
     * DYLIB_USE_... flags
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int flags();

    /**
     * DYLIB_USE_... flags
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setFlags(int value);
}