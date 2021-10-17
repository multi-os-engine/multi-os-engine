package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class BNNSLayerParametersEmbedding extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersEmbedding() {
        super(BNNSLayerParametersEmbedding.class);
    }

    @Generated
    protected BNNSLayerParametersEmbedding(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int flags();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFlags(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor dictionary();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDictionary(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long padding_idx();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setPadding_idx(@NUInt long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float max_norm();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMax_norm(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float norm_type();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setNorm_type(float value);
}
