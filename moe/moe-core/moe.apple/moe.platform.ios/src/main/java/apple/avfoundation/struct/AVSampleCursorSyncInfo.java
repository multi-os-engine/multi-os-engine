package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVSampleCursorSyncInfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AVSampleCursorSyncInfo() {
        super(AVSampleCursorSyncInfo.class);
    }

    @Generated
    protected AVSampleCursorSyncInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVSampleCursorSyncInfo(boolean sampleIsFullSync, boolean sampleIsPartialSync, boolean sampleIsDroppable) {
        super(AVSampleCursorSyncInfo.class);
        setSampleIsFullSync(sampleIsFullSync);
        setSampleIsPartialSync(sampleIsPartialSync);
        setSampleIsDroppable(sampleIsDroppable);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native boolean sampleIsFullSync();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSampleIsFullSync(boolean value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native boolean sampleIsPartialSync();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSampleIsPartialSync(boolean value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native boolean sampleIsDroppable();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSampleIsDroppable(boolean value);
}
