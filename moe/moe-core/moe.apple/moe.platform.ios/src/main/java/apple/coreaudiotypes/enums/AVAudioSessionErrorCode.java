package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]		AVAudioSessionErrorCode
 * <p>
 * Error codes returned from the AVAudioSession API.
 * [@var]        AVAudioSessionErrorCodeNone
 * Operation succeeded.
 * [@var]        AVAudioSessionErrorCodeMediaServicesFailed
 * The app attempted to use the audio session during or after a Media Services failure.  App
 * should wait for a AVAudioSessionMediaServicesWereResetNotification and then rebuild all
 * its state.
 * [@var]        AVAudioSessionErrorCodeIsBusy
 * The app attempted to set its audio session inactive or change its AVAudioSessionIOType,
 * but it is still actively playing and/or recording.
 * [@var]        AVAudioSessionErrorCodeIncompatibleCategory
 * The app tried to perform an operation on a session but its category does not support it.
 * For instance, if the app calls setPreferredInputNumberOfChannels: while in a playback-only
 * category.
 * [@var]        AVAudioSessionErrorCodeCannotInterruptOthers
 * The app's audio session is non-mixable and trying to go active while in the background.
 * This is allowed only when the app is the NowPlaying app.
 * [@var]        AVAudioSessionErrorCodeMissingEntitlement
 * The app does not have the required entitlements to perform an operation.
 * [@var]        AVAudioSessionErrorCodeSiriIsRecording
 * The app tried to do something with the audio session that is not allowed while Siri is
 * recording.
 * [@var]        AVAudioSessionErrorCodeCannotStartPlaying
 * The app is not allowed to start recording and/or playing, usually because of a lack of audio
 * key in its Info.plist.  This could also happen if the app has this key but uses a category
 * that can't record and/or play in the background (AVAudioSessionCategoryAmbient,
 * AVAudioSessionCategorySoloAmbient, etc.).
 * [@var]        AVAudioSessionErrorCodeCannotStartRecording
 * The app is not allowed to start recording, usually because it is starting a mixable
 * recording from the background and is not an Inter-App Audio app.
 * [@var]        AVAudioSessionErrorCodeBadParam
 * An illegal value was used for a property.
 * [@var]        AVAudioSessionErrorInsufficientPriority
 * The app was not allowed to set the audio category because another app (Phone, etc.) is
 * controlling it.
 * [@var]        AVAudioSessionErrorCodeResourceNotAvailable
 * The operation failed because the device does not have sufficient hardware resources to
 * complete the action. For example, the operation requires audio input hardware, but the
 * device has no audio input available.
 * [@var]         AVAudioSessionErrorCodeExpiredSession
 * The operation failed because the associated session has been destroyed.
 * [@var]        AVAudioSessionErrorCodeUnspecified
 * An unspecified error has occurred.
 * [@var]		AVAudioSessionErrorCodeSessionNotActive
 * The operation failed because the session is not active.
 */
@Generated
public final class AVAudioSessionErrorCode {
    @Generated
    private AVAudioSessionErrorCode() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * 0x6D737276, 1836282486
     */
    @Generated @NInt public static final long MediaServicesFailed = 0x000000006D737276L;
    /**
     * 0x21616374, 560030580
     */
    @Generated @NInt public static final long IsBusy = 0x0000000021616374L;
    /**
     * 0x21636174, 560161140
     */
    @Generated @NInt public static final long IncompatibleCategory = 0x0000000021636174L;
    /**
     * 0x21696E74, 560557684
     */
    @Generated @NInt public static final long CannotInterruptOthers = 0x0000000021696E74L;
    /**
     * 0x656E743F, 1701737535
     */
    @Generated @NInt public static final long MissingEntitlement = 0x00000000656E743FL;
    /**
     * 0x73697269, 1936290409
     */
    @Generated @NInt public static final long SiriIsRecording = 0x0000000073697269L;
    /**
     * 0x21706C61, 561015905
     */
    @Generated @NInt public static final long CannotStartPlaying = 0x0000000021706C61L;
    /**
     * 0x21726563, 561145187
     */
    @Generated @NInt public static final long CannotStartRecording = 0x0000000021726563L;
    @Generated @NInt public static final long BadParam = 0xFFFFFFFFFFFFFFCEL;
    /**
     * 0x21707269, 561017449
     */
    @Generated @NInt public static final long InsufficientPriority = 0x0000000021707269L;
    /**
     * 0x21726573, 561145203
     */
    @Generated @NInt public static final long ResourceNotAvailable = 0x0000000021726573L;
    /**
     * 0x77686174, 2003329396
     */
    @Generated @NInt public static final long Unspecified = 0x0000000077686174L;
    /**
     * 0x21736573, 561210739
     */
    @Generated @NInt public static final long ExpiredSession = 0x0000000021736573L;
    /**
     * 0x696e6163, 1768841571
     */
    @Generated @NInt public static final long SessionNotActive = 0x00000000696E6163L;
}
