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
public final class BNNSLayerParametersBroadcastMatMul extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersBroadcastMatMul() {
        super(BNNSLayerParametersBroadcastMatMul.class);
    }

    @Generated
    protected BNNSLayerParametersBroadcastMatMul(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float alpha();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAlpha(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float beta();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBeta(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native boolean transA();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTransA(boolean value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native boolean transB();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTransB(boolean value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native boolean quadratic();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setQuadratic(boolean value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native boolean a_is_weights();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setA_is_weights(boolean value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native boolean b_is_weights();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setB_is_weights(boolean value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor iA_desc();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setIA_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor iB_desc();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setIB_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);
}