package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class AVAudioSpatializationFormats {
    @Generated
    private AVAudioSpatializationFormats() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long MonoAndStereo = 0x0000000000000003L;
    @Generated @NUInt public static final long Multichannel = 0x0000000000000004L;
    @Generated @NUInt public static final long MonoStereoAndMultichannel = 0x0000000000000007L;
}