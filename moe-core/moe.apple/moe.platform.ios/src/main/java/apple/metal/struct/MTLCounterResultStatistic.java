package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLCounterResultStatistic extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLCounterResultStatistic() {
        super(MTLCounterResultStatistic.class);
    }

    @Generated
    protected MTLCounterResultStatistic(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long tessellationInputPatches();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTessellationInputPatches(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long vertexInvocations();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVertexInvocations(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long postTessellationVertexInvocations();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPostTessellationVertexInvocations(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long clipperInvocations();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setClipperInvocations(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long clipperPrimitivesOut();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setClipperPrimitivesOut(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long fragmentInvocations();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setFragmentInvocations(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long fragmentsPassed();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setFragmentsPassed(long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long computeKernelInvocations();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setComputeKernelInvocations(long value);
}