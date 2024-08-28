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
public final class BNNSLayerParametersMultiheadAttention extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersMultiheadAttention() {
        super(BNNSLayerParametersMultiheadAttention.class);
    }

    @Generated
    protected BNNSLayerParametersMultiheadAttention(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSMHAProjectionParameters query();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setQuery(@ByValue BNNSMHAProjectionParameters value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSMHAProjectionParameters key();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setKey(@ByValue BNNSMHAProjectionParameters value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSMHAProjectionParameters value();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setValue(@ByValue BNNSMHAProjectionParameters value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native boolean add_zero_attn();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAdd_zero_attn(boolean value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor key_attn_bias();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setKey_attn_bias(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor value_attn_bias();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setValue_attn_bias(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @ByValue
    public native BNNSMHAProjectionParameters output();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setOutput(@ByValue BNNSMHAProjectionParameters value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native float dropout();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setDropout(float value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int seed();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setSeed(int value);
}