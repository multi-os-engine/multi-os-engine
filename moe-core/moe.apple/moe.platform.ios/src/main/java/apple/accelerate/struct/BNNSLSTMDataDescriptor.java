package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class BNNSLSTMDataDescriptor extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLSTMDataDescriptor() {
        super(BNNSLSTMDataDescriptor.class);
    }

    @Generated
    protected BNNSLSTMDataDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSLSTMDataDescriptor(@ByValue BNNSNDArrayDescriptor data_desc, @ByValue BNNSNDArrayDescriptor hidden_desc,
            @ByValue BNNSNDArrayDescriptor cell_state_desc) {
        super(BNNSLSTMDataDescriptor.class);
        setData_desc(data_desc);
        setHidden_desc(hidden_desc);
        setCell_state_desc(cell_state_desc);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor data_desc();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setData_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor hidden_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHidden_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor cell_state_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCell_state_desc(@ByValue BNNSNDArrayDescriptor value);
}