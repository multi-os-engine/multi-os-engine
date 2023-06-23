package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_vm_range extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_vm_range() {
        super(mach_vm_range.class);
    }

    @Generated
    protected mach_vm_range(Pointer peer) {
        super(peer);
    }

    @Generated
    public mach_vm_range(long min_address, long max_address) {
        super(mach_vm_range.class);
        setMin_address(min_address);
        setMax_address(max_address);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long min_address();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMin_address(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long max_address();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMax_address(long value);
}