package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class kernel_resource_sizes extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public kernel_resource_sizes() {
        super(kernel_resource_sizes.class);
    }

    @Generated
    protected kernel_resource_sizes(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int task();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTask(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int thread();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setThread(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int port();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPort(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int memory_region();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMemory_region(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int memory_object();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMemory_object(int value);
}