package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDIUniversalMessage extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MIDIUniversalMessage() {
        super(MIDIUniversalMessage.class);
    }

    @Generated
    protected MIDIUniversalMessage(Pointer peer) {
        super(peer);
    }

    /**
     * !< determines which variant in the union is active
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int type();

    /**
     * !< determines which variant in the union is active
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setType(int value);

    /**
     * !< 4 bit MIDI group
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte group();

    /**
     * !< 4 bit MIDI group
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGroup(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 3)
    public native byte reserved(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 3)
    public native void setReserved(byte value, int field_idx);
}
