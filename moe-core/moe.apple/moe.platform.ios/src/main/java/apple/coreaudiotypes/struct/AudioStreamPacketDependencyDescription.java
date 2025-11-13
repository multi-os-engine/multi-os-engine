package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioStreamPacketDependencyDescription extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public AudioStreamPacketDependencyDescription() {
        super(AudioStreamPacketDependencyDescription.class);
    }

    @Generated
    protected AudioStreamPacketDependencyDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioStreamPacketDependencyDescription(int mIsIndependentlyDecodable, int mPreRollCount, int mFlags,
            int mReserved) {
        super(AudioStreamPacketDependencyDescription.class);
        setMIsIndependentlyDecodable(mIsIndependentlyDecodable);
        setMPreRollCount(mPreRollCount);
        setMFlags(mFlags);
        setMReserved(mReserved);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mIsIndependentlyDecodable();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMIsIndependentlyDecodable(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mPreRollCount();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMPreRollCount(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mFlags();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMFlags(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mReserved();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMReserved(int value);
}