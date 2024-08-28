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
public final class BNNSMHAProjectionParameters extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSMHAProjectionParameters() {
        super(BNNSMHAProjectionParameters.class);
    }

    @Generated
    protected BNNSMHAProjectionParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSMHAProjectionParameters(@ByValue BNNSNDArrayDescriptor target_desc,
            @ByValue BNNSNDArrayDescriptor weights, @ByValue BNNSNDArrayDescriptor bias) {
        super(BNNSMHAProjectionParameters.class);
        setTarget_desc(target_desc);
        setWeights(weights);
        setBias(bias);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor target_desc();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTarget_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor weights();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setWeights(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor bias();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBias(@ByValue BNNSNDArrayDescriptor value);
}