package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioPacketRollDistanceTranslation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioPacketRollDistanceTranslation() {
        super(AudioPacketRollDistanceTranslation.class);
    }

    @Generated
    protected AudioPacketRollDistanceTranslation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioPacketRollDistanceTranslation(long mPacket, long mRollDistance) {
        super(AudioPacketRollDistanceTranslation.class);
        setMPacket(mPacket);
        setMRollDistance(mRollDistance);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long mPacket();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMPacket(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long mRollDistance();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMRollDistance(long value);
}