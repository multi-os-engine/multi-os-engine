package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class segment_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public segment_command() {
        super(segment_command.class);
    }

    @Generated
    protected segment_command(Pointer peer) {
        super(peer);
    }

    /**
     * LC_SEGMENT
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_SEGMENT
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * includes sizeof section structs
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * includes sizeof section structs
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * segment name
     */
    @Generated
    @StructureField(order = 2, isGetter = true, count = 16)
    public native byte segname(int field_idx);

    /**
     * segment name
     */
    @Generated
    @StructureField(order = 2, isGetter = false, count = 16)
    public native void setSegname(byte value, int field_idx);

    /**
     * memory address of this segment
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int vmaddr();

    /**
     * memory address of this segment
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setVmaddr(int value);

    /**
     * memory size of this segment
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int vmsize();

    /**
     * memory size of this segment
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setVmsize(int value);

    /**
     * file offset of this segment
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int fileoff();

    /**
     * file offset of this segment
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setFileoff(int value);

    /**
     * amount to map from the file
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int filesize();

    /**
     * amount to map from the file
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setFilesize(int value);

    /**
     * maximum VM protection
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int maxprot();

    /**
     * maximum VM protection
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMaxprot(int value);

    /**
     * initial VM protection
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int initprot();

    /**
     * initial VM protection
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setInitprot(int value);

    /**
     * number of sections in segment
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int nsects();

    /**
     * number of sections in segment
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setNsects(int value);

    /**
     * flags
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int flags();

    /**
     * flags
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setFlags(int value);
}