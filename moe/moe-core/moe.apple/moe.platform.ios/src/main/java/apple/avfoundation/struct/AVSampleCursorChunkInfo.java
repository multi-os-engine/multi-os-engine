package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVSampleCursorChunkInfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AVSampleCursorChunkInfo() {
        super(AVSampleCursorChunkInfo.class);
    }

    @Generated
    protected AVSampleCursorChunkInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVSampleCursorChunkInfo(long chunkSampleCount, boolean chunkHasUniformSampleSizes,
            boolean chunkHasUniformSampleDurations, boolean chunkHasUniformFormatDescriptions) {
        super(AVSampleCursorChunkInfo.class);
        setChunkSampleCount(chunkSampleCount);
        setChunkHasUniformSampleSizes(chunkHasUniformSampleSizes);
        setChunkHasUniformSampleDurations(chunkHasUniformSampleDurations);
        setChunkHasUniformFormatDescriptions(chunkHasUniformFormatDescriptions);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long chunkSampleCount();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setChunkSampleCount(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native boolean chunkHasUniformSampleSizes();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setChunkHasUniformSampleSizes(boolean value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native boolean chunkHasUniformSampleDurations();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setChunkHasUniformSampleDurations(boolean value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native boolean chunkHasUniformFormatDescriptions();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setChunkHasUniformFormatDescriptions(boolean value);
}
