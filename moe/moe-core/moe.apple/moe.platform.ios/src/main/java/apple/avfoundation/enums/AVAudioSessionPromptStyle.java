package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum]     AVAudioSessionPromptStyle
 * 
 *     The prompt style is a hint to sessions that use AVAudioSessionModeVoicePrompt to modify the type of
 *     prompt they play in response to other audio activity on the system, such as Siri or phone calls.
 *     Sessions that issue voice prompts are encouraged to pay attention to changes in the prompt style and
 *     modify their prompts in response. Apple encourages the use of non-verbal prompts when the Short
 *     style is requested.
 * [@var] AVAudioSessionPromptStyleNone
 *     Indicates that another session is actively using microphone input and would be negatively impacted
 *     by having prompts play at that time. For example if Siri is recognizing speech, having navigation or
 *     exercise prompts play, could interfere with its ability to accurately recognize the user’s speech.
 *     Client sessions should refrain from playing any prompts while the prompt style is None.
 * [@var] AVAudioSessionPromptStyleShort
 *     Indicates one of three states: Siri is active but not recording, voicemail playback is active, or
 *     voice call is active. Short, non-verbal versions of prompts should be used.
 * [@var] AVAudioSessionPromptStyleNormal
 *     Indicates that normal (long, verbal) versions of prompts may be used.
 */
@Generated
public final class AVAudioSessionPromptStyle {
    @Generated
    private AVAudioSessionPromptStyle() {
    }

    @Generated @NUInt public static final long None = 0x000000006E6F6E65L;
    @Generated @NUInt public static final long Short = 0x0000000073687274L;
    @Generated @NUInt public static final long Normal = 0x000000006E726D6CL;
}