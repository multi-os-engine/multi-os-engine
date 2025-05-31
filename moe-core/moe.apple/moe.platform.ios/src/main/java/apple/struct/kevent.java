package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 4)
public final class kevent extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public kevent() {
        super(kevent.class);
    }

    @Generated
    protected kevent(Pointer peer) {
        super(peer);
    }

    /**
     * identifier for this event
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long ident();

    /**
     * identifier for this event
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIdent(@NUInt long value);

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
    @NInt
    public native long data();

    /**
     * filter-specific data
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setData(@NInt long value);

    /**
     * opaque user data identifier
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native VoidPtr udata();

    /**
     * opaque user data identifier
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setUdata(VoidPtr value);
}