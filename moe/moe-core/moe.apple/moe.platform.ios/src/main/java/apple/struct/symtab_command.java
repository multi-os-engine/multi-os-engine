package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class symtab_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public symtab_command() {
        super(symtab_command.class);
    }

    @Generated
    protected symtab_command(Pointer peer) {
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
    public native int symoff();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSymoff(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int nsyms();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNsyms(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int stroff();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setStroff(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int strsize();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setStrsize(int value);
}