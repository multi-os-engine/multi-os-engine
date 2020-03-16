package apple.corehaptics.protocol;

import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticAdvancedPatternPlayer")
public interface CHHapticAdvancedPatternPlayer extends CHHapticPatternPlayer {
    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    Block_completionHandler_ret completionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(NSError arg0);
    }

    @Generated
    @Selector("isMuted")
    boolean isMuted();

    @Generated
    @Selector("loopEnabled")
    boolean loopEnabled();

    @Generated
    @Selector("loopEnd")
    double loopEnd();

    @Generated
    @Selector("pauseAtTime:error:")
    boolean pauseAtTimeError(double time, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("playbackRate")
    float playbackRate();

    @Generated
    @Selector("resumeAtTime:error:")
    boolean resumeAtTimeError(double time, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("seekToOffset:error:")
    boolean seekToOffsetError(double offsetTime, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("setCompletionHandler:")
    void setCompletionHandler(@ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionHandler {
        @Generated
        void call_setCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("setIsMuted:")
    void setIsMuted(boolean value);

    @Generated
    @Selector("setLoopEnabled:")
    void setLoopEnabled(boolean value);

    @Generated
    @Selector("setLoopEnd:")
    void setLoopEnd(double value);

    @Generated
    @Selector("setPlaybackRate:")
    void setPlaybackRate(float value);
}