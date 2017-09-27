package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class MPSImageReadWriteParams extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSImageReadWriteParams() {
        super(MPSImageReadWriteParams.class);
    }

    @Generated
    protected MPSImageReadWriteParams(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSImageReadWriteParams(@NUInt long featureChannelOffset, @NUInt long numberOfFeatureChannelsToReadWrite) {
        super(MPSImageReadWriteParams.class);
        setFeatureChannelOffset(featureChannelOffset);
        setNumberOfFeatureChannelsToReadWrite(numberOfFeatureChannelsToReadWrite);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long featureChannelOffset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFeatureChannelOffset(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long numberOfFeatureChannelsToReadWrite();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNumberOfFeatureChannelsToReadWrite(@NUInt long value);
}