package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

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
    public mach_vm_range(@NUInt long min_address, @NUInt long max_address) {
        super(mach_vm_range.class);
        setMin_address(min_address);
        setMax_address(max_address);
    }

    @NUInt
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long min_address();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMin_address(@NUInt long value);

    @NUInt
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long max_address();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMax_address(@NUInt long value);
}