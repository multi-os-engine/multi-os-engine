package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class host_priority_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public host_priority_info() {
        super(host_priority_info.class);
    }

    @Generated
    protected host_priority_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int kernel_priority();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setKernel_priority(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int system_priority();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSystem_priority(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int server_priority();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setServer_priority(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int user_priority();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setUser_priority(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int depress_priority();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setDepress_priority(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int idle_priority();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIdle_priority(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int minimum_priority();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMinimum_priority(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int maximum_priority();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMaximum_priority(int value);
}