package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioPacketDependencyInfoTranslation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioPacketDependencyInfoTranslation() {
        super(AudioPacketDependencyInfoTranslation.class);
    }

    @Generated
    protected AudioPacketDependencyInfoTranslation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioPacketDependencyInfoTranslation(long mPacket, int mIsIndependentlyDecodable,
            int mNumberPrerollPackets) {
        super(AudioPacketDependencyInfoTranslation.class);
        setMPacket(mPacket);
        setMIsIndependentlyDecodable(mIsIndependentlyDecodable);
        setMNumberPrerollPackets(mNumberPrerollPackets);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long mPacket();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMPacket(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mIsIndependentlyDecodable();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMIsIndependentlyDecodable(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mNumberPrerollPackets();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMNumberPrerollPackets(int value);
}