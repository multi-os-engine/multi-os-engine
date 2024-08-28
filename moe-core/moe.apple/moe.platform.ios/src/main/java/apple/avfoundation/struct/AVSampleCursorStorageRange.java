package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVSampleCursorStorageRange extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AVSampleCursorStorageRange() {
        super(AVSampleCursorStorageRange.class);
    }

    @Generated
    protected AVSampleCursorStorageRange(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVSampleCursorStorageRange(long offset, long length) {
        super(AVSampleCursorStorageRange.class);
        setOffset(offset);
        setLength(length);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long offset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOffset(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long length();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLength(long value);
}
