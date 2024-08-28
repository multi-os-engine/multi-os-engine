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
public final class BNNSLayerParametersQuantization extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersQuantization() {
        super(BNNSLayerParametersQuantization.class);
    }

    @Generated
    protected BNNSLayerParametersQuantization(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long axis_mask();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAxis_mask(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int function();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFunction(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor scale();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setScale(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor bias();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setBias(@ByValue BNNSNDArrayDescriptor value);
}
