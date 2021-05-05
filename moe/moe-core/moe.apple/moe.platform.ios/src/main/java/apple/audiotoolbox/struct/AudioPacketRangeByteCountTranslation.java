package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioPacketRangeByteCountTranslation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioPacketRangeByteCountTranslation() {
        super(AudioPacketRangeByteCountTranslation.class);
    }

    @Generated
    protected AudioPacketRangeByteCountTranslation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioPacketRangeByteCountTranslation(long mPacket, long mPacketCount, long mByteCountUpperBound) {
        super(AudioPacketRangeByteCountTranslation.class);
        setMPacket(mPacket);
        setMPacketCount(mPacketCount);
        setMByteCountUpperBound(mByteCountUpperBound);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long mPacket();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMPacket(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long mPacketCount();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMPacketCount(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long mByteCountUpperBound();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMByteCountUpperBound(long value);
}