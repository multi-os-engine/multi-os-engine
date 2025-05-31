package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class kevent64_s extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public kevent64_s() {
        super(kevent64_s.class);
    }

    @Generated
    protected kevent64_s(Pointer peer) {
        super(peer);
    }

    /**
     * identifier for this event
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long ident();

    /**
     * identifier for this event
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIdent(long value);

    /**
     * filter for event
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native short filter();

    /**
     * filter for event
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFilter(short value);

    /**
     * general flags
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char flags();

    /**
     * general flags
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFlags(char value);

    /**
     * filter-specific flags
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int fflags();

    /**
     * filter-specific flags
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFflags(int value);

    /**
     * filter-specific data
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long data();

    /**
     * filter-specific data
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setData(long value);

    /**
     * opaque user data identifier
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long udata();

    /**
     * opaque user data identifier
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setUdata(long value);

    /**
     * filter-specific extensions
     */
    @Generated
    @StructureField(order = 6, isGetter = true, count = 2)
    public native long ext(int field_idx);

    /**
     * filter-specific extensions
     */
    @Generated
    @StructureField(order = 6, isGetter = false, count = 2)
    public native void setExt(long value, int field_idx);
}