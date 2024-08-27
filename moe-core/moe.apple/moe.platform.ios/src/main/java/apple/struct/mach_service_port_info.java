package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_service_port_info extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public mach_service_port_info() {
        super(mach_service_port_info.class);
    }

    @Generated
    protected mach_service_port_info(Pointer peer) {
        super(peer);
    }

    /**
     * Service port's string name
     */
    @Generated
    @StructureField(order = 0, isGetter = true, count = 255)
    public native byte mspi_string_name(int field_idx);

    /**
     * Service port's string name
     */
    @Generated
    @StructureField(order = 0, isGetter = false, count = 255)
    public native void setMspi_string_name(byte value, int field_idx);

    /**
     * Service port domain
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte mspi_domain_type();

    /**
     * Service port domain
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMspi_domain_type(byte value);
}
