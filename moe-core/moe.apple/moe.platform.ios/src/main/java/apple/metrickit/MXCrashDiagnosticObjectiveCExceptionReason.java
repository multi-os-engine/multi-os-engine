package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MXCrashDiagnosticObjectiveCExceptionReason
 * 
 * A class that represents Crash exception reason.
 * 
 * Crash reports that are caused by an uncaught Objective-C NSException can in some cases contain detailed information
 * about the type, name and description of the exception object.
 * This information is captured in a structured way in a MXCrashDiagnosticObjectiveCExceptionReason object and may have
 * some pieces redacted to avoid exposing sensitive user data.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXCrashDiagnosticObjectiveCExceptionReason extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MXCrashDiagnosticObjectiveCExceptionReason(Pointer peer) {
        super(peer);
    }

    /**
     * JSONRepresentation
     * 
     * Convenience method to return a JSON representation of this MXCrashDiagnosticObjectiveCExceptionReason object.
     * 
     * @return An NSData object containing the JSON representation
     */
    @Generated
    @Selector("JSONRepresentation")
    @NotNull
    public native NSData JSONRepresentation();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXCrashDiagnosticObjectiveCExceptionReason alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MXCrashDiagnosticObjectiveCExceptionReason allocWithZone(VoidPtr zone);

    /**
     * [@property] arguments
     * 
     * An NSArray of strings representing arguments passed to the formatString.
     */
    @Generated
    @Selector("arguments")
    @NotNull
    public native NSArray<String> arguments();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] className
     * 
     * A string representing the class name of the exception, for example NSException.
     */
    @Generated
    @Selector("className")
    @NotNull
    public native String className();

    /**
     * [@property] composedMessage
     * 
     * A human-readable message string summarizing the reason for the exception.
     */
    @Generated
    @Selector("composedMessage")
    @NotNull
    public native String composedMessage();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * dictionaryRepresentation
     * 
     * Convenience method to return a NSDictionary representation of this MXCrashDiagnosticObjectiveCExceptionReason
     * object.
     * 
     * @return An NSDictionary object containing the dictionary representation
     */
    @Generated
    @Selector("dictionaryRepresentation")
    @NotNull
    public native NSDictionary<?, ?> dictionaryRepresentation();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] exceptionName
     * 
     * A string representing name of the exception
     * 
     * This will align with the "name" field of the NSException
     */
    @Generated
    @Selector("exceptionName")
    @NotNull
    public native String exceptionName();

    /**
     * [@property] exceptionType
     * 
     * A human-readable string denoting type of the exception
     */
    @Generated
    @Selector("exceptionType")
    @NotNull
    public native String exceptionType();

    /**
     * [@property] formatString
     * 
     * A string representing the exception message before arguments are substituted into the message
     */
    @Generated
    @Selector("formatString")
    @NotNull
    public native String formatString();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MXCrashDiagnosticObjectiveCExceptionReason init();

    @Generated
    @Selector("initWithCoder:")
    public native MXCrashDiagnosticObjectiveCExceptionReason initWithCoder(@NotNull NSCoder coder);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MXCrashDiagnosticObjectiveCExceptionReason new_objc();

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
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}