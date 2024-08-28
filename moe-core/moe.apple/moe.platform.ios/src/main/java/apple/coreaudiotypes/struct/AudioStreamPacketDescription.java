package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioStreamPacketDescription extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioStreamPacketDescription() {
        super(AudioStreamPacketDescription.class);
    }

    @Generated
    protected AudioStreamPacketDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioStreamPacketDescription(long mStartOffset, int mVariableFramesInPacket, int mDataByteSize) {
        super(AudioStreamPacketDescription.class);
        setMStartOffset(mStartOffset);
        setMVariableFramesInPacket(mVariableFramesInPacket);
        setMDataByteSize(mDataByteSize);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long mStartOffset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMStartOffset(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mVariableFramesInPacket();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMVariableFramesInPacket(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mDataByteSize();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMDataByteSize(int value);
}