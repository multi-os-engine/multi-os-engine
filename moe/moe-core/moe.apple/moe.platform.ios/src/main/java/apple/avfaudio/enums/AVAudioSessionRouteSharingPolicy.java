package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum]        AVAudioSessionRouteSharingPolicy
 * <p>
 * Starting in iOS 11, tvOS 11, and watchOS 5, the route sharing policy allows a session
 * to specify that its output audio should be routed somewhere other than the default system output,
 * when appropriate alternative routes are available.
 * [@var]    AVAudioSessionRouteSharingPolicyDefault
 * Follow normal rules for routing audio output.
 * [@var]    AVAudioSessionRouteSharingPolicyLongFormAudio
 * Route output to the shared long-form audio output. A session whose primary use case is as a
 * music or podcast player may use this value to play to the same output as the built-in Music (iOS),
 * Podcasts, or iTunes (macOS) applications. Typically applications that use this policy will also
 * want sign up for remote control events as documented in “Event Handling Guide for UIKit Apps”
 * and will want to utilize MediaPlayer framework’s MPNowPlayingInfoCenter class. All applications
 * on the system that use the long-form audio route sharing policy will have their audio routed to the
 * same location.
 * Apps running on watchOS using this policy will also be able to play audio in the background,
 * as long as an eligible audio route can be activated. Apps running on watchOS using this policy
 * must use -activateWithOptions:completionHandler: instead of -setActive:withOptions:error: in
 * order to ensure that the user will be given the opportunity to pick an appropriate audio route
 * in cases where the system is unable to automatically pick the route.
 * [@var]    AVAudioSessionRouteSharingPolicyLongForm
 * Deprecated. Replaced by AVAudioSessionRouteSharingPolicyLongFormAudio.
 * [@var]    AVAudioSessionRouteSharingPolicyIndependent
 * Applications should not attempt to set this value directly. On iOS, this value will be set by
 * the system in cases where route picker UI is used to direct video to a wireless route.
 * [@var]    AVAudioSessionRouteSharingPolicyLongFormVideo
 * Route output to the shared long-form video output. A session whose primary use case is as a
 * movie or other long-form video content player may use this value to play to the same output as
 * other long-form video content applications such as the built-in TV (iOS) application. Applications
 * that use this policy will also want to also set the AVInitialRouteSharingPolicy key
 * in their Info.plist to "LongFormVideo". All applications on the system that use the long-form video
 * route sharing policy will have their audio and video routed to the same location (e.g. AppleTV when
 * an AirPlay route is selected). Video content not using this route sharing policy will remain local
 * to the playback device even when long form video content is being routed to AirPlay.
 */
@Generated
public final class AVAudioSessionRouteSharingPolicy {
    @Generated
    private AVAudioSessionRouteSharingPolicy() {
    }

    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    @Generated @NUInt public static final long LongFormAudio = 0x0000000000000001L;
    @Generated @NUInt public static final long LongForm = 0x0000000000000001L;
    @Generated @NUInt public static final long Independent = 0x0000000000000002L;
    @Generated @NUInt public static final long LongFormVideo = 0x0000000000000003L;
}
