package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class build_version_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public build_version_command() {
        super(build_version_command.class);
    }

    @Generated
    protected build_version_command(Pointer peer) {
        super(peer);
    }

    /**
     * LC_BUILD_VERSION
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_BUILD_VERSION
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * sizeof(struct build_version_command) plus
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * sizeof(struct build_version_command) plus
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * platform
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int platform();

    /**
     * platform
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPlatform(int value);

    /**
     * X.Y.Z is encoded in nibbles xxxx.yy.zz
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int minos();

    /**
     * X.Y.Z is encoded in nibbles xxxx.yy.zz
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMinos(int value);

    /**
     * X.Y.Z is encoded in nibbles xxxx.yy.zz
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int sdk();

    /**
     * X.Y.Z is encoded in nibbles xxxx.yy.zz
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setSdk(int value);

    /**
     * number of tool entries following this
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int ntools();

    /**
     * number of tool entries following this
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setNtools(int value);
}