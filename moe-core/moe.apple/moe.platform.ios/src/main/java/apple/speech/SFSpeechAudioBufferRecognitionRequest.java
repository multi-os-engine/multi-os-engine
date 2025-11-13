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
import apple.avfaudio.AVAudioFormat;
import apple.avfaudio.AVAudioPCMBuffer;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
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
 * A request to recognize speech from captured audio content, such as audio from the device's microphone.
 * 
 * Use an ``SFSpeechAudioBufferRecognitionRequest`` object to perform speech recognition on live audio, or on a set of
 * existing audio buffers. For example, use this request object to route audio from a device's microphone to the speech
 * recognizer.
 * 
 * The request object contains no audio initially. As you capture audio, call ``append(_:)`` or
 * ``appendAudioSampleBuffer(_:)`` to add audio samples to the request object. The speech recognizer continuously
 * analyzes the audio you appended, stopping only when you call the ``endAudio()`` method. You must call ``endAudio()``
 * explicitly to stop the speech recognition process.
 * 
 * For a complete example of how to use audio buffers with speech recognition, see [SpeakToMe: Using Speech Recognition
 * with
 * AVAudioEngine](https://developer.apple.com/library/archive/samplecode/SpeakToMe/Introduction/Intro.html#//apple_ref/doc/uid/TP40017110).
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSpeechAudioBufferRecognitionRequest extends SFSpeechRecognitionRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSpeechAudioBufferRecognitionRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSpeechAudioBufferRecognitionRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFSpeechAudioBufferRecognitionRequest allocWithZone(VoidPtr zone);

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
    public static native SFSpeechAudioBufferRecognitionRequest new_objc();

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
     * Appends audio in the PCM format to the end of the recognition request.
     * 
     * The audio must be in a native format and uncompressed.
     * 
     * - Parameters:
     * - audioPCMBuffer: An audio buffer that contains audio in the PCM format.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("appendAudioPCMBuffer:")
    public native void appendAudioPCMBuffer(@NotNull AVAudioPCMBuffer audioPCMBuffer);

    /**
     * Appends audio to the end of the recognition request.
     * 
     * The audio must be in a native format.
     * 
     * - Parameters:
     * - sampleBuffer: A buffer of audio.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("appendAudioSampleBuffer:")
    public native void appendAudioSampleBuffer(@NotNull CMSampleBufferRef sampleBuffer);

    /**
     * Marks the end of audio input for the recognition request.
     * 
     * Call this method explicitly to let the speech recognizer know that no more audio input is coming.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("endAudio")
    public native void endAudio();

    @Generated
    @Selector("init")
    public native SFSpeechAudioBufferRecognitionRequest init();

    /**
     * The preferred audio format for optimal speech recognition.
     * 
     * Use the audio format in this property as a hint for optimal recording, but don't depend on the value remaining
     * unchanged.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("nativeAudioFormat")
    public native AVAudioFormat nativeAudioFormat();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
