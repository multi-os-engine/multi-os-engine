package apple.accelerate.struct;

import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class BNNSTensor extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public BNNSTensor() {
        super(BNNSTensor.class);
    }

    @Generated
    protected BNNSTensor(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int data_type();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setData_type(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte rank();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRank(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 8)
    public native long shape(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 8)
    public native void setShape(long value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 8)
    public native long stride(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 8)
    public native void setStride(long value, int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @Nullable
    public native VoidPtr data();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setData(@Nullable VoidPtr value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NUInt
    public native long data_size_in_bytes();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setData_size_in_bytes(@NUInt long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Nullable
    public native String name();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setName(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Nullable String value);
}