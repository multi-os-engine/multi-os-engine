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
 * A request for a speech recognition from an audio source
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
     * Phrases which should be recognized even if they are not in the system vocabulary
     */
    @NotNull
    @Generated
    @Selector("contextualStrings")
    public native NSArray<String> contextualStrings();

    @Generated
    @Selector("init")
    public native SFSpeechRecognitionRequest init();

    /**
     * String which can be used to identify the receiver by the developer
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
     * Phrases which should be recognized even if they are not in the system vocabulary
     */
    @Generated
    @Selector("setContextualStrings:")
    public native void setContextualStrings(@NotNull NSArray<String> value);

    /**
     * String which can be used to identify the receiver by the developer
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
     * If true, partial (non-final) results for each utterance will be reported.
     * Default is true
     */
    @Generated
    @Selector("setShouldReportPartialResults:")
    public native void setShouldReportPartialResults(boolean value);

    @Generated
    @Selector("setTaskHint:")
    public native void setTaskHint(@NInt long value);

    /**
     * If true, partial (non-final) results for each utterance will be reported.
     * Default is true
     */
    @Generated
    @Selector("shouldReportPartialResults")
    public native boolean shouldReportPartialResults();

    @Generated
    @Selector("taskHint")
    @NInt
    public native long taskHint();

    /**
     * If true, speech recognition will not send any audio over the Internet
     * This will reduce accuracy but enables certain applications where it is
     * inappropriate to transmit user speech to a remote service.
     * Default is false
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requiresOnDeviceRecognition")
    public native boolean requiresOnDeviceRecognition();

    /**
     * If true, speech recognition will not send any audio over the Internet
     * This will reduce accuracy but enables certain applications where it is
     * inappropriate to transmit user speech to a remote service.
     * Default is false
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRequiresOnDeviceRecognition:")
    public native void setRequiresOnDeviceRecognition(boolean value);

    /**
     * If true, punctuations will be automatically included in the recognition results
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("addsPunctuation")
    public native boolean addsPunctuation();

    /**
     * If true, punctuations will be automatically included in the recognition results
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAddsPunctuation:")
    public native void setAddsPunctuation(boolean value);
}
