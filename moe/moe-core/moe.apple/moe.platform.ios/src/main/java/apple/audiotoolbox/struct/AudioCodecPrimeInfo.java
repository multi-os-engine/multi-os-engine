package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioCodecPrimeInfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioCodecPrimeInfo() {
        super(AudioCodecPrimeInfo.class);
    }

    @Generated
    protected AudioCodecPrimeInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioCodecPrimeInfo(int leadingFrames, int trailingFrames) {
        super(AudioCodecPrimeInfo.class);
        setLeadingFrames(leadingFrames);
        setTrailingFrames(trailingFrames);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int leadingFrames();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setLeadingFrames(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int trailingFrames();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTrailingFrames(int value);
}