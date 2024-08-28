package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVAudioSessionCategoryOptions
 * 
 * Customization of various aspects of a category's behavior. Use with
 * setCategory:mode:options:error:.
 * 
 * Applications must be prepared for changing category options to fail as behavior may change
 * in future releases. If an application changes its category, it should reassert the options,
 * since they are not sticky across category changes. Introduced in iOS 6.0 / watchOS 2.0 /
 * tvOS 9.0.
 * 
 * [@var] AVAudioSessionCategoryOptionMixWithOthers
 * Controls whether other active audio apps will be interrupted or mixed with when your app's
 * audio session goes active. Details depend on the category.
 * 
 * AVAudioSessionCategoryPlayAndRecord or AVAudioSessionCategoryMultiRoute:
 * MixWithOthers defaults to false, but can be set to true, allowing other applications to
 * play in the background while your app has both audio input and output enabled.
 * 
 * AVAudioSessionCategoryPlayback:
 * MixWithOthers defaults to false, but can be set to true, allowing other applications to
 * play in the background. Your app will still be able to play regardless of the setting
 * of the ringer switch.
 * 
 * Other categories:
 * MixWithOthers defaults to false and cannot be changed.
 * 
 * MixWithOthers is only valid with AVAudioSessionCategoryPlayAndRecord,
 * AVAudioSessionCategoryPlayback, and AVAudioSessionCategoryMultiRoute.
 * 
 * [@var] AVAudioSessionCategoryOptionDuckOthers
 * Controls whether or not other active audio apps will be ducked when when your app's audio
 * session goes active. An example of this is a workout app, which provides periodic updates to
 * the user. It reduces the volume of any music currently being played while it provides its
 * status.
 * 
 * Defaults to off. Note that the other audio will be ducked for as long as the current session
 * is active. You will need to deactivate your audio session when you want to restore full
 * volume playback (un-duck) other sessions.
 * 
 * Setting this option will also make your session mixable with others
 * (AVAudioSessionCategoryOptionMixWithOthers will be set).
 * 
 * DuckOthers is only valid with AVAudioSessionCategoryAmbient,
 * AVAudioSessionCategoryPlayAndRecord, AVAudioSessionCategoryPlayback, and
 * AVAudioSessionCategoryMultiRoute.
 * 
 * [@var] AVAudioSessionCategoryOptionAllowBluetooth
 * Allows an application to change the default behavior of some audio session categories with
 * regard to whether Bluetooth Hands-Free Profile (HFP) devices are available for routing. The
 * exact behavior depends on the category.
 * 
 * AVAudioSessionCategoryPlayAndRecord:
 * AllowBluetooth defaults to false, but can be set to true, allowing a paired bluetooth
 * HFP device to appear as an available route for input, while playing through the
 * category-appropriate output.
 * 
 * AVAudioSessionCategoryRecord:
 * AllowBluetooth defaults to false, but can be set to true, allowing a paired Bluetooth
 * HFP device to appear as an available route for input
 * 
 * Other categories:
 * AllowBluetooth defaults to false and cannot be changed. Enabling Bluetooth for input in
 * these categories is not allowed.
 * 
 * [@var] AVAudioSessionCategoryOptionDefaultToSpeaker
 * Allows an application to change the default behavior of some audio session categories with
 * regard to the audio route. The exact behavior depends on the category.
 * 
 * AVAudioSessionCategoryPlayAndRecord:
 * DefaultToSpeaker will default to false, but can be set to true, routing to Speaker
 * (instead of Receiver) when no other audio route is connected.
 * 
 * Other categories:
 * DefaultToSpeaker is always false and cannot be changed.
 * 
 * [@var] AVAudioSessionCategoryOptionInterruptSpokenAudioAndMixWithOthers
 * When a session with InterruptSpokenAudioAndMixWithOthers set goes active, then if there is
 * another playing app whose session mode is AVAudioSessionModeSpokenAudio (for podcast
 * playback in the background, for example), then the spoken-audio session will be
 * interrupted. A good use of this is for a navigation app that provides prompts to its user:
 * it pauses any spoken audio currently being played while it plays the prompt.
 * 
 * InterruptSpokenAudioAndMixWithOthers defaults to off. Note that the other app's audio will
 * be paused for as long as the current session is active. You will need to deactivate your
 * audio session to allow the other session to resume playback. Setting this option will also
 * make your category mixable with others (AVAudioSessionCategoryOptionMixWithOthers will be
 * set). If you want other non-spoken audio apps to duck their audio when your app's session
 * goes active, also set AVAudioSessionCategoryOptionDuckOthers.
 * 
 * Only valid with AVAudioSessionCategoryPlayAndRecord, AVAudioSessionCategoryPlayback, and
 * AVAudioSessionCategoryMultiRoute. Introduced in iOS 9.0 / watchOS 2.0 / tvOS 9.0.
 * 
 * [@var] AVAudioSessionCategoryOptionAllowBluetoothA2DP
 * Allows an application to change the default behavior of some audio session categories with
 * regard to whether Bluetooth Advanced Audio Distribution Profile (A2DP) devices are
 * available for routing. The exact behavior depends on the category.
 * 
 * AVAudioSessionCategoryPlayAndRecord:
 * AllowBluetoothA2DP defaults to false, but can be set to true, allowing a paired
 * Bluetooth A2DP device to appear as an available route for output, while recording
 * through the category-appropriate input.
 * 
 * AVAudioSessionCategoryMultiRoute and AVAudioSessionCategoryRecord:
 * AllowBluetoothA2DP is false, and cannot be set to true.
 * 
 * Other categories:
 * AllowBluetoothA2DP is always implicitly true and cannot be changed; Bluetooth A2DP ports
 * are always supported in output-only categories.
 * 
 * Setting both AVAudioSessionCategoryOptionAllowBluetooth and
 * AVAudioSessionCategoryOptionAllowBluetoothA2DP is allowed. In cases where a single
 * Bluetooth device supports both HFP and A2DP, the HFP ports will be given a higher priority
 * for routing. For HFP and A2DP ports on separate hardware devices, the last-in wins rule
 * applies.
 * 
 * Introduced in iOS 10.0 / watchOS 3.0 / tvOS 10.0.
 * 
 * [@var] AVAudioSessionCategoryOptionAllowAirPlay
 * Allows an application to change the default behavior of some audio session categories
 * with regard to showing AirPlay devices as available routes. This option applies to
 * various categories in the same way as AVAudioSessionCategoryOptionAllowBluetoothA2DP;
 * see above for details.
 * 
 * Only valid with AVAudioSessionCategoryPlayAndRecord. Introduced in iOS 10.0 / tvOS 10.0.
 * 
 * [@var] AVAudioSessionCategoryOptionOverrideMutedMicrophoneInterruption
 * Some devices include a privacy feature that mutes the built-in microphone at a hardware level
 * under certain conditions e.g. when the Smart Folio of an iPad is closed. The default behavior is
 * to interrupt the session using the built-in microphone when that microphone is muted in hardware.
 * This option allows an application to opt out of the default behavior if it is using a category that
 * supports both input and output, such as AVAudioSessionCategoryPlayAndRecord, and wants to
 * allow its session to stay activated even when the microphone has been muted. The result would be
 * that playback continues as normal, and microphone sample buffers would continue to be produced
 * but all microphone samples would have a value of zero.
 * 
 * This may be useful if an application knows that it wants to allow playback to continue and
 * recording/monitoring a muted microphone will not lead to a poor user experience. Attempting to use
 * this option with a session category that doesn't support the use of audio input will result in an error.
 * 
 * Note that under the default policy, a session will be interrupted if it is running input at the time when
 * the microphone is muted in hardware. Similarly, attempting to start input when the microphone is
 * muted will fail.
 * Note that this option has no relation to the recordPermission property, which indicates whether or
 * not the user has granted permission to use microphone input.
 */
@Generated
public final class AVAudioSessionCategoryOptions {
    @Generated
    private AVAudioSessionCategoryOptions() {
    }

    @Generated @NUInt public static final long MixWithOthers = 0x0000000000000001L;
    @Generated @NUInt public static final long DuckOthers = 0x0000000000000002L;
    @Generated @NUInt public static final long AllowBluetooth = 0x0000000000000004L;
    @Generated @NUInt public static final long DefaultToSpeaker = 0x0000000000000008L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long InterruptSpokenAudioAndMixWithOthers = 0x0000000000000011L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long AllowBluetoothA2DP = 0x0000000000000020L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long AllowAirPlay = 0x0000000000000040L;
    /**
     * API-Since: 14.5
     */
    @Generated @NUInt public static final long OverrideMutedMicrophoneInterruption = 0x0000000000000080L;
}
