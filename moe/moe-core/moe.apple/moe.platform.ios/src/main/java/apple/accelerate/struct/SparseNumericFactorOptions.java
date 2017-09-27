package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class SparseNumericFactorOptions extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public SparseNumericFactorOptions() {
        super(SparseNumericFactorOptions.class);
    }

    @Generated
    protected SparseNumericFactorOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int control();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setControl(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte scalingMethod();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setScalingMethod(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr scaling();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setScaling(VoidPtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native double pivotTolerance();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPivotTolerance(double value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native double zeroTolerance();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setZeroTolerance(double value);
}