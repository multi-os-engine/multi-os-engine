package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDIEventList extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MIDIEventList() {
        super(MIDIEventList.class);
    }

    @Generated
    protected MIDIEventList(Pointer peer) {
        super(peer);
    }

    @Generated
    public MIDIEventList(int protocol, int numPackets, @ByValue MIDIEventPacket packet) {
        super(MIDIEventList.class);
        setProtocol(protocol);
        setNumPackets(numPackets);
        setPacket(packet);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int protocol();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setProtocol(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int numPackets();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNumPackets(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native MIDIEventPacket packet();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPacket(@ByValue MIDIEventPacket value);
}