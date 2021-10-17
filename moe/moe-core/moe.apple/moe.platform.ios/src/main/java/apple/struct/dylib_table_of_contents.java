package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class dylib_table_of_contents extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public dylib_table_of_contents() {
        super(dylib_table_of_contents.class);
    }

    @Generated
    protected dylib_table_of_contents(Pointer peer) {
        super(peer);
    }

    @Generated
    public dylib_table_of_contents(int symbol_index, int module_index) {
        super(dylib_table_of_contents.class);
        setSymbol_index(symbol_index);
        setModule_index(module_index);
    }

    /**
     * the defined external symbol
     * (index into the symbol table)
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int symbol_index();

    /**
     * the defined external symbol
     * (index into the symbol table)
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSymbol_index(int value);

    /**
     * index into the module table this symbol
     * is defined in
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int module_index();

    /**
     * index into the module table this symbol
     * is defined in
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setModule_index(int value);
}
