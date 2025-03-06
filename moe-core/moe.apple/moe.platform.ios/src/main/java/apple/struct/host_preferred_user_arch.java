package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class host_preferred_user_arch extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public host_preferred_user_arch() {
        super(host_preferred_user_arch.class);
    }

    @Generated
    protected host_preferred_user_arch(Pointer peer) {
        super(peer);
    }

    @Generated
    public host_preferred_user_arch(int cpu_type, int cpu_subtype) {
        super(host_preferred_user_arch.class);
        setCpu_type(cpu_type);
        setCpu_subtype(cpu_subtype);
    }

    /**
     * Preferred user-space cpu type
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cpu_type();

    /**
     * Preferred user-space cpu type
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCpu_type(int value);

    /**
     * Preferred user-space cpu subtype
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cpu_subtype();

    /**
     * Preferred user-space cpu subtype
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCpu_subtype(int value);
}