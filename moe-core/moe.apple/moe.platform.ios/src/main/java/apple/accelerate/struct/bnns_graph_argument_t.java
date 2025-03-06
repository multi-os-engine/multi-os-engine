package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class bnns_graph_argument_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public bnns_graph_argument_t() {
        super(bnns_graph_argument_t.class);
    }

    @Generated
    protected bnns_graph_argument_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public bnns_graph_argument_t(@NUInt long data_ptr_size) {
        super(bnns_graph_argument_t.class);
        setData_ptr_size(data_ptr_size);
    }

    /**
     * < size in bytes of `data_ptr`, if set
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long data_ptr_size();

    /**
     * < size in bytes of `data_ptr`, if set
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setData_ptr_size(@NUInt long value);
}