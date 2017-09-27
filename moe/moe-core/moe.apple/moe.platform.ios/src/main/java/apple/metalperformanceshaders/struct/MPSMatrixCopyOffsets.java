package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSMatrixCopyOffsets extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSMatrixCopyOffsets() {
        super(MPSMatrixCopyOffsets.class);
    }

    @Generated
    protected MPSMatrixCopyOffsets(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSMatrixCopyOffsets(int sourceRowOffset, int sourceColumnOffset, int destinationRowOffset,
            int destinationColumnOffset) {
        super(MPSMatrixCopyOffsets.class);
        setSourceRowOffset(sourceRowOffset);
        setSourceColumnOffset(sourceColumnOffset);
        setDestinationRowOffset(destinationRowOffset);
        setDestinationColumnOffset(destinationColumnOffset);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int sourceRowOffset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSourceRowOffset(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int sourceColumnOffset();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSourceColumnOffset(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int destinationRowOffset();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDestinationRowOffset(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int destinationColumnOffset();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDestinationColumnOffset(int value);
}