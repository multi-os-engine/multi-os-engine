package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.jetbrains.annotations.NotNull;

@Generated
@Structure()
public final class BNNSLayerParametersTensorContraction extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersTensorContraction() {
        super(BNNSLayerParametersTensorContraction.class);
    }

    @Generated
    protected BNNSLayerParametersTensorContraction(Pointer peer) {
        super(peer);
    }

    @NotNull
    @Generated
    @StructureField(order = 0, isGetter = true)
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public native String operation();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOperation(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float alpha();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAlpha(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float beta();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBeta(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor iA_desc();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIA_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor iB_desc();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setIB_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);
}