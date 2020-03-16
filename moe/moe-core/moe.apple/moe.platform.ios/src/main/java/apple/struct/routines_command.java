package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class routines_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public routines_command() {
        super(routines_command.class);
    }

    @Generated
    protected routines_command(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int init_address();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInit_address(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int init_module();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setInit_module(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int reserved1();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setReserved1(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int reserved2();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setReserved2(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int reserved3();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setReserved3(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int reserved4();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setReserved4(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int reserved5();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setReserved5(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int reserved6();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setReserved6(int value);
}