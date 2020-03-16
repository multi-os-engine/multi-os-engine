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
    public native int ilocalsym();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIlocalsym(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int nlocalsym();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNlocalsym(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int iextdefsym();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setIextdefsym(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int nextdefsym();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setNextdefsym(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int iundefsym();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setIundefsym(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int nundefsym();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setNundefsym(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int tocoff();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setTocoff(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int ntoc();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setNtoc(int value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int modtaboff();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setModtaboff(int value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int nmodtab();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setNmodtab(int value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native int extrefsymoff();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setExtrefsymoff(int value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native int nextrefsyms();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setNextrefsyms(int value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    public native int indirectsymoff();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setIndirectsymoff(int value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native int nindirectsyms();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setNindirectsyms(int value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    public native int extreloff();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setExtreloff(int value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    public native int nextrel();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setNextrel(int value);

    @Generated
    @StructureField(order = 18, isGetter = true)
    public native int locreloff();

    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setLocreloff(int value);

    @Generated
    @StructureField(order = 19, isGetter = true)
    public native int nlocrel();

    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setNlocrel(int value);
}