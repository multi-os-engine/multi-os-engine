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
 * An object you use to check for the availability of the speech recognition service, and to initiate the speech
 * recognition process.
 * 
 * An ``SFSpeechRecognizer`` object is the central object for managing the speech recognizer process. Use this object
 * to:
 * 
 * - Request authorization to use speech recognition services.
 * - Specify the language to use during the recognition process.
 * - Initiate new speech recognition tasks.
 * 
 * ### Set up speech recognition
 * 
 * Each speech recognizer supports only one language, which you specify at creation time. The successful creation of a
 * speech recognizer does not guarantee that speech recognition services are available. For some languages, the
 * recognizer might require an Internet connection. Use the ``isAvailable`` property to find out if speech recognition
 * services are available for the current language.
 * 
 * To initiate the speech recognition process, do the following:
 * 
 * 1. Request authorization to use speech recognition. See <doc:asking-permission-to-use-speech-recognition>.
 * 2. Create an ``SFSpeechRecognizer`` object.
 * 3. Verify the availability of services using the ``isAvailable`` property of your speech recognizer object.
 * 4. Prepare your audio content.
 * 5. Create a recognition request object—an object that descends from ``SFSpeechRecognitionRequest``.
 * 6. Call the ``recognitionTask(with:delegate:)`` or ``recognitionTask(with:resultHandler:)`` method to begin the
 * recognition process.
 * 
 * The type of recognition request object you create depends on whether you are processing an existing audio file or an
 * incoming stream of audio. For existing audio files, create a ``SFSpeechURLRecognitionRequest`` object. For audio
 * streams, create a ``SFSpeechAudioBufferRecognitionRequest`` object.
 * 
 * ### Create a great user experience for speech recognition
 * 
 * Here are some tips to consider when adding speech recognition support to your app.
 * 
 * - **Be prepared to handle failures caused by speech recognition limits.** Because speech recognition is a
 * network-based service, limits are enforced so that the service can remain freely available to all apps. Individual
 * devices may be limited in the number of recognitions that can be performed per day, and each app may be throttled
 * globally based on the number of requests it makes per day. If a recognition request fails quickly (within a second or
 * two of starting), check to see if the recognition service became unavailable. If it is, you may want to ask users to
 * try again later.
 * - **Plan for a one-minute limit on audio duration.** Speech recognition places a relatively high burden on battery
 * life and network usage. To minimize this burden, the framework stops speech recognition tasks that last longer than
 * one minute. This limit is similar to the one for keyboard-related dictation.
 * - **Remind the user when your app is recording.** For example, display a visual indicator and play sounds at the
 * beginning and end of speech recognition to help users understand that they're being actively recorded. You can also
 * display speech as it is being recognized so that users understand what your app is doing and see any mistakes made
 * during the recognition process.
 * - **Do not perform speech recognition on private or sensitive information.** Some speech is not appropriate for
 * recognition. Don't send passwords, health or financial data, and other sensitive speech for recognition.
 * 
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

    /**
     * Returns your app's current authorization to perform speech recognition.
     * 
     * The user can reject your app's request to perform speech recognition, but your request can also be denied if
     * speech recognition is not supported on the device. The app can also change your app's authorization status at any
     * time from the Settings app.
     * 
     * - Returns: The app's current authorization status value. For a list of values, see
     * ``SFSpeechRecognizerAuthorizationStatus``.
     * 
     * API-Since: 10.0
     */
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

    /**
     * Asks the user to allow your app to perform speech recognition.
     * 
     * Call this method before performing any other tasks associated with speech recognition. This method executes
     * asynchronously, returning shortly after you call it. At some point later, the system calls the provided `handler`
     * block with the results.
     * 
     * When your app's authorization status is ``SFSpeechRecognizerAuthorizationStatus/notDetermined``, this method
     * causes the system to prompt the user to grant or deny permission for your app to use speech recognition. The
     * prompt includes the custom message you specify in the `NSSpeechRecognitionUsageDescription` key of your app's
     * `Info.plist` file. The user's response is saved so that future calls to this method do not prompt the user again.
     * 
     * > Important:
     * > Your app's `Info.plist` file must contain the `NSSpeechRecognitionUsageDescription` key with a valid usage
     * description. If this key is not present, your app will crash when you call this method.
     * 
     * For more information about requesting authorization, see <doc:asking-permission-to-use-speech-recognition>.
     * 
     * - Parameters:
     * - handler: The block to execute when your app's authorization status is known. The status parameter of the block
     * contains your app's authorization status. The system does not guarantee the execution of this block on your app's
     * main dispatch queue.
     * 
     * API-Since: 10.0
     */
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
     * Returns the set of locales that are supported by the speech recognizer.
     * 
     * This method returns the locales for which speech recognition is supported. Support for a locale does not
     * guarantee that speech recognition is currently possible for that locale. For some locales, the speech recognizer
     * requires an active Internet connection to communicate with Apple's servers. If the speech recognizer is currently
     * unable to process requests, ``isAvailable`` returns `false`.
     * 
     * Speech recognition supports the same locales that are supported by the keyboard's dictation feature. For a list
     * of these locales, see [QuickType Keyboard:
     * Dictation](https://www.apple.com/ios/feature-availability/#quicktype-keyboard-dictation).
     * 
     * - Returns: A set of locales that support speech recognition.
     * 
     * API-Since: 10.0
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
     * A hint that indicates the type of speech recognition being requested.
     * 
     * By default, the value of this property overrides the ``SFSpeechRecognitionTaskHint/unspecified`` value for
     * requests. For possible values, see ``SFSpeechRecognitionTaskHint``.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("defaultTaskHint")
    @NInt
    public native long defaultTaskHint();

    /**
     * The delegate object that handles changes to the availability of speech recognition services.
     * 
     * Provide a delegate object when you want to monitor changes to the availability of speech recognition services.
     * Your delegate object must conform to the ``SFSpeechRecognizerDelegate`` protocol.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SFSpeechRecognizerDelegate delegate();

    /**
     * Creates a speech recognizer associated with the user's default language settings.
     * 
     * If the user's default language is not supported for speech recognition, this method attempts to fall back to the
     * language used by the keyboard for dictation. If that fails, this method returns `nil`.
     * 
     * Even if this method returns a valid speech recognizer object, the speech recognition services may be temporarily
     * unavailable. To determine whether speech recognition services are available, check the ``isAvailable`` property.
     * 
     * - Returns: An initialized speech recognizer object, or `nil` if there was a problem creating the object.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("init")
    public native SFSpeechRecognizer init();

    /**
     * Creates a speech recognizer associated with the specified locale.
     * 
     * If you specify a language that is not supported by the speech recognizer, this method attempts to fall back to
     * the language used by the keyboard for dictation. If that fails, this method returns `nil`.
     * 
     * Even if this method returns a valid speech recognizer object, the speech recognition services may be temporarily
     * unavailable. To determine whether speech recognition services are available, check the ``isAvailable`` property.
     * 
     * - Parameters:
     * - locale: The locale object representing the language you want to use for speech recognition. For a list of
     * languages supported by the speech recognizer, see ``supportedLocales()``.
     * 
     * - Returns: An initialized speech recognizer object, or `nil` if the specified language was not supported.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithLocale:")
    public native SFSpeechRecognizer initWithLocale(@NotNull NSLocale locale);

    /**
     * A Boolean value that indicates whether the speech recognizer is currently available.
     * 
     * When the value of this property is `true`, you may create new speech recognition tasks. When value of this
     * property is `false`, speech recognition services are not available.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("isAvailable")
    public native boolean isAvailable();

    /**
     * The locale of the speech recognizer.
     * 
     * The locale of the speech recognizer is an `NSLocale` object. The default value of this property is the system
     * locale (that is, `+[NSLocale systemLocale]`).
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * The queue on which to execute recognition task handlers and delegate methods.
     * 
     * The default value of this property is the app's main queue. Assign a different queue if you want delegate methods
     * and handlers to be executed on a background queue.
     * 
     * The handler you pass to the ``requestAuthorization(_:)`` method does not use this queue.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("queue")
    public native NSOperationQueue queue();

    /**
     * Recognizes speech from the audio source associated with the specified request, using the specified delegate to
     * manage the results.
     * 
     * Use this method to initiate the speech recognition process on the audio contained in the request object. This
     * method executes asynchronously and returns a ``SFSpeechRecognitionTask`` object that you can use to cancel or
     * finalize the recognition process later. As results become available, the method calls the methods of the provided
     * `delegate` object.
     * 
     * Note that the ``SFSpeechRecognitionTask`` object returned by this method does not retain your delegate object.
     * You must maintain a strong reference to your delegate while speech recognition is in progress.
     * 
     * - Parameters:
     * - request: A request (encapsulated in an ``SFSpeechRecognitionRequest`` object) to recognize speech from an audio
     * source.
     * - delegate: An object that can handle results from the speech recognition task. This object must conform to the
     * ``SFSpeechRecognitionTaskDelegate`` protocol.
     * 
     * - Returns: The task object you can use to manage an in-progress recognition request.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("recognitionTaskWithRequest:delegate:")
    public native SFSpeechRecognitionTask recognitionTaskWithRequestDelegate(
            @NotNull SFSpeechRecognitionRequest request,
            @NotNull @Mapped(ObjCObjectMapper.class) SFSpeechRecognitionTaskDelegate delegate);

    /**
     * Executes the speech recognition request and delivers the results to the specified handler block.
     * 
     * Use this method to initiate the speech recognition process on the audio contained in the request object. This
     * method executes asynchronously and returns a ``SFSpeechRecognitionTask`` object that you can use to cancel or
     * finalize the recognition process later. As results become available, the method calls the block in the
     * `resultHandler` parameter.
     * 
     * - Parameters:
     * - request: A request (in an ``SFSpeechRecognitionRequest`` object) to recognize speech from an audio source.
     * - resultHandler: The block to call when partial or final results are available, or when an error occurs. If the
     * ``SFSpeechRecognitionRequest/shouldReportPartialResults`` property is `true`, this block may be called multiple
     * times to deliver the partial and final results. The block has no return value and takes the following parameters:
     * 
     * - term result: A ``SFSpeechRecognitionResult`` containing the partial or final transcriptions of the audio
     * content.
     * - term error: An error object if a problem occurred. This parameter is `nil` if speech recognition was
     * successful.
     * 
     * - Returns: The task object you can use to manage an in-progress recognition request.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("recognitionTaskWithRequest:resultHandler:")
    public native SFSpeechRecognitionTask recognitionTaskWithRequestResultHandler(
            @NotNull SFSpeechRecognitionRequest request,
            @NotNull @ObjCBlock(name = "call_recognitionTaskWithRequestResultHandler") Block_recognitionTaskWithRequestResultHandler resultHandler);

    /**
     * A hint that indicates the type of speech recognition being requested.
     * 
     * By default, the value of this property overrides the ``SFSpeechRecognitionTaskHint/unspecified`` value for
     * requests. For possible values, see ``SFSpeechRecognitionTaskHint``.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setDefaultTaskHint:")
    public native void setDefaultTaskHint(@NInt long value);

    /**
     * The delegate object that handles changes to the availability of speech recognition services.
     * 
     * Provide a delegate object when you want to monitor changes to the availability of speech recognition services.
     * Your delegate object must conform to the ``SFSpeechRecognizerDelegate`` protocol.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) SFSpeechRecognizerDelegate value);

    /**
     * The delegate object that handles changes to the availability of speech recognition services.
     * 
     * Provide a delegate object when you want to monitor changes to the availability of speech recognition services.
     * Your delegate object must conform to the ``SFSpeechRecognizerDelegate`` protocol.
     * 
     * API-Since: 10.0
     */
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
     * The queue on which to execute recognition task handlers and delegate methods.
     * 
     * The default value of this property is the app's main queue. Assign a different queue if you want delegate methods
     * and handlers to be executed on a background queue.
     * 
     * The handler you pass to the ``requestAuthorization(_:)`` method does not use this queue.
     * 
     * API-Since: 10.0
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
     * A Boolean value that indicates whether the speech recognizer can operate without network access.
     * 
     * An ``SFSpeechRecognitionRequest`` can only honor its ``SFSpeechRecognitionRequest/requiresOnDeviceRecognition``
     * property if ``supportsOnDeviceRecognition`` is `true`. If ``supportsOnDeviceRecognition`` is `false`, the
     * ``SFSpeechRecognizer`` requires a network in order to recognize speech.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setSupportsOnDeviceRecognition:")
    public native void setSupportsOnDeviceRecognition(boolean value);

    /**
     * A Boolean value that indicates whether the speech recognizer can operate without network access.
     * 
     * An ``SFSpeechRecognitionRequest`` can only honor its ``SFSpeechRecognitionRequest/requiresOnDeviceRecognition``
     * property if ``supportsOnDeviceRecognition`` is `true`. If ``supportsOnDeviceRecognition`` is `false`, the
     * ``SFSpeechRecognizer`` requires a network in order to recognize speech.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("supportsOnDeviceRecognition")
    public native boolean supportsOnDeviceRecognition();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
