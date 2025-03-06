package apple.accelerate.struct;

import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.LongPtr;

@Generated
@Structure()
public final class bnns_graph_shape_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public bnns_graph_shape_t() {
        super(bnns_graph_shape_t.class);
    }

    @Generated
    protected bnns_graph_shape_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public bnns_graph_shape_t(@NUInt long rank, @Nullable LongPtr shape) {
        super(bnns_graph_shape_t.class);
        setRank(rank);
        setShape(shape);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long rank();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRank(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @Nullable
    public native LongPtr shape();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setShape(@Nullable LongPtr value);
}