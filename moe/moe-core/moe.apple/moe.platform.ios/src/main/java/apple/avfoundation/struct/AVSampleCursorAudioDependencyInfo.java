package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class AVSampleCursorAudioDependencyInfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AVSampleCursorAudioDependencyInfo() {
        super(AVSampleCursorAudioDependencyInfo.class);
    }

    @Generated
    protected AVSampleCursorAudioDependencyInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVSampleCursorAudioDependencyInfo(boolean audioSampleIsIndependentlyDecodable,
            @NInt long audioSamplePacketRefreshCount) {
        super(AVSampleCursorAudioDependencyInfo.class);
        setAudioSampleIsIndependentlyDecodable(audioSampleIsIndependentlyDecodable);
        setAudioSamplePacketRefreshCount(audioSamplePacketRefreshCount);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native boolean audioSampleIsIndependentlyDecodable();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAudioSampleIsIndependentlyDecodable(boolean value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NInt
    public native long audioSamplePacketRefreshCount();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAudioSamplePacketRefreshCount(@NInt long value);
}
