package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class MTLAccelerationStructureSizes extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLAccelerationStructureSizes() {
        super(MTLAccelerationStructureSizes.class);
    }

    @Generated
    protected MTLAccelerationStructureSizes(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLAccelerationStructureSizes(@NUInt long accelerationStructureSize, @NUInt long buildScratchBufferSize,
            @NUInt long refitScratchBufferSize) {
        super(MTLAccelerationStructureSizes.class);
        setAccelerationStructureSize(accelerationStructureSize);
        setBuildScratchBufferSize(buildScratchBufferSize);
        setRefitScratchBufferSize(refitScratchBufferSize);
    }

    /**
     * The required size, in bytes, of the built acceleration structure
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long accelerationStructureSize();

    /**
     * The required size, in bytes, of the built acceleration structure
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAccelerationStructureSize(@NUInt long value);

    /**
     * The required size, in bytes, of the scratch buffer used to build the acceleration structure
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long buildScratchBufferSize();

    /**
     * The required size, in bytes, of the scratch buffer used to build the acceleration structure
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBuildScratchBufferSize(@NUInt long value);

    /**
     * The required size, in bytes, of the scratch buffer used to refit the acceleration structure
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long refitScratchBufferSize();

    /**
     * The required size, in bytes, of the scratch buffer used to refit the acceleration structure
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRefitScratchBufferSize(@NUInt long value);
}