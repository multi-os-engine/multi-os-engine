package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class BNNSSparsityParameters extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public BNNSSparsityParameters() {
        super(BNNSSparsityParameters.class);
    }

    @Generated
    protected BNNSSparsityParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long flags();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFlags(long value);

    /**
     * numerator(sparsity_ratio[0]) and denominator(sparsity_ratio[1])indicating sparsity ratio. numerator must be less
     * than denominator.
     */
    @Generated
    @StructureField(order = 1, isGetter = true, count = 2)
    public native int sparsity_ratio(int field_idx);

    /**
     * numerator(sparsity_ratio[0]) and denominator(sparsity_ratio[1])indicating sparsity ratio. numerator must be less
     * than denominator.
     */
    @Generated
    @StructureField(order = 1, isGetter = false, count = 2)
    public native void setSparsity_ratio(int value, int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int sparsity_type();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSparsity_type(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int target_system();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTarget_system(int value);
}