package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioSessionMicrophoneInjectionMode
 * 
 * Various modes to inject audio coming from a session to another app’s input stream
 * 
 * Applications can state their intent to mix locally generated audio, which should consist primarily of
 * synthesized speech, to another app's input stream. This feature is intended to be used by accessibility apps
 * implementing augmentative and alternative communication systems that enable users with disabilities to
 * communicate with synthesized speech. When input is muted, microphone injection will also be muted.
 * 
 * [@var] AVAudioSessionMicrophoneInjectionModeNone
 * [@var] AVAudioSessionMicrophoneInjectionModeSpokenAudio
 */
@Generated
public final class AVAudioSessionMicrophoneInjectionMode {
    @Generated
    private AVAudioSessionMicrophoneInjectionMode() {
    }

    /**
     * Default state, microphone injection is not preferred
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Inject Spoken Audio, like synthesized speech, with microphone audio
     */
    @Generated @NInt public static final long SpokenAudio = 0x0000000000000001L;
}