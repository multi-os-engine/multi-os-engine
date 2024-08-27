package org.libimobiledevice.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class idevice_info extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public idevice_info() {
        super(idevice_info.class);
    }

    @Generated
    protected idevice_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public idevice_info(BytePtr udid, int conn_type, VoidPtr conn_data) {
        super(idevice_info.class);
        setUdid(udid);
        setConn_type(conn_type);
        setConn_data(conn_data);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native BytePtr udid();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setUdid(BytePtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int conn_type();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setConn_type(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr conn_data();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setConn_data(VoidPtr value);
}