package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class dylib_module extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public dylib_module() {
        super(dylib_module.class);
    }

    @Generated
    protected dylib_module(Pointer peer) {
        super(peer);
    }

    /**
     * the module name (index into string table)
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int module_name();

    /**
     * the module name (index into string table)
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setModule_name(int value);

    /**
     * index into externally defined symbols
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int iextdefsym();

    /**
     * index into externally defined symbols
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIextdefsym(int value);

    /**
     * number of externally defined symbols
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int nextdefsym();

    /**
     * number of externally defined symbols
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setNextdefsym(int value);

    /**
     * index into reference symbol table
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int irefsym();

    /**
     * index into reference symbol table
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIrefsym(int value);

    /**
     * number of reference symbol table entries
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int nrefsym();

    /**
     * number of reference symbol table entries
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setNrefsym(int value);

    /**
     * index into symbols for local symbols
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int ilocalsym();

    /**
     * index into symbols for local symbols
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIlocalsym(int value);

    /**
     * number of local symbols
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int nlocalsym();

    /**
     * number of local symbols
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setNlocalsym(int value);

    /**
     * index into external relocation entries
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int iextrel();

    /**
     * index into external relocation entries
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setIextrel(int value);

    /**
     * number of external relocation entries
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int nextrel();

    /**
     * number of external relocation entries
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setNextrel(int value);

    /**
     * low 16 bits are the index into the init
     * section, high 16 bits are the index into
     * the term section
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int iinit_iterm();

    /**
     * low 16 bits are the index into the init
     * section, high 16 bits are the index into
     * the term section
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setIinit_iterm(int value);

    /**
     * low 16 bits are the number of init section
     * entries, high 16 bits are the number of
     * term section entries
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int ninit_nterm();

    /**
     * low 16 bits are the number of init section
     * entries, high 16 bits are the number of
     * term section entries
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setNinit_nterm(int value);

    /**
     * the (__OBJC,__module_info) section
     */
    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int objc_module_info_addr();

    /**
     * the (__OBJC,__module_info) section
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setObjc_module_info_addr(int value);

    /**
     * the (__OBJC,__module_info) section
     */
    @Generated
    @StructureField(order = 12, isGetter = true)
    public native int objc_module_info_size();

    /**
     * the (__OBJC,__module_info) section
     */
    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setObjc_module_info_size(int value);
}
