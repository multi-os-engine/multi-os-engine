package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDIMessage_128 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MIDIMessage_128() {
        super(MIDIMessage_128.class);
    }

    @Generated
    protected MIDIMessage_128(Pointer peer) {
        super(peer);
    }

    @Generated
    public MIDIMessage_128(int word0, int word1, int word2, int word3) {
        super(MIDIMessage_128.class);
        setWord0(word0);
        setWord1(word1);
        setWord2(word2);
        setWord3(word3);
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

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int word2();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setWord2(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int word3();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setWord3(int value);
}