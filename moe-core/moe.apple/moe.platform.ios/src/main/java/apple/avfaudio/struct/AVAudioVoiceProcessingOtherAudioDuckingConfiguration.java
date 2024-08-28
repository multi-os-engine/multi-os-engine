package apple.avfaudio.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class AVAudioVoiceProcessingOtherAudioDuckingConfiguration extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public AVAudioVoiceProcessingOtherAudioDuckingConfiguration() {
        super(AVAudioVoiceProcessingOtherAudioDuckingConfiguration.class);
    }

    @Generated
    protected AVAudioVoiceProcessingOtherAudioDuckingConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVAudioVoiceProcessingOtherAudioDuckingConfiguration(boolean enableAdvancedDucking,
            @NInt long duckingLevel) {
        super(AVAudioVoiceProcessingOtherAudioDuckingConfiguration.class);
        setEnableAdvancedDucking(enableAdvancedDucking);
        setDuckingLevel(duckingLevel);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native boolean enableAdvancedDucking();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setEnableAdvancedDucking(boolean value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NInt
    public native long duckingLevel();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDuckingLevel(@NInt long value);
}