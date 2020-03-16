package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_header_64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public mach_header_64() {
        super(mach_header_64.class);
    }

    @Generated
    protected mach_header_64(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int magic();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMagic(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cputype();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCputype(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int cpusubtype();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCpusubtype(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int filetype();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFiletype(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int ncmds();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setNcmds(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int sizeofcmds();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setSizeofcmds(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int flags();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setFlags(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int reserved();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setReserved(int value);
}