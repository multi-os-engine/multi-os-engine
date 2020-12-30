package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSMatrixOffset extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSMatrixOffset() {
        super(MPSMatrixOffset.class);
    }

    @Generated
    protected MPSMatrixOffset(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSMatrixOffset(int rowOffset, int columnOffset) {
        super(MPSMatrixOffset.class);
        setRowOffset(rowOffset);
        setColumnOffset(columnOffset);
    }

    /**
     * < offset to start of source region to read in rows
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int rowOffset();

    /**
     * < offset to start of source region to read in rows
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRowOffset(int value);

    /**
     * < offset to start of source region to read in columns
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int columnOffset();

    /**
     * < offset to start of source region to read in columns
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setColumnOffset(int value);
}