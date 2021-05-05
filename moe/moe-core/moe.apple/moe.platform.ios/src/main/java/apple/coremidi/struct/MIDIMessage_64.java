package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDIMessage_64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MIDIMessage_64() {
        super(MIDIMessage_64.class);
    }

    @Generated
    protected MIDIMessage_64(Pointer peer) {
        super(peer);
    }

    @Generated
    public MIDIMessage_64(int word0, int word1) {
        super(MIDIMessage_64.class);
        setWord0(word0);
        setWord1(word1);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int word0();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setWord0(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int word1();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setWord1(int value);
}