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

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long accelerationStructureSize();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAccelerationStructureSize(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long buildScratchBufferSize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBuildScratchBufferSize(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long refitScratchBufferSize();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRefitScratchBufferSize(@NUInt long value);
}