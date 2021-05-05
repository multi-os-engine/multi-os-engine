package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVAudioSpatializationFormats
 * 
 * 	These constants can be used to specify values for allowedAudioSpatializationFormats.
 * 
 *  [@constant]	 AVAudioSpatializationFormatNone
 * 	Indicates that no audio spatialization is allowed.
 *  [@constant]	 AVAudioSpatializationFormatMonoAndStereo
 * 	Indicates that only mono and stereo formats may be used for audio spatialization.
 *  [@constant]	 AVAudioSpatializationFormatMultichannel
 * 	Indicates that only multichannel layouts may be used for audio spatialization.
 *  [@constant]	 AVAudioSpatializationFormatMonoStereoAndMultichannel
 * 	Indicates that mono, stereo and multichannel layouts may be used for audio spatialization.
 */
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