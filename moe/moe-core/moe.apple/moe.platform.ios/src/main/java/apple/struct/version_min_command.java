package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class version_min_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public version_min_command() {
        super(version_min_command.class);
    }

    @Generated
    protected version_min_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public version_min_command(int cmd, int cmdsize, int version, int sdk) {
        super(version_min_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
        setVersion(version);
        setSdk(sdk);
    }

    /**
     * LC_VERSION_MIN_MACOSX or
     * LC_VERSION_MIN_IPHONEOS or
     * LC_VERSION_MIN_WATCHOS or
     * LC_VERSION_MIN_TVOS 
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_VERSION_MIN_MACOSX or
     * LC_VERSION_MIN_IPHONEOS or
     * LC_VERSION_MIN_WATCHOS or
     * LC_VERSION_MIN_TVOS 
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * sizeof(struct min_version_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * sizeof(struct min_version_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * X.Y.Z is encoded in nibbles xxxx.yy.zz
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int version();

    /**
     * X.Y.Z is encoded in nibbles xxxx.yy.zz
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setVersion(int value);

    /**
     * X.Y.Z is encoded in nibbles xxxx.yy.zz
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int sdk();

    /**
     * X.Y.Z is encoded in nibbles xxxx.yy.zz
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSdk(int value);
}