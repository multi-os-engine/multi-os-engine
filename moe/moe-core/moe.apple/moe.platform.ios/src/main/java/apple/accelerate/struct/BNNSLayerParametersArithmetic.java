package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class BNNSLayerParametersArithmetic extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersArithmetic() {
        super(BNNSLayerParametersArithmetic.class);
    }

    @Generated
    protected BNNSLayerParametersArithmetic(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSLayerParametersArithmetic(int arithmetic_function, VoidPtr arithmetic_function_fields,
            @ByValue BNNSActivation activation) {
        super(BNNSLayerParametersArithmetic.class);
        setArithmetic_function(arithmetic_function);
        setArithmetic_function_fields(arithmetic_function_fields);
        setActivation(activation);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int arithmetic_function();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setArithmetic_function(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr arithmetic_function_fields();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setArithmetic_function_fields(VoidPtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSActivation activation();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setActivation(@ByValue BNNSActivation value);
}