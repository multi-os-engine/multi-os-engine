package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;

@Generated
@Structure()
public final class AudioValueTranslation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioValueTranslation() {
        super(AudioValueTranslation.class);
    }

    @Generated
    protected AudioValueTranslation(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioValueTranslation(@NotNull VoidPtr mInputData, int mInputDataSize, @NotNull VoidPtr mOutputData,
            int mOutputDataSize) {
        super(AudioValueTranslation.class);
        setMInputData(mInputData);
        setMInputDataSize(mInputDataSize);
        setMOutputData(mOutputData);
        setMOutputDataSize(mOutputDataSize);
    }

    @NotNull
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr mInputData();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMInputData(@NotNull VoidPtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mInputDataSize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMInputDataSize(int value);

    @NotNull
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr mOutputData();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMOutputData(@NotNull VoidPtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mOutputDataSize();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMOutputDataSize(int value);
}