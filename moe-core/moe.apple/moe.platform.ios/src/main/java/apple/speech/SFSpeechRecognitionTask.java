/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.speech;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A task object for monitoring the speech recognition progress.
 * 
 * Use an `SFSpeechRecognitionTask` object to determine the state of a speech recognition task, to cancel an ongoing
 * task, or to signal the end of the task.
 * 
 * You don't create speech recognition task objects directly. Instead, you receive one of these objects after calling
 * ``SFSpeechRecognizer/recognitionTask(with:resultHandler:)`` or ``SFSpeechRecognizer/recognitionTask(with:delegate:)``
 * on your ``SFSpeechRecognizer`` object.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSpeechRecognitionTask extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSpeechRecognitionTask(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSpeechRecognitionTask alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFSpeechRecognitionTask allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SFSpeechRecognitionTask new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Cancels the current speech recognition task.
     * 
     * You can cancel recognition tasks for both prerecorded and live audio input. For example, you might cancel a task
     * in response to a user action or because the recording was interrupted.
     * 
     * When canceling a task, be sure to release any resources associated with the task, such as the audio input
     * resources you are using to capture audio samples.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * An error object that specifies the error that occurred during a speech recognition task.
     * 
     * The system may return one of the errors listed in the table below.
     * 
     * | Error Code | Error Domain | Description |
     * |---|---|---|
     * | `102` | `kLSRErrorDomain` | Assets are not installed. |
     * | `201` | `kLSRErrorDomain` | Siri or Dictation is disabled. |
     * | `300` | `kLSRErrorDomain` | Failed to initialize recognizer. |
     * | `301` | `kLSRErrorDomain` | Request was canceled. |
     * | `203` | `kAFAssistantErrorDomain` | Failure occurred during speech recognition. |
     * | `1100` | `kAFAssistantErrorDomain` | Trying to start recognition while an earlier instance is still active. |
     * | `1101` | `kAFAssistantErrorDomain` | Connection to speech process was invalidated. |
     * | `1107` | `kAFAssistantErrorDomain` | Connection to speech process was interrupted. |
     * | `1110` | `kAFAssistantErrorDomain` | Failed to recognize any speech. |
     * | `1700` | `kAFAssistantErrorDomain` | Request is not authorized. |
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * Stops accepting new audio and finishes processing on the audio input that has already been accepted.
     * 
     * For audio buffer–based recognition, recognition does not finish until this method is called, so be sure to call
     * it when the audio source is exhausted.
     * This has no effect on URL-based recognition requests, which effectively buffer the entire file immediately.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("finish")
    public native void finish();

    @Generated
    @Selector("init")
    public native SFSpeechRecognitionTask init();

    /**
     * A Boolean value that indicates whether the speech recognition task was canceled.
     * 
     * By default, the value of this property is `false`.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

    /**
     * A Boolean value that indicates whether audio input has stopped.
     * 
     * By default, the value of this property is `false`.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("isFinishing")
    public native boolean isFinishing();

    /**
     * The current state of the speech recognition task.
     * 
     * Check the value of this property to get the state of the in-progress speech recognition session. For valid
     * values, see ``SFSpeechRecognitionTaskState``.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
