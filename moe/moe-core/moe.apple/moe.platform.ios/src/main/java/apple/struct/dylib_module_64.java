package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class dylib_module_64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public dylib_module_64() {
        super(dylib_module_64.class);
    }

    @Generated
    protected dylib_module_64(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int module_name();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setModule_name(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int iextdefsym();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIextdefsym(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int nextdefsym();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setNextdefsym(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int irefsym();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIrefsym(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int nrefsym();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setNrefsym(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int ilocalsym();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIlocalsym(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int nlocalsym();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setNlocalsym(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int iextrel();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setIextrel(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int nextrel();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setNextrel(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int iinit_iterm();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setIinit_iterm(int value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int ninit_nterm();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setNinit_nterm(int value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int objc_module_info_size();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setObjc_module_info_size(int value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native long objc_module_info_addr();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setObjc_module_info_addr(long value);
}