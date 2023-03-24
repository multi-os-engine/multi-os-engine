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
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import apple.speech.protocol.SFSpeechRecognitionTaskDelegate;
import apple.speech.protocol.SFSpeechRecognizerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSpeechRecognizer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSpeechRecognizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSpeechRecognizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFSpeechRecognizer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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
    public static native SFSpeechRecognizer new_objc();

    @Generated
    @Selector("requestAuthorization:")
    public static native void requestAuthorization(
            @NotNull @ObjCBlock(name = "call_requestAuthorization") Block_requestAuthorization handler);

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

    /**
     * Locales which support speech recognition.
     * Note that supported does not mean currently available; some locales may require an internet connection, for
     * example.
     */
    @NotNull
    @Generated
    @Selector("supportedLocales")
    public static native NSSet<? extends NSLocale> supportedLocales();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Default task for requests, overrides SFSpeechRecognitionTaskHintUnspecified for requests
     */
    @Generated
    @Selector("defaultTaskHint")
    @NInt
    public native long defaultTaskHint();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SFSpeechRecognizerDelegate delegate();

    /**
     * Returns speech recognizer with user's current locale, or nil if is not supported
     */
    @Generated
    @Selector("init")
    public native SFSpeechRecognizer init();

    /**
     * returns nil if the locale is not supported
     */
    @Generated
    @Selector("initWithLocale:")
    public native SFSpeechRecognizer initWithLocale(@NotNull NSLocale locale);

    @Generated
    @Selector("isAvailable")
    public native boolean isAvailable();

    @NotNull
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * Queue used the recognizer for recognition task handlers and delegate messages
     * Defaults to the main queue
     */
    @NotNull
    @Generated
    @Selector("queue")
    public native NSOperationQueue queue();

    /**
     * Advanced API: Recognize a custom request with with a delegate
     * The delegate will be weakly referenced by the returned task
     */
    @NotNull
    @Generated
    @Selector("recognitionTaskWithRequest:delegate:")
    public native SFSpeechRecognitionTask recognitionTaskWithRequestDelegate(
            @NotNull SFSpeechRecognitionRequest request,
            @NotNull @Mapped(ObjCObjectMapper.class) SFSpeechRecognitionTaskDelegate delegate);

    /**
     * Recognize speech utterance with a request
     * If request.shouldReportPartialResults is true, result handler will be called
     * repeatedly with partial results, then finally with a final result or an error.
     */
    @NotNull
    @Generated
    @Selector("recognitionTaskWithRequest:resultHandler:")
    public native SFSpeechRecognitionTask recognitionTaskWithRequestResultHandler(
            @NotNull SFSpeechRecognitionRequest request,
            @NotNull @ObjCBlock(name = "call_recognitionTaskWithRequestResultHandler") Block_recognitionTaskWithRequestResultHandler resultHandler);

    /**
     * Default task for requests, overrides SFSpeechRecognitionTaskHintUnspecified for requests
     */
    @Generated
    @Selector("setDefaultTaskHint:")
    public native void setDefaultTaskHint(@NInt long value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) SFSpeechRecognizerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) SFSpeechRecognizerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Queue used the recognizer for recognition task handlers and delegate messages
     * Defaults to the main queue
     */
    @Generated
    @Selector("setQueue:")
    public native void setQueue(@NotNull NSOperationQueue value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recognitionTaskWithRequestResultHandler {
        @Generated
        void call_recognitionTaskWithRequestResultHandler(@Nullable SFSpeechRecognitionResult result,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorization {
        @Generated
        void call_requestAuthorization(@NInt long status);
    }

    /**
     * True if this recognition can handle requests with requiresOnDeviceRecognition set to true
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setSupportsOnDeviceRecognition:")
    public native void setSupportsOnDeviceRecognition(boolean value);

    /**
     * True if this recognition can handle requests with requiresOnDeviceRecognition set to true
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("supportsOnDeviceRecognition")
    public native boolean supportsOnDeviceRecognition();
}
