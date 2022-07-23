package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVAudioSessionIOType
 * <p>
 * Values to be used by setAggregatedIOPreference:error: method.
 * <p>
 * Starting in iOS 10, applications that use AVCaptureSession on iPads and iPhones that
 * support taking Live Photos, will have non-aggregated audio I/O unless the app opts out by
 * setting its AVAudioSessionIOType to Aggregated. Non-aggregated audio I/O means that separate
 * threads will be used to service audio I/O for input and output directions.
 * <p>
 * Note that in cases where the I/O is not aggregated, the sample rate and IO buffer duration
 * properties will map to the output audio device. In this scenario, the input and
 * output audio hardware may be running at different sample rates and with different IO buffer
 * durations. If your app requires input and output audio to be presented in the same realtime
 * I/O callback, or requires that input and output audio have the same sample rate or IO buffer
 * duration, or if your app requires the ability to set a preferred sample rate or IO buffer duration
 * for audio input, set the AVAudioSessionIOType to Aggregated.
 * <p>
 * Apps that don't use AVCaptureSession and use AVAudioSessionCategoryPlayAndRecord will continue
 * to have aggregated audio I/O, as in previous versions of iOS.
 * <p>
 * [@var] AVAudioSessionIOTypeNotSpecified
 * The default value. If your app does not use AVCaptureSession or does not have any specific
 * requirement for aggregating input and output audio in the same realtime I/O callback, use this
 * value. Note that if your app does not use AVCaptureSession, it will get aggregated I/O when using
 * AVAudioSessionCategoryPlayAndRecord.
 * <p>
 * If your app does utilize AVCaptureSession, use of this value will allow AVCaptureSession to
 * start recording without glitching already running output audio and will allow the system to
 * utilize power-saving optimizations.
 * <p>
 * [@var] AVAudioSessionIOTypeAggregated
 * Use this value if your session uses AVAudioSessionCategoryPlayAndRecord and requires input and
 * output audio to be presented in the same realtime I/O callback. For example, if your app will be using
 * a RemoteIO with both input and output enabled.
 * <p>
 * Note that your session's preference to use aggregated IO will not be honored if it specifies
 * AVAudioSessionCategoryOptionMixWithOthers AND another app's audio session was already active
 * with non-mixable, non-aggregated input/output.
 * <p>
 * Added in iOS 10.0. Not applicable on watchos, tvos, macos.
 */
@Generated
public final class AVAudioSessionIOType {
    @Generated
    private AVAudioSessionIOType() {
    }

    @Generated @NUInt public static final long NotSpecified = 0x0000000000000000L;
    @Generated @NUInt public static final long Aggregated = 0x0000000000000001L;
}
