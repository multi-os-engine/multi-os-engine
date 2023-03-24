package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class AudioBuffer extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioBuffer() {
        super(AudioBuffer.class);
    }

    @Generated
    protected AudioBuffer(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioBuffer(int mNumberChannels, int mDataByteSize, @Nullable VoidPtr mData) {
        super(AudioBuffer.class);
        setMNumberChannels(mNumberChannels);
        setMDataByteSize(mDataByteSize);
        setMData(mData);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mNumberChannels();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMNumberChannels(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mDataByteSize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMDataByteSize(int value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr mData();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMData(@Nullable VoidPtr value);
}