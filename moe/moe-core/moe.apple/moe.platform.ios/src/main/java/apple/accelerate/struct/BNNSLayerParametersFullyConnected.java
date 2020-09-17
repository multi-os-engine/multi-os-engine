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
public final class BNNSLayerParametersFullyConnected extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersFullyConnected() {
        super(BNNSLayerParametersFullyConnected.class);
    }

    @Generated
    protected BNNSLayerParametersFullyConnected(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor w_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setW_desc(@ByValue BNNSNDArrayDescriptor value);

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
    public native BNNSNDArrayDescriptor bias();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBias(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSActivation activation();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setActivation(@ByValue BNNSActivation value);
}