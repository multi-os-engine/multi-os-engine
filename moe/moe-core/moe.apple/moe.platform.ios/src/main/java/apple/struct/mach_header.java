package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_header extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public mach_header() {
        super(mach_header.class);
    }

    @Generated
    protected mach_header(Pointer peer) {
        super(peer);
    }

    /**
     * mach magic number identifier
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int magic();

    /**
     * mach magic number identifier
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMagic(int value);

    /**
     * cpu specifier
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cputype();

    /**
     * cpu specifier
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCputype(int value);

    /**
     * machine specifier
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int cpusubtype();

    /**
     * machine specifier
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCpusubtype(int value);

    /**
     * type of file
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int filetype();

    /**
     * type of file
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFiletype(int value);

    /**
     * number of load commands
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int ncmds();

    /**
     * number of load commands
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setNcmds(int value);

    /**
     * the size of all the load commands
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int sizeofcmds();

    /**
     * the size of all the load commands
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setSizeofcmds(int value);

    /**
     * flags
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int flags();

    /**
     * flags
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setFlags(int value);
}