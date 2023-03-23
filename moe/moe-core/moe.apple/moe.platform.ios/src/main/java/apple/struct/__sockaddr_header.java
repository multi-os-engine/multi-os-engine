package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __sockaddr_header extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __sockaddr_header() {
        super(__sockaddr_header.class);
    }

    @Generated
    protected __sockaddr_header(Pointer peer) {
        super(peer);
    }

    @Generated
    public __sockaddr_header(byte sa_len, byte sa_family) {
        super(__sockaddr_header.class);
        setSa_len(sa_len);
        setSa_family(sa_family);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte sa_len();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSa_len(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte sa_family();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSa_family(byte value);
}