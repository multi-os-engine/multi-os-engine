package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.FloatPtr;
import org.jetbrains.annotations.NotNull;

@Generated
@Structure()
public final class DenseVector_Float extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public DenseVector_Float() {
        super(DenseVector_Float.class);
    }

    @Generated
    protected DenseVector_Float(Pointer peer) {
        super(peer);
    }

    @Generated
    public DenseVector_Float(int count, @NotNull FloatPtr data) {
        super(DenseVector_Float.class);
        setCount(count);
        setData(data);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int count();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCount(int value);

    @NotNull
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native FloatPtr data();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setData(@NotNull FloatPtr value);
}