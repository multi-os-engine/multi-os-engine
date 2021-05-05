package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLCounterResultStageUtilization extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLCounterResultStageUtilization() {
        super(MTLCounterResultStageUtilization.class);
    }

    @Generated
    protected MTLCounterResultStageUtilization(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long totalCycles();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTotalCycles(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long vertexCycles();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVertexCycles(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long tessellationCycles();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTessellationCycles(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long postTessellationVertexCycles();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPostTessellationVertexCycles(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long fragmentCycles();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setFragmentCycles(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long renderTargetCycles();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setRenderTargetCycles(long value);
}