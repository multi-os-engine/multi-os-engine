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
public final class MPSCustomKernelArgumentCount extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSCustomKernelArgumentCount() {
        super(MPSCustomKernelArgumentCount.class);
    }

    @Generated
    protected MPSCustomKernelArgumentCount(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSCustomKernelArgumentCount(@NUInt long destinationTextureCount, @NUInt long sourceTextureCount,
            @NUInt long broadcastTextureCount) {
        super(MPSCustomKernelArgumentCount.class);
        setDestinationTextureCount(destinationTextureCount);
        setSourceTextureCount(sourceTextureCount);
        setBroadcastTextureCount(broadcastTextureCount);
    }

    /**
     * < must be 1. Can't have 2 or more. If you have 0, this is 1.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long destinationTextureCount();

    /**
     * < must be 1. Can't have 2 or more. If you have 0, this is 1.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDestinationTextureCount(@NUInt long value);

    /**
     * < number of source textures. These textures will be scaled by batchCount.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long sourceTextureCount();

    /**
     * < number of source textures. These textures will be scaled by batchCount.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSourceTextureCount(@NUInt long value);

    /**
     * < number of source textures shared across all parts of a batch
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long broadcastTextureCount();

    /**
     * < number of source textures shared across all parts of a batch
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBroadcastTextureCount(@NUInt long value);
}