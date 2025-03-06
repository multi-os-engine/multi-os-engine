package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class processor_set_basic_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public processor_set_basic_info() {
        super(processor_set_basic_info.class);
    }

    @Generated
    protected processor_set_basic_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public processor_set_basic_info(int processor_count, int default_policy) {
        super(processor_set_basic_info.class);
        setProcessor_count(processor_count);
        setDefault_policy(default_policy);
    }

    /**
     * How many processors
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int processor_count();

    /**
     * How many processors
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setProcessor_count(int value);

    /**
     * When others not enabled
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int default_policy();

    /**
     * When others not enabled
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDefault_policy(int value);
}