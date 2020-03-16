package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class MPSDimensionSlice extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSDimensionSlice() {
        super(MPSDimensionSlice.class);
    }

    @Generated
    protected MPSDimensionSlice(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSDimensionSlice(@NUInt long start, @NUInt long length) {
        super(MPSDimensionSlice.class);
        setStart(start);
        setLength(length);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long start();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setStart(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long length();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLength(@NUInt long value);
}