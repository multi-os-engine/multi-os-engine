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
public final class BNNSLayerParametersActivation extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersActivation() {
        super(BNNSLayerParametersActivation.class);
    }

    @Generated
    protected BNNSLayerParametersActivation(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSLayerParametersActivation(@ByValue BNNSNDArrayDescriptor i_desc, @ByValue BNNSNDArrayDescriptor o_desc,
            @ByValue BNNSActivation activation, int axis_flags) {
        super(BNNSLayerParametersActivation.class);
        setI_desc(i_desc);
        setO_desc(o_desc);
        setActivation(activation);
        setAxis_flags(axis_flags);
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
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSActivation activation();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setActivation(@ByValue BNNSActivation value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int axis_flags();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAxis_flags(int value);
}