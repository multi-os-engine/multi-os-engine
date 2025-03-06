package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_send_once_notification_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_send_once_notification_t() {
        super(mach_send_once_notification_t.class);
    }

    @Generated
    protected mach_send_once_notification_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public mach_send_once_notification_t(@ByValue mach_msg_header_t not_header,
            @ByValue mach_msg_security_trailer_t trailer) {
        super(mach_send_once_notification_t.class);
        setNot_header(not_header);
        setTrailer(trailer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native mach_msg_header_t not_header();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNot_header(@ByValue mach_msg_header_t value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native mach_msg_security_trailer_t trailer();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTrailer(@ByValue mach_msg_security_trailer_t value);
}