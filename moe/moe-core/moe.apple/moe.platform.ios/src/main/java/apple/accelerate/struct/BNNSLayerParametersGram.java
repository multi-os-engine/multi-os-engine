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
public final class BNNSLayerParametersGram extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersGram() {
        super(BNNSLayerParametersGram.class);
    }

    @Generated
    protected BNNSLayerParametersGram(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSLayerParametersGram(float alpha, @ByValue BNNSNDArrayDescriptor i_desc,
            @ByValue BNNSNDArrayDescriptor o_desc) {
        super(BNNSLayerParametersGram.class);
        setAlpha(alpha);
        setI_desc(i_desc);
        setO_desc(o_desc);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float alpha();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAlpha(float value);

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
}