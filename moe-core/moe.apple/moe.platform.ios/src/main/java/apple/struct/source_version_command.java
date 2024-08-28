package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class source_version_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public source_version_command() {
        super(source_version_command.class);
    }

    @Generated
    protected source_version_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public source_version_command(int cmd, int cmdsize, long version) {
        super(source_version_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
        setVersion(version);
    }

    /**
     * LC_SOURCE_VERSION
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_SOURCE_VERSION
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * 16
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * 16
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * A.B.C.D.E packed as a24.b10.c10.d10.e10
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long version();

    /**
     * A.B.C.D.E packed as a24.b10.c10.d10.e10
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setVersion(long value);
}