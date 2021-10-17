package apple.avfaudio.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The AVAudioSessionDelegate protocol is deprecated. Instead you should register for notifications.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioSessionDelegate")
public interface AVAudioSessionDelegate {
    /**
     * something has caused your audio session to be interrupted
     */
    @Generated
    @IsOptional
    @Selector("beginInterruption")
    default void beginInterruption() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * endInterruptionWithFlags: will be called instead if implemented.
     */
    @Generated
    @IsOptional
    @Selector("endInterruption")
    default void endInterruption() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Currently the only flag is AVAudioSessionInterruptionFlags_ShouldResume.
     */
    @Generated
    @IsOptional
    @Selector("endInterruptionWithFlags:")
    default void endInterruptionWithFlags(@NUInt long flags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * notification for input become available or unavailable
     */
    @Generated
    @IsOptional
    @Selector("inputIsAvailableChanged:")
    default void inputIsAvailableChanged(boolean isInputAvailable) {
        throw new java.lang.UnsupportedOperationException();
    }
}
