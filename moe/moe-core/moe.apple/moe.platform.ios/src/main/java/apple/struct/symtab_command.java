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

    /**
     * LC_SYMTAB
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_SYMTAB
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * sizeof(struct symtab_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * sizeof(struct symtab_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * symbol table offset
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int symoff();

    /**
     * symbol table offset
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSymoff(int value);

    /**
     * number of symbol table entries
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int nsyms();

    /**
     * number of symbol table entries
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNsyms(int value);

    /**
     * string table offset
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int stroff();

    /**
     * string table offset
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setStroff(int value);

    /**
     * string table size in bytes
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int strsize();

    /**
     * string table size in bytes
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setStrsize(int value);
}