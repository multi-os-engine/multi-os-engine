package apple.corehaptics;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * CHHapticPattern
 * 
 * A set of one or more haptic events and/or Dynamic parameters/parameter curves.
 * 
 * The passed-in arrays' contents are not owned by the pattern object. Changes made to those arrays
 * after a CHHapticPattern object is created have no effect on that object.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHHapticPattern extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHHapticPattern(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHHapticPattern alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHHapticPattern allocWithZone(VoidPtr zone);

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

    /**
     * [@property] duration
     * Pattern duration is calculated as the start time of the pattern's last event or parameter, plus that event's
     * duration if present.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * exportDictionaryAndReturnError:error
     * 
     * Returns a NSDictionary representation of the contents of the pattern.
     * 
     * Patterns containing custom audio resource IDs cannot be exported and will return nil
     * with the error code set to CHHapticErrorCodeOperationNotPermitted.
     */
    @Nullable
    @Generated
    @Selector("exportDictionaryAndReturnError:")
    public native NSDictionary<String, ?> exportDictionaryAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHHapticPattern init();

    /**
     * initWithDictionary:error
     * 
     * Initialize a new CHHapticPattern using the passed-in NSDictionary.
     * 
     * @param patternDict
     *                    NSDictionary containing a pattern property list.
     */
    @Generated
    @Selector("initWithDictionary:error:")
    public native CHHapticPattern initWithDictionaryError(@NotNull NSDictionary<String, ?> patternDict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initWithEvents:parameterCurves:error
     * 
     * Initialize a new CHHapticPattern with parameters modulated by parameter curves.
     * 
     * @param events
     *                        An NSArray of CHHapticEvents. Can be empty.
     * @param parameterCurves
     *                        An NSArray of CHHapticParameterCurves. Can be empty.
     */
    @Generated
    @Selector("initWithEvents:parameterCurves:error:")
    public native CHHapticPattern initWithEventsParameterCurvesError(@NotNull NSArray<? extends CHHapticEvent> events,
            @NotNull NSArray<? extends CHHapticParameterCurve> parameterCurves,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initWithEvents:parameters:error
     * 
     * Initialize a new CHHapticPattern.
     * 
     * @param events
     *                   An NSArray of CHHapticEvents. Can be empty.
     * @param parameters
     *                   An NSArray of CHHapticDynamicParameters. Can be empty.
     */
    @Generated
    @Selector("initWithEvents:parameters:error:")
    public native CHHapticPattern initWithEventsParametersError(@NotNull NSArray<? extends CHHapticEvent> events,
            @NotNull NSArray<? extends CHHapticDynamicParameter> parameters,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    public static native CHHapticPattern new_objc();

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
     * initWithContentsOfURL:error
     * 
     * Initialize a new CHHapticPattern using the contents of the passed-in NSURL.
     * 
     * This URL must reference a valid AHAP file.
     * 
     * API-Since: 16.0
     * 
     * @param ahapURL
     *                NSURL of an ahap file.
     */
    @Generated
    @Selector("initWithContentsOfURL:error:")
    public native CHHapticPattern initWithContentsOfURLError(@NotNull NSURL ahapURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
