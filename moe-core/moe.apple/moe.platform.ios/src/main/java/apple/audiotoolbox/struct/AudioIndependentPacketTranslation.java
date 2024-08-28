package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioIndependentPacketTranslation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioIndependentPacketTranslation() {
        super(AudioIndependentPacketTranslation.class);
    }

    @Generated
    protected AudioIndependentPacketTranslation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioIndependentPacketTranslation(long mPacket, long mIndependentlyDecodablePacket) {
        super(AudioIndependentPacketTranslation.class);
        setMPacket(mPacket);
        setMIndependentlyDecodablePacket(mIndependentlyDecodablePacket);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long mPacket();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMPacket(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long mIndependentlyDecodablePacket();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMIndependentlyDecodablePacket(long value);
}