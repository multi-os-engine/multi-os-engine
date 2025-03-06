package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_purgeable_stat extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_purgeable_stat() {
        super(vm_purgeable_stat.class);
    }

    @Generated
    protected vm_purgeable_stat(Pointer peer) {
        super(peer);
    }

    @Generated
    public vm_purgeable_stat(long count, long size) {
        super(vm_purgeable_stat.class);
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