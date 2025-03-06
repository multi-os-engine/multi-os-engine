package apple.accelerate.struct;

import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class bnns_graph_compile_options_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public bnns_graph_compile_options_t() {
        super(bnns_graph_compile_options_t.class);
    }

    @Generated
    protected bnns_graph_compile_options_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public bnns_graph_compile_options_t(@Nullable VoidPtr data, @NUInt long size) {
        super(bnns_graph_compile_options_t.class);
        setData(data);
        setSize(size);
    }

    /**
     * < Pointer to opaque object
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @Nullable
    public native VoidPtr data();

    /**
     * < Pointer to opaque object
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setData(@Nullable VoidPtr value);

    /**
     * < size in bytes of object pointed to by data
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long size();

    /**
     * < size in bytes of object pointed to by data
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(@NUInt long value);
}