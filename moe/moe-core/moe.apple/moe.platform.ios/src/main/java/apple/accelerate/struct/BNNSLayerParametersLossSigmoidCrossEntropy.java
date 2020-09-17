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
public final class BNNSLayerParametersLossSigmoidCrossEntropy extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersLossSigmoidCrossEntropy() {
        super(BNNSLayerParametersLossSigmoidCrossEntropy.class);
    }

    @Generated
    protected BNNSLayerParametersLossSigmoidCrossEntropy(Pointer peer) {
        super(peer);
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

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float label_smooth();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setLabel_smooth(float value);
}