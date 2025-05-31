package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class task_security_config_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_security_config_info() {
        super(task_security_config_info.class);
    }

    @Generated
    protected task_security_config_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_security_config_info(int config) {
        super(task_security_config_info.class);
        setConfig(config);
    }

    /**
     * Configuration bitmask
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int config();

    /**
     * Configuration bitmask
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setConfig(int value);
}