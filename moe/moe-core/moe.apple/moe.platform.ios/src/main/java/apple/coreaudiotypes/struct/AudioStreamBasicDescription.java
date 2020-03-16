package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioStreamBasicDescription extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioStreamBasicDescription() {
        super(AudioStreamBasicDescription.class);
    }

    @Generated
    protected AudioStreamBasicDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double mSampleRate();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMSampleRate(double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mFormatID();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMFormatID(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mFormatFlags();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMFormatFlags(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mBytesPerPacket();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMBytesPerPacket(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int mFramesPerPacket();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMFramesPerPacket(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int mBytesPerFrame();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMBytesPerFrame(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int mChannelsPerFrame();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMChannelsPerFrame(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int mBitsPerChannel();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMBitsPerChannel(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int mReserved();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setMReserved(int value);
}