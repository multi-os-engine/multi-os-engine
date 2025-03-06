package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class task_events_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_events_info() {
        super(task_events_info.class);
    }

    @Generated
    protected task_events_info(Pointer peer) {
        super(peer);
    }

    /**
     * number of page faults
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int faults();

    /**
     * number of page faults
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFaults(int value);

    /**
     * number of actual pageins
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int pageins();

    /**
     * number of actual pageins
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPageins(int value);

    /**
     * number of copy-on-write faults
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int cow_faults();

    /**
     * number of copy-on-write faults
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCow_faults(int value);

    /**
     * number of messages sent
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int messages_sent();

    /**
     * number of messages sent
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMessages_sent(int value);

    /**
     * number of messages received
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int messages_received();

    /**
     * number of messages received
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMessages_received(int value);

    /**
     * number of mach system calls
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int syscalls_mach();

    /**
     * number of mach system calls
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setSyscalls_mach(int value);

    /**
     * number of unix system calls
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int syscalls_unix();

    /**
     * number of unix system calls
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setSyscalls_unix(int value);

    /**
     * number of context switches
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int csw();

    /**
     * number of context switches
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setCsw(int value);
}