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
public final class BNNSLSTMGateDescriptor extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLSTMGateDescriptor() {
        super(BNNSLSTMGateDescriptor.class);
    }

    @Generated
    protected BNNSLSTMGateDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 2)
    @ByValue
    public native BNNSNDArrayDescriptor iw_desc(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 2)
    public native void setIw_desc(@ByValue BNNSNDArrayDescriptor value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor hw_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHw_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor cw_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCw_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor b_desc();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setB_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSActivation activation();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setActivation(@ByValue BNNSActivation value);
}