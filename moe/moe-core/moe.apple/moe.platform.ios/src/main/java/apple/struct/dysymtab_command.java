package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class dysymtab_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public dysymtab_command() {
        super(dysymtab_command.class);
    }

    @Generated
    protected dysymtab_command(Pointer peer) {
        super(peer);
    }

    /**
     * LC_DYSYMTAB
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_DYSYMTAB
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * sizeof(struct dysymtab_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * sizeof(struct dysymtab_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * index to local symbols
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int ilocalsym();

    /**
     * index to local symbols
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIlocalsym(int value);

    /**
     * number of local symbols
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int nlocalsym();

    /**
     * number of local symbols
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNlocalsym(int value);

    /**
     * index to externally defined symbols
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int iextdefsym();

    /**
     * index to externally defined symbols
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setIextdefsym(int value);

    /**
     * number of externally defined symbols
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int nextdefsym();

    /**
     * number of externally defined symbols
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setNextdefsym(int value);

    /**
     * index to undefined symbols
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int iundefsym();

    /**
     * index to undefined symbols
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setIundefsym(int value);

    /**
     * number of undefined symbols
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int nundefsym();

    /**
     * number of undefined symbols
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setNundefsym(int value);

    /**
     * file offset to table of contents
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int tocoff();

    /**
     * file offset to table of contents
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setTocoff(int value);

    /**
     * number of entries in table of contents
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int ntoc();

    /**
     * number of entries in table of contents
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setNtoc(int value);

    /**
     * file offset to module table
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int modtaboff();

    /**
     * file offset to module table
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setModtaboff(int value);

    /**
     * number of module table entries
     */
    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int nmodtab();

    /**
     * number of module table entries
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setNmodtab(int value);

    /**
     * offset to referenced symbol table
     */
    @Generated
    @StructureField(order = 12, isGetter = true)
    public native int extrefsymoff();

    /**
     * offset to referenced symbol table
     */
    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setExtrefsymoff(int value);

    /**
     * number of referenced symbol table entries
     */
    @Generated
    @StructureField(order = 13, isGetter = true)
    public native int nextrefsyms();

    /**
     * number of referenced symbol table entries
     */
    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setNextrefsyms(int value);

    /**
     * file offset to the indirect symbol table
     */
    @Generated
    @StructureField(order = 14, isGetter = true)
    public native int indirectsymoff();

    /**
     * file offset to the indirect symbol table
     */
    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setIndirectsymoff(int value);

    /**
     * number of indirect symbol table entries
     */
    @Generated
    @StructureField(order = 15, isGetter = true)
    public native int nindirectsyms();

    /**
     * number of indirect symbol table entries
     */
    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setNindirectsyms(int value);

    /**
     * offset to external relocation entries
     */
    @Generated
    @StructureField(order = 16, isGetter = true)
    public native int extreloff();

    /**
     * offset to external relocation entries
     */
    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setExtreloff(int value);

    /**
     * number of external relocation entries
     */
    @Generated
    @StructureField(order = 17, isGetter = true)
    public native int nextrel();

    /**
     * number of external relocation entries
     */
    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setNextrel(int value);

    /**
     * offset to local relocation entries
     */
    @Generated
    @StructureField(order = 18, isGetter = true)
    public native int locreloff();

    /**
     * offset to local relocation entries
     */
    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setLocreloff(int value);

    /**
     * number of local relocation entries
     */
    @Generated
    @StructureField(order = 19, isGetter = true)
    public native int nlocrel();

    /**
     * number of local relocation entries
     */
    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setNlocrel(int value);
}