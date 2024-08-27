package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AUVoiceIOOtherAudioDuckingConfiguration extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public AUVoiceIOOtherAudioDuckingConfiguration() {
        super(AUVoiceIOOtherAudioDuckingConfiguration.class);
    }

    @Generated
    protected AUVoiceIOOtherAudioDuckingConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    public AUVoiceIOOtherAudioDuckingConfiguration(byte mEnableAdvancedDucking, int mDuckingLevel) {
        super(AUVoiceIOOtherAudioDuckingConfiguration.class);
        setMEnableAdvancedDucking(mEnableAdvancedDucking);
        setMDuckingLevel(mDuckingLevel);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte mEnableAdvancedDucking();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMEnableAdvancedDucking(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mDuckingLevel();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMDuckingLevel(int value);
}