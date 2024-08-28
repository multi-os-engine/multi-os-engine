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
public final class BNNSLayerParametersLossBase extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersLossBase() {
        super(BNNSLayerParametersLossBase.class);
    }

    @Generated
    protected BNNSLayerParametersLossBase(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSLayerParametersLossBase(int function, @ByValue BNNSNDArrayDescriptor i_desc,
            @ByValue BNNSNDArrayDescriptor o_desc, int reduction) {
        super(BNNSLayerParametersLossBase.class);
        setFunction(function);
        setI_desc(i_desc);
        setO_desc(o_desc);
        setReduction(reduction);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int function();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFunction(int value);

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
    public native int reduction();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setReduction(int value);
}