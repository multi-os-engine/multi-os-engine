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
 * An abstract class that represents a request to recognize speech from an audio source.
 * 
 * Don't create ``SFSpeechRecognitionRequest`` objects directly. Create an ``SFSpeechURLRecognitionRequest`` or
 * ``SFSpeechAudioBufferRecognitionRequest`` object instead. Use the properties of this class to configure various
 * aspects of your request object before you start the speech recognition process. For example, use the
 * ``shouldReportPartialResults`` property to specify whether you want partial results or only the final result of
 * speech recognition.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSpeechRecognitionRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSpeechRecognitionRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSpeechRecognitionRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFSpeechRecognitionRequest allocWithZone(VoidPtr zone);

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
    public static native SFSpeechRecognitionRequest new_objc();

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
     * An array of phrases that should be recognized, even if they are not in the system vocabulary.
     * 
     * Use this property to specify short custom phrases that are unique to your app. You might include phrases with the
     * names of characters, products, or places that are specific to your app. You might also include domain-specific
     * terminology or unusual or made-up words. Assigning custom phrases to this property improves the likelihood of
     * those phrases being recognized.
     * 
     * Keep phrases relatively brief, limiting them to one or two words whenever possible. Lengthy phrases are less
     * likely to be recognized. In addition, try to limit each phrase to something the user can say without pausing.
     * 
     * Limit the total number of phrases to no more than 100.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("contextualStrings")
    public native NSArray<String> contextualStrings();

    @Generated
    @Selector("init")
    public native SFSpeechRecognitionRequest init();

    /**
     * An identifier string that you use to describe the type of interaction associated with the speech recognition
     * request.
     * 
     * If different parts of your app have different speech recognition needs, you can use this property to identify the
     * part of your app that is making each request. For example, if one part of your app lets users speak phone numbers
     * and another part lets users speak street addresses, consistently identifying the part of the app that makes a
     * recognition request may help improve the accuracy of the results.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Not used anymore
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("interactionIdentifier")
    public native String interactionIdentifier();

    /**
     * An array of phrases that should be recognized, even if they are not in the system vocabulary.
     * 
     * Use this property to specify short custom phrases that are unique to your app. You might include phrases with the
     * names of characters, products, or places that are specific to your app. You might also include domain-specific
     * terminology or unusual or made-up words. Assigning custom phrases to this property improves the likelihood of
     * those phrases being recognized.
     * 
     * Keep phrases relatively brief, limiting them to one or two words whenever possible. Lengthy phrases are less
     * likely to be recognized. In addition, try to limit each phrase to something the user can say without pausing.
     * 
     * Limit the total number of phrases to no more than 100.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setContextualStrings:")
    public native void setContextualStrings(@NotNull NSArray<String> value);

    /**
     * An identifier string that you use to describe the type of interaction associated with the speech recognition
     * request.
     * 
     * If different parts of your app have different speech recognition needs, you can use this property to identify the
     * part of your app that is making each request. For example, if one part of your app lets users speak phone numbers
     * and another part lets users speak street addresses, consistently identifying the part of the app that makes a
     * recognition request may help improve the accuracy of the results.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Not used anymore
     */
    @Deprecated
    @Generated
    @Selector("setInteractionIdentifier:")
    public native void setInteractionIdentifier(@Nullable String value);

    /**
     * A Boolean value that indicates whether you want intermediate results returned for each utterance.
     * 
     * The default value of this property is `true`. If you want only final results (and you don't care about
     * intermediate results), set this property to `false` to prevent the system from doing extra work.
     * If true, partial (non-final) results for each utterance will be reported.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setShouldReportPartialResults:")
    public native void setShouldReportPartialResults(boolean value);

    /**
     * A value that indicates the type of speech recognition being performed.
     * 
     * The default value of this property is ``SFSpeechRecognitionTaskHint/unspecified``. For a valid list of values,
     * see ``SFSpeechRecognitionTaskHint``.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTaskHint:")
    public native void setTaskHint(@NInt long value);

    /**
     * A Boolean value that indicates whether you want intermediate results returned for each utterance.
     * 
     * The default value of this property is `true`. If you want only final results (and you don't care about
     * intermediate results), set this property to `false` to prevent the system from doing extra work.
     * If true, partial (non-final) results for each utterance will be reported.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("shouldReportPartialResults")
    public native boolean shouldReportPartialResults();

    /**
     * A value that indicates the type of speech recognition being performed.
     * 
     * The default value of this property is ``SFSpeechRecognitionTaskHint/unspecified``. For a valid list of values,
     * see ``SFSpeechRecognitionTaskHint``.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("taskHint")
    @NInt
    public native long taskHint();

    /**
     * A Boolean value that determines whether a request must keep its audio data on the device.
     * 
     * Set this property to `true` to prevent an ``SFSpeechRecognitionRequest`` from sending audio over the network.
     * However, on-device requests won't be as accurate.
     * 
     * > Note:
     * > The request only honors this setting if the ``SFSpeechRecognizer/supportsOnDeviceRecognition``
     * (``SFSpeechRecognizer``) property is also `true`.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requiresOnDeviceRecognition")
    public native boolean requiresOnDeviceRecognition();

    /**
     * A Boolean value that determines whether a request must keep its audio data on the device.
     * 
     * Set this property to `true` to prevent an ``SFSpeechRecognitionRequest`` from sending audio over the network.
     * However, on-device requests won't be as accurate.
     * 
     * > Note:
     * > The request only honors this setting if the ``SFSpeechRecognizer/supportsOnDeviceRecognition``
     * (``SFSpeechRecognizer``) property is also `true`.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRequiresOnDeviceRecognition:")
    public native void setRequiresOnDeviceRecognition(boolean value);

    /**
     * A Boolean value that indicates whether to add punctuation to speech recognition results.
     * 
     * Set this property to `true` for the speech framework to automatically include punctuation in the recognition
     * results. Punctuation includes a period or question mark at the end of a sentence, and a comma within a sentence.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("addsPunctuation")
    public native boolean addsPunctuation();

    /**
     * A Boolean value that indicates whether to add punctuation to speech recognition results.
     * 
     * Set this property to `true` for the speech framework to automatically include punctuation in the recognition
     * results. Punctuation includes a period or question mark at the end of a sentence, and a comma within a sentence.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAddsPunctuation:")
    public native void setAddsPunctuation(boolean value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("customizedLanguageModel")
    @Nullable
    public native SFSpeechLanguageModelConfiguration customizedLanguageModel();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setCustomizedLanguageModel:")
    public native void setCustomizedLanguageModel(@Nullable SFSpeechLanguageModelConfiguration value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
