package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class processor_basic_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public processor_basic_info() {
        super(processor_basic_info.class);
    }

    @Generated
    protected processor_basic_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public processor_basic_info(int cpu_type, int cpu_subtype, int running, int slot_num) {
        super(processor_basic_info.class);
        setCpu_type(cpu_type);
        setCpu_subtype(cpu_subtype);
        setRunning(running);
        setSlot_num(slot_num);
    }

    /**
     * type of cpu
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cpu_type();

    /**
     * type of cpu
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCpu_type(int value);

    /**
     * subtype of cpu
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cpu_subtype();

    /**
     * subtype of cpu
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCpu_subtype(int value);

    /**
     * is processor running
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int running();

    /**
     * is processor running
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRunning(int value);

    /**
     * slot number
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int slot_num();

    /**
     * slot number
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSlot_num(int value);
}