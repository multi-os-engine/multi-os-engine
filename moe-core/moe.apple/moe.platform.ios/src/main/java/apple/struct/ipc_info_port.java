package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ipc_info_port extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public ipc_info_port() {
        super(ipc_info_port.class);
    }

    @Generated
    protected ipc_info_port(Pointer peer) {
        super(peer);
    }

    @Generated
    public ipc_info_port(int iip_port_object, int iip_receiver_object) {
        super(ipc_info_port.class);
        setIip_port_object(iip_port_object);
        setIip_receiver_object(iip_receiver_object);
    }

    /**
     * port object identifier
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int iip_port_object();

    /**
     * port object identifier
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIip_port_object(int value);

    /**
     * receiver task identifier (if any)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int iip_receiver_object();

    /**
     * receiver task identifier (if any)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIip_receiver_object(int value);
}