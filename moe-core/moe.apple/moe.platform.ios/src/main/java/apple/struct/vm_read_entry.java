package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure(alignment = 4)
public final class vm_read_entry extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_read_entry() {
        super(vm_read_entry.class);
    }

    @Generated
    protected vm_read_entry(Pointer peer) {
        super(peer);
    }

    @Generated
    public vm_read_entry(@NUInt long address, @NUInt long size) {
        super(vm_read_entry.class);
        setAddress(address);
        setSize(size);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long address();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAddress(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(@NUInt long value);
}