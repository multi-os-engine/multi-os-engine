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
public final class BNNSArithmeticBinary extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSArithmeticBinary() {
        super(BNNSArithmeticBinary.class);
    }

    @Generated
    protected BNNSArithmeticBinary(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor in1();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIn1(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int in1_type();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIn1_type(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor in2();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIn2(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int in2_type();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIn2_type(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor out();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setOut(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int out_type();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setOut_type(int value);
}