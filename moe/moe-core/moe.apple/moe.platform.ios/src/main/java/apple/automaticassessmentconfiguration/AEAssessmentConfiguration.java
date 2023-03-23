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

/**
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
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsAccessibilitySpeech")
    public native boolean allowsAccessibilitySpeech();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsActivityContinuation")
    public native boolean allowsActivityContinuation();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsContinuousPathKeyboard")
    public native boolean allowsContinuousPathKeyboard();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsDictation")
    public native boolean allowsDictation();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsKeyboardShortcuts")
    public native boolean allowsKeyboardShortcuts();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsPasswordAutoFill")
    public native boolean allowsPasswordAutoFill();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsPredictiveKeyboard")
    public native boolean allowsPredictiveKeyboard();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsSpellCheck")
    public native boolean allowsSpellCheck();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("autocorrectMode")
    @NUInt
    public native long autocorrectMode();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsAccessibilitySpeech:")
    public native void setAllowsAccessibilitySpeech(boolean value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsActivityContinuation:")
    public native void setAllowsActivityContinuation(boolean value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsContinuousPathKeyboard:")
    public native void setAllowsContinuousPathKeyboard(boolean value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsDictation:")
    public native void setAllowsDictation(boolean value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsKeyboardShortcuts:")
    public native void setAllowsKeyboardShortcuts(boolean value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsPasswordAutoFill:")
    public native void setAllowsPasswordAutoFill(boolean value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsPredictiveKeyboard:")
    public native void setAllowsPredictiveKeyboard(boolean value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsSpellCheck:")
    public native void setAllowsSpellCheck(boolean value);

    /**
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
}
