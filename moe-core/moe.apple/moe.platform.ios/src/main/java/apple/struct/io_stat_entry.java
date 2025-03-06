package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class io_stat_entry extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public io_stat_entry() {
        super(io_stat_entry.class);
    }

    @Generated
    protected io_stat_entry(Pointer peer) {
        super(peer);
    }

    @Generated
    public io_stat_entry(long count, long size) {
        super(io_stat_entry.class);
        setCount(count);
        setSize(size);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long count();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCount(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(long value);
}