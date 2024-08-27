package apple.foundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class NSHashEnumerator extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public NSHashEnumerator() {
        super(NSHashEnumerator.class);
    }

    @Generated
    protected NSHashEnumerator(Pointer peer) {
        super(peer);
    }

    @Generated
    public NSHashEnumerator(@NUInt long _pi, @NUInt long _si, @Nullable VoidPtr _bs) {
        super(NSHashEnumerator.class);
        set_pi(_pi);
        set_si(_si);
        set_bs(_bs);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long _pi();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set_pi(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long _si();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void set_si(@NUInt long value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr _bs();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void set_bs(@Nullable VoidPtr value);
}