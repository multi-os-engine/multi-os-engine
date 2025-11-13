package apple.automaticassessmentconfiguration;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSDictionary;

/**
 * Configuration information for an assessment session.
 * 
 * Create a configuration instance and pass it to the ``AEAssessmentSession/init(configuration:)`` initializer of an
 * ``AEAssessmentSession`` instance to create a new assessment session. Before using the configuration, indicate which
 * exceptions you want to allow for the assessment session's restrictions by setting values on the configuration
 * instance. For example, you can set values to allow dictation and certain aspects of autocorrect:
 * 
 * ```swift
 * let config = AEAssessmentConfiguration()
 * 
 * #if os(iOS) // These exceptions available only on iOS and iPadOS.
 * config.allowsDictation = true
 * config.autocorrectMode = [.punctuation, .spelling]
 * #endif
 * 
 * let session = AEAssessmentSession(configuration: config)
 * ```
 * 
 * While you provide a configuration instance when creating a session on iOS, iPadOS, and macOS, specific exceptions
 * apply only to certain platforms. In particular, on macOS, you can selectively make specific apps besides your own
 * available during an assessment — for example, to allow users to access a calculator or a dictionary. All other
 * exceptions apply only to iOS and iPadOS.
 * 
 * ## Topics
 * 
 * ### Allowing access to other apps
 * 
 * - ``setConfiguration(_:for:)``
 * - ``configurationsByApplication``
 * - ``remove(_:)``
 * - ``mainParticipantConfiguration``
 * - ``AEAssessmentApplication``
 * - ``AEAssessmentParticipantConfiguration``
 * 
 * ### Allowing accessibility
 * 
 * - ``allowsAccessibilityKeyboard``
 * - ``allowsAccessibilityLiveCaptions``
 * - ``allowsAccessibilityReader``
 * - ``allowsAccessibilitySpeech``
 * - ``allowsAccessibilityTypingFeedback``
 * - ``allowsDictation``
 * 
 * ### Allowing typing assistance
 * 
 * - ``allowsContinuousPathKeyboard``
 * - ``allowsKeyboardShortcuts``
 * - ``allowsPredictiveKeyboard``
 * - ``allowsPasswordAutoFill``
 * 
 * ### Allowing corrections
 * 
 * - ``allowsSpellCheck``
 * - ``autocorrectMode-swift.property``
 * - ``AutocorrectMode-swift.struct``
 * 
 * ### Allowing handoff
 * 
 * - ``allowsActivityContinuation``
 * 
 * ### Allowing content capture
 * 
 * - ``allowsScreenshots``
 * 
 * 
 * API-Since: 13.4
 */
@Generated
@Library("AutomaticAssessmentConfiguration")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AEAssessmentConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AEAssessmentConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AEAssessmentConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AEAssessmentConfiguration allocWithZone(VoidPtr zone);

    /**
     * A Boolean value that indicates whether to allow the speech-related accessibility features during an assessment.
     * 
     * A device reads text aloud for users who need it. In particular, users can enable the following features from
     * Accessibility > Spoken Content in the Settings app on iOS and iPadOS:
     * - Speak Selection
     * - Speak Screen
     * - Typing Feedback > Speak Words
     * 
     * An assessment session disables these features by default, but you can allow them by setting
     * ``AEAssessmentConfiguration/allowsAccessibilitySpeech`` to `true` in the ``AEAssessmentConfiguration`` instance
     * that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsAccessibilitySpeech")
    public native boolean allowsAccessibilitySpeech();

    /**
     * A Boolean value that indicates whether to allow Handoff during an assessment.
     * 
     * Handoff lets users start an activity on one device and seamlessly resume the activity on another. Users control
     * whether a device participates in Handoff by turning the feature on or off in the Settings app (General > AirPlay
     * & Handoff > Handoff). An assessment disables this feature by default, but you can allow users undergoing an
     * assessment to continue to use Handoff by setting ``AEAssessmentConfiguration/allowsActivityContinuation`` to
     * `true`.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsActivityContinuation")
    public native boolean allowsActivityContinuation();

    /**
     * A Boolean value that indicates whether to allow Slide to Type to operate during an assessment.
     * 
     * Users can turn on Slide to Type in the Settings app (General > Keyboard). An assessment session disables this
     * feature by default, but you can allow it by setting ``AEAssessmentConfiguration/allowsContinuousPathKeyboard`` to
     * `true` in the ``AEAssessmentConfiguration`` instance that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsContinuousPathKeyboard")
    public native boolean allowsContinuousPathKeyboard();

    /**
     * A Boolean value that indicates whether to allow the use of dictation during an assessment.
     * 
     * By turning on Enable Dictation (General > Keyboard in the Settings app on iOS and iPadOS), users can speak into
     * their device and have the words they speak converted to text. An assessment session disables this feature by
     * default, but you can allow it by setting ``AEAssessmentConfiguration/allowsDictation`` to `true` in the
     * ``AEAssessmentConfiguration`` instance that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsDictation")
    public native boolean allowsDictation();

    /**
     * A Boolean value that indicates whether to allow keyboard shortcuts during an assessment.
     * 
     * Users can add Keyboard Shortcuts in the Settings app (General > Keyboard > Text Replacement). An assessment
     * session disables the use of keyboard shortcuts by default, but you can allow them by setting
     * ``AEAssessmentConfiguration/allowsKeyboardShortcuts`` to `true` in the ``AEAssessmentConfiguration`` instance
     * that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsKeyboardShortcuts")
    public native boolean allowsKeyboardShortcuts();

    /**
     * A Boolean value that indicates whether to allow password autofill during an assessment.
     * 
     * Users can store passwords for use with Password Autofill by turning on the feature in the Settings app (General >
     * Passwords > AutoFill Passwords). An assessment session disables Password Autofill by default, but you can allow
     * it by setting ``AEAssessmentConfiguration/allowsPasswordAutoFill`` to `true` in the ``AEAssessmentConfiguration``
     * instance that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsPasswordAutoFill")
    public native boolean allowsPasswordAutoFill();

    /**
     * A Boolean value that indicates whether to enable the predictive keyboard during an assessment.
     * 
     * Users can turn on the Predictive Keyboard feature in the Settings app (General > Keyboard). An assessment session
     * disables this feature by default, but you can allow it by setting
     * ``AEAssessmentConfiguration/allowsPredictiveKeyboard`` to `true` in the ``AEAssessmentConfiguration`` instance
     * that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsPredictiveKeyboard")
    public native boolean allowsPredictiveKeyboard();

    /**
     * A Boolean value that indicates whether to allow spell check during an assessment.
     * 
     * Users can activate the spell checker by turning on the Check Spelling feature in the Settings app (General >
     * Keyboard). An assessment session disables spell checking by default, but you can allow it by setting
     * ``AEAssessmentConfiguration/allowsSpellCheck`` to `true` in the ``AEAssessmentConfiguration`` instance that you
     * use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsSpellCheck")
    public native boolean allowsSpellCheck();

    /**
     * The autocorrect mode that specifies which autocorrect features to allow during an assessment.
     * 
     * Users can turn on autocorrect in the Settings app (General > Keyboard > Auto-Correction). An assessment session
     * disables this feature by default, but you can allow it by setting
     * ``AEAssessmentConfiguration/autocorrectMode-swift.property`` in the ``AEAssessmentConfiguration`` instance that
     * you use to initialize a session. Set the mode's value to some combination of the the values from the
     * ``AEAssessmentConfiguration/AutocorrectMode-swift.struct`` structure.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("autocorrectMode")
    @NUInt
    public native long autocorrectMode();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    @Selector("init")
    public native AEAssessmentConfiguration init();

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
    public static native AEAssessmentConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A Boolean value that indicates whether to allow the speech-related accessibility features during an assessment.
     * 
     * A device reads text aloud for users who need it. In particular, users can enable the following features from
     * Accessibility > Spoken Content in the Settings app on iOS and iPadOS:
     * - Speak Selection
     * - Speak Screen
     * - Typing Feedback > Speak Words
     * 
     * An assessment session disables these features by default, but you can allow them by setting
     * ``AEAssessmentConfiguration/allowsAccessibilitySpeech`` to `true` in the ``AEAssessmentConfiguration`` instance
     * that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsAccessibilitySpeech:")
    public native void setAllowsAccessibilitySpeech(boolean value);

    /**
     * A Boolean value that indicates whether to allow Handoff during an assessment.
     * 
     * Handoff lets users start an activity on one device and seamlessly resume the activity on another. Users control
     * whether a device participates in Handoff by turning the feature on or off in the Settings app (General > AirPlay
     * & Handoff > Handoff). An assessment disables this feature by default, but you can allow users undergoing an
     * assessment to continue to use Handoff by setting ``AEAssessmentConfiguration/allowsActivityContinuation`` to
     * `true`.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsActivityContinuation:")
    public native void setAllowsActivityContinuation(boolean value);

    /**
     * A Boolean value that indicates whether to allow Slide to Type to operate during an assessment.
     * 
     * Users can turn on Slide to Type in the Settings app (General > Keyboard). An assessment session disables this
     * feature by default, but you can allow it by setting ``AEAssessmentConfiguration/allowsContinuousPathKeyboard`` to
     * `true` in the ``AEAssessmentConfiguration`` instance that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsContinuousPathKeyboard:")
    public native void setAllowsContinuousPathKeyboard(boolean value);

    /**
     * A Boolean value that indicates whether to allow the use of dictation during an assessment.
     * 
     * By turning on Enable Dictation (General > Keyboard in the Settings app on iOS and iPadOS), users can speak into
     * their device and have the words they speak converted to text. An assessment session disables this feature by
     * default, but you can allow it by setting ``AEAssessmentConfiguration/allowsDictation`` to `true` in the
     * ``AEAssessmentConfiguration`` instance that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsDictation:")
    public native void setAllowsDictation(boolean value);

    /**
     * A Boolean value that indicates whether to allow keyboard shortcuts during an assessment.
     * 
     * Users can add Keyboard Shortcuts in the Settings app (General > Keyboard > Text Replacement). An assessment
     * session disables the use of keyboard shortcuts by default, but you can allow them by setting
     * ``AEAssessmentConfiguration/allowsKeyboardShortcuts`` to `true` in the ``AEAssessmentConfiguration`` instance
     * that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsKeyboardShortcuts:")
    public native void setAllowsKeyboardShortcuts(boolean value);

    /**
     * A Boolean value that indicates whether to allow password autofill during an assessment.
     * 
     * Users can store passwords for use with Password Autofill by turning on the feature in the Settings app (General >
     * Passwords > AutoFill Passwords). An assessment session disables Password Autofill by default, but you can allow
     * it by setting ``AEAssessmentConfiguration/allowsPasswordAutoFill`` to `true` in the ``AEAssessmentConfiguration``
     * instance that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsPasswordAutoFill:")
    public native void setAllowsPasswordAutoFill(boolean value);

    /**
     * A Boolean value that indicates whether to enable the predictive keyboard during an assessment.
     * 
     * Users can turn on the Predictive Keyboard feature in the Settings app (General > Keyboard). An assessment session
     * disables this feature by default, but you can allow it by setting
     * ``AEAssessmentConfiguration/allowsPredictiveKeyboard`` to `true` in the ``AEAssessmentConfiguration`` instance
     * that you use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsPredictiveKeyboard:")
    public native void setAllowsPredictiveKeyboard(boolean value);

    /**
     * A Boolean value that indicates whether to allow spell check during an assessment.
     * 
     * Users can activate the spell checker by turning on the Check Spelling feature in the Settings app (General >
     * Keyboard). An assessment session disables spell checking by default, but you can allow it by setting
     * ``AEAssessmentConfiguration/allowsSpellCheck`` to `true` in the ``AEAssessmentConfiguration`` instance that you
     * use to initialize a session.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsSpellCheck:")
    public native void setAllowsSpellCheck(boolean value);

    /**
     * The autocorrect mode that specifies which autocorrect features to allow during an assessment.
     * 
     * Users can turn on autocorrect in the Settings app (General > Keyboard > Auto-Correction). An assessment session
     * disables this feature by default, but you can allow it by setting
     * ``AEAssessmentConfiguration/autocorrectMode-swift.property`` in the ``AEAssessmentConfiguration`` instance that
     * you use to initialize a session. Set the mode's value to some combination of the the values from the
     * ``AEAssessmentConfiguration/AutocorrectMode-swift.struct`` structure.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAutocorrectMode:")
    public native void setAutocorrectMode(@NUInt long value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The collection of apps available during an assessment, along with their associated configurations.
     * 
     * Access this property to get a list of the currently allowed secondary apps and their individual configurations.
     * Add apps to the list by calling the ``AEAssessmentConfiguration/setConfiguration(_:for:)`` method. Remove them
     * from the list by calling the ``AEAssessmentConfiguration/remove(_:)`` method.
     * 
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("configurationsByApplication")
    @NotNull
    public native NSDictionary<? extends AEAssessmentApplication, ? extends AEAssessmentParticipantConfiguration> configurationsByApplication();

    /**
     * The app-specific configuration for the app that invokes the assessment.
     * 
     * Use this property to get and customize the app-specific configuration that's applied to your own app. For
     * example, you can set the `allowsNetworkAccess` property for your own app:
     * 
     * ```swift
     * let config = AEAssessmentConfiguration()
     * config.mainParticipantConfiguration.allowsNetworkAccess = false
     * ```
     * 
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("mainParticipantConfiguration")
    @NotNull
    public native AEAssessmentParticipantConfiguration mainParticipantConfiguration();

    /**
     * Removes the availability of a previously allowed app.
     * 
     * Use this method to remove apps that you previously added to the list of apps that are available during an
     * assessment with the ``AEAssessmentConfiguration/setConfiguration(_:for:)`` method. You can get the list of
     * currently allowed apps by accessing the configuration's ``AEAssessmentConfiguration/configurationsByApplication``
     * property.
     * 
     * - Parameters:
     * - application: The app that you want to remove from the list of allowed secondary apps.
     * 
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("removeApplication:")
    public native void removeApplication(@NotNull AEAssessmentApplication application);

    /**
     * Adds an app to the list of apps available during an assessment.
     * 
     * Use this method to make an app besides your own available during an assessment. Create a representation of the
     * app that you want to allow as an ``AEAssessmentApplication`` instance, and the configuration for that app using
     * an ``AEAssessmentParticipantConfiguration`` instance:
     * 
     * ```swift
     * let calculator = AEAssessmentApplication(bundleIdentifier: "com.apple.calculator")
     * let calculatorConfig = AEAssessmentParticipantConfiguration()
     * calculatorConfig.allowsNetworkAccess = false // Calculator doesn't need the network.
     * ```
     * 
     * Use the app and its configuration to create an assessment configuration, and either create an assessment session
     * with that, or update an existing session as shown below:
     * 
     * ```swift
     * let configuration = AEAssessmentConfiguration()
     * configuration.setConfiguration(calculatorConfig, for: calculator)
     * session.update(to: configuration)
     * ```
     * 
     * You can get a list of the currently allowed apps by accessing the
     * ``AEAssessmentConfiguration/configurationsByApplication`` property. You can disallow a previously allowed app by
     * using the ``AEAssessmentConfiguration/remove(_:)`` method.
     * 
     * - Parameters:
     * - configuration: The configuration of the secondary app.
     * - application: The app that you want to configure.
     * 
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("setConfiguration:forApplication:")
    public native void setConfigurationForApplication(@NotNull AEAssessmentParticipantConfiguration configuration,
            @NotNull AEAssessmentApplication application);

    /**
     * A Boolean value that indicates whether to allow Live Captions during an assessment.
     * 
     * Users can enable Live Captions in the Settings app (Accessibility > Live Captions) to receive real-time
     * transcription of spoken audio as text on screen. An assessment session disables Live Captions by default, but you
     * can allow it by setting ``AEAssessmentConfiguration/allowsAccessibilityLiveCaptions`` to `true` in the
     * ``AEAssessmentConfiguration`` instance that you use to initialize a session.
     * 
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("allowsAccessibilityLiveCaptions")
    public native boolean allowsAccessibilityLiveCaptions();

    /**
     * A Boolean value that indicates whether to allow the Accessibility Reader during an assessment.
     * 
     * Users can enable the Accessibility Reader in the Settings app (Accessibility > Read & Speak > Accessibility
     * Reader) to have text content formatted or read aloud. An assessment session disables the Accessibility Reader by
     * default, but you can allow it by setting ``AEAssessmentConfiguration/allowsAccessibilityReader`` to `true` in the
     * ``AEAssessmentConfiguration`` instance that you use to initialize a session.
     * 
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("allowsAccessibilityReader")
    public native boolean allowsAccessibilityReader();

    /**
     * A Boolean value that indicates whether to allow accessibility typing feedback during an assessment.
     * 
     * Users can enable typing feedback features in the Settings app (Accessibility > Keyboards & Typing > Typing
     * Feedback) to receive audio feedback when typing. An assessment session disables these accessibility typing
     * feedback features by default, but you can allow them by setting
     * ``AEAssessmentConfiguration/allowsAccessibilityTypingFeedback`` to `true` in the ``AEAssessmentConfiguration``
     * instance that you use to initialize a session.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("allowsAccessibilityTypingFeedback")
    public native boolean allowsAccessibilityTypingFeedback();

    /**
     * A Boolean value that indicates whether to allow Live Captions during an assessment.
     * 
     * Users can enable Live Captions in the Settings app (Accessibility > Live Captions) to receive real-time
     * transcription of spoken audio as text on screen. An assessment session disables Live Captions by default, but you
     * can allow it by setting ``AEAssessmentConfiguration/allowsAccessibilityLiveCaptions`` to `true` in the
     * ``AEAssessmentConfiguration`` instance that you use to initialize a session.
     * 
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("setAllowsAccessibilityLiveCaptions:")
    public native void setAllowsAccessibilityLiveCaptions(boolean value);

    /**
     * A Boolean value that indicates whether to allow the Accessibility Reader during an assessment.
     * 
     * Users can enable the Accessibility Reader in the Settings app (Accessibility > Read & Speak > Accessibility
     * Reader) to have text content formatted or read aloud. An assessment session disables the Accessibility Reader by
     * default, but you can allow it by setting ``AEAssessmentConfiguration/allowsAccessibilityReader`` to `true` in the
     * ``AEAssessmentConfiguration`` instance that you use to initialize a session.
     * 
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("setAllowsAccessibilityReader:")
    public native void setAllowsAccessibilityReader(boolean value);

    /**
     * A Boolean value that indicates whether to allow accessibility typing feedback during an assessment.
     * 
     * Users can enable typing feedback features in the Settings app (Accessibility > Keyboards & Typing > Typing
     * Feedback) to receive audio feedback when typing. An assessment session disables these accessibility typing
     * feedback features by default, but you can allow them by setting
     * ``AEAssessmentConfiguration/allowsAccessibilityTypingFeedback`` to `true` in the ``AEAssessmentConfiguration``
     * instance that you use to initialize a session.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAllowsAccessibilityTypingFeedback:")
    public native void setAllowsAccessibilityTypingFeedback(boolean value);
}
