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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A discrete part of an entire transcription, as identified by the speech recognizer.
 * 
 * Use ``SFTranscriptionSegment`` to get details about a part of an overall ``SFTranscription``. An
 * ``SFTranscriptionSegment`` represents an utterance, which is a vocalized word or group of words that represent a
 * single meaning to the speech recognizer (``SFSpeechRecognizer``).
 * 
 * You don't create transcription object segments directly. Instead, you access them from a transcription's
 * ``SFTranscription/segments`` property.
 * 
 * A transcription segment includes the following information:
 * 
 * - The text of the utterance, plus any alternative interpretations of the spoken word.
 * - The character range of the segment within the ``SFTranscription/formattedString`` of its parent
 * ``SFTranscription``.
 * - A ``confidence`` value, indicating how likely it is that the specified string matches the audible speech.
 * - A ``timestamp`` and ``duration`` value, indicating the position of the segment within the provided audio stream.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFTranscriptionSegment extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SFTranscriptionSegment(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFTranscriptionSegment alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFTranscriptionSegment allocWithZone(VoidPtr zone);

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
    public static native SFTranscriptionSegment new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * An array of alternate interpretations of the utterance in the transcription segment.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("alternativeSubstrings")
    public native NSArray<String> alternativeSubstrings();

    /**
     * The level of confidence the speech recognizer has in its recognition of the speech transcribed for the segment.
     * 
     * This property reflects the overall confidence in the recognition of the entire phrase. The value is `0` if there
     * was no recognition, and it is closer to `1` when there is a high certainty that a transcription matches the
     * user's speech exactly. For example, a confidence value of `0.94` represents a very high confidence level, and is
     * more likely to be correct than a transcription with a confidence value of `0.72`.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("confidence")
    public native float confidence();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The number of seconds it took for the user to speak the utterance represented by the segment.
     * 
     * The ``duration`` contains the number of seconds it took for the user to speak the one or more words (utterance)
     * represented by the segment. For example, the ``SFSpeechRecognizer`` sets ``duration`` to `0.6` if the user took
     * `0.6` seconds to say `“time”` in the transcription of `“What time is it?"`.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SFTranscriptionSegment init();

    @Generated
    @Selector("initWithCoder:")
    public native SFTranscriptionSegment initWithCoder(@NotNull NSCoder coder);

    /**
     * The string representation of the utterance in the transcription segment.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("substring")
    public native String substring();

    /**
     * The range information for the transcription segment's substring, relative to the overall transcription.
     * 
     * Use the range information to find the position of the segment within the ``SFTranscription/formattedString``
     * property of the ``SFTranscription`` object containing this segment.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("substringRange")
    @ByValue
    public native NSRange substringRange();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The start time of the segment in the processed audio stream.
     * 
     * The ``timestamp`` is the number of seconds between the beginning of the audio content and when the user spoke the
     * word represented by the segment. For example, if the user said the word "time" one second into the transcription
     * "What time is it", the timestamp would be equal to `1.0`.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("timestamp")
    public native double timestamp();

    /**
     * An analysis of the transcription segment's vocal properties.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.5
     * Deprecated-Message: voiceAnalytics is moved to SFSpeechRecognitionMetadata
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("voiceAnalytics")
    public native SFVoiceAnalytics voiceAnalytics();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
