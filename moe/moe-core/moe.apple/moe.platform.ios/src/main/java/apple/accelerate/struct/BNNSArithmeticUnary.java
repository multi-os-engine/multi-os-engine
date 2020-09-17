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
public final class BNNSArithmeticUnary extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSArithmeticUnary() {
        super(BNNSArithmeticUnary.class);
    }

    @Generated
    protected BNNSArithmeticUnary(Pointer peer) {
        super(peer);
    }

    @Generated
    public BNNSArithmeticUnary(@ByValue BNNSNDArrayDescriptor in, int in_type, @ByValue BNNSNDArrayDescriptor out,
            int out_type) {
        super(BNNSArithmeticUnary.class);
        setIn(in);
        setIn_type(in_type);
        setOut(out);
        setOut_type(out_type);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor in();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIn(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int in_type();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIn_type(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor out();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setOut(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int out_type();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setOut_type(int value);
}