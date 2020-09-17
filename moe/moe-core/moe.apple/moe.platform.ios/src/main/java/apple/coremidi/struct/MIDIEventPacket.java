package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class MIDIEventPacket extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MIDIEventPacket() {
        super(MIDIEventPacket.class);
    }

    @Generated
    protected MIDIEventPacket(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long timeStamp();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTimeStamp(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int wordCount();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setWordCount(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 64)
    public native int words(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 64)
    public native void setWords(int value, int field_idx);
}