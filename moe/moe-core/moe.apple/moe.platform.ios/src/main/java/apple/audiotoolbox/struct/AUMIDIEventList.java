package apple.audiotoolbox.struct;

import apple.coremidi.struct.MIDIEventList;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure(alignment = 4)
public final class AUMIDIEventList extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AUMIDIEventList() {
        super(AUMIDIEventList.class);
    }

    @Generated
    protected AUMIDIEventList(Pointer peer) {
        super(peer);
    }

    /**
     * !< The next event in a linked list of events.
     */
    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr next();

    /**
     * !< The next event in a linked list of events.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNext(@Nullable VoidPtr value);

    /**
     * !< The sample time at which the event is scheduled to occur.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long eventSampleTime();

    /**
     * !< The sample time at which the event is scheduled to occur.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setEventSampleTime(long value);

    /**
     * !< AURenderEventMIDI or AURenderEventMIDISysEx.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte eventType();

    /**
     * !< AURenderEventMIDI or AURenderEventMIDISysEx.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEventType(byte value);

    /**
     * !< Must be 0.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte reserved();

    /**
     * !< Must be 0.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setReserved(byte value);

    /**
     * !< The virtual cable number.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte cable();

    /**
     * !< The virtual cable number.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCable(byte value);

    /**
     * !< A structure containing UMP packets.
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native MIDIEventList eventList();

    /**
     * !< A structure containing UMP packets.
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setEventList(@ByValue MIDIEventList value);
}
