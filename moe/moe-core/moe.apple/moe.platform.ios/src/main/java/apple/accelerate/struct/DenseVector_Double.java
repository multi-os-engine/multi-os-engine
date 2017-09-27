package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.DoublePtr;

@Generated
@Structure()
public final class DenseVector_Double extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public DenseVector_Double() {
        super(DenseVector_Double.class);
    }

    @Generated
    protected DenseVector_Double(Pointer peer) {
        super(peer);
    }

    @Generated
    public DenseVector_Double(int count, DoublePtr data) {
        super(DenseVector_Double.class);
        setCount(count);
        setData(data);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int count();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCount(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native DoublePtr data();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setData(DoublePtr value);
}