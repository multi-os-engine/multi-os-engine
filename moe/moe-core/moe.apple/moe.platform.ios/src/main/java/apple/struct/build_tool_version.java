package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class build_tool_version extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public build_tool_version() {
        super(build_tool_version.class);
    }

    @Generated
    protected build_tool_version(Pointer peer) {
        super(peer);
    }

    @Generated
    public build_tool_version(int tool, int version) {
        super(build_tool_version.class);
        setTool(tool);
        setVersion(version);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int tool();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTool(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVersion(int value);
}