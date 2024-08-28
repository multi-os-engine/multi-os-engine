package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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

/**
 * API-Since: 16.1
 * Deprecated-Since: 16.4
 * Deprecated-Message: Please use MTRUnitTestingClusterTestComplexNullableOptionalResponseParams
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRTestClusterClusterTestComplexNullableOptionalResponseParams extends
        MTRUnitTestingClusterTestComplexNullableOptionalResponseParams {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRTestClusterClusterTestComplexNullableOptionalResponseParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRTestClusterClusterTestComplexNullableOptionalResponseParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRTestClusterClusterTestComplexNullableOptionalResponseParams allocWithZone(VoidPtr zone);

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
    public native MTRTestClusterClusterTestComplexNullableOptionalResponseParams init();

    @Generated
    @Selector("initWithResponseValue:error:")
    public native MTRTestClusterClusterTestComplexNullableOptionalResponseParams initWithResponseValueError(
            @NotNull NSDictionary<String, ?> responseValue,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
    public static native MTRTestClusterClusterTestComplexNullableOptionalResponseParams new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableIntValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableIntValue")
    @Nullable
    public native NSNumber nullableIntValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableIntWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableIntWasNull")
    @NotNull
    public native NSNumber nullableIntWasNull();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableListValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableListValue")
    @Nullable
    public native NSArray<?> nullableListValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableListWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableListWasNull")
    @NotNull
    public native NSNumber nullableListWasNull();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalIntValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalIntValue")
    @Nullable
    public native NSNumber nullableOptionalIntValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalIntWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalIntWasNull")
    @Nullable
    public native NSNumber nullableOptionalIntWasNull();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalIntWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalIntWasPresent")
    @NotNull
    public native NSNumber nullableOptionalIntWasPresent();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalListValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalListValue")
    @Nullable
    public native NSArray<?> nullableOptionalListValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalListWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalListWasNull")
    @Nullable
    public native NSNumber nullableOptionalListWasNull();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalListWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalListWasPresent")
    @NotNull
    public native NSNumber nullableOptionalListWasPresent();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStringValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalStringValue")
    @Nullable
    public native String nullableOptionalStringValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStringWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalStringWasNull")
    @Nullable
    public native NSNumber nullableOptionalStringWasNull();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStringWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalStringWasPresent")
    @NotNull
    public native NSNumber nullableOptionalStringWasPresent();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStructValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalStructValue")
    @Nullable
    public native MTRUnitTestingClusterSimpleStruct nullableOptionalStructValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStructWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalStructWasNull")
    @Nullable
    public native NSNumber nullableOptionalStructWasNull();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStructWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalStructWasPresent")
    @NotNull
    public native NSNumber nullableOptionalStructWasPresent();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableStringValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableStringValue")
    @Nullable
    public native String nullableStringValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableStringWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableStringWasNull")
    @NotNull
    public native NSNumber nullableStringWasNull();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableStructValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableStructValue")
    @Nullable
    public native MTRUnitTestingClusterSimpleStruct nullableStructValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableStructWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("nullableStructWasNull")
    @NotNull
    public native NSNumber nullableStructWasNull();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalIntValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("optionalIntValue")
    @Nullable
    public native NSNumber optionalIntValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalIntWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("optionalIntWasPresent")
    @NotNull
    public native NSNumber optionalIntWasPresent();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalListValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("optionalListValue")
    @Nullable
    public native NSArray<?> optionalListValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalListWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("optionalListWasPresent")
    @NotNull
    public native NSNumber optionalListWasPresent();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalStringValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("optionalStringValue")
    @Nullable
    public native String optionalStringValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalStringWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("optionalStringWasPresent")
    @NotNull
    public native NSNumber optionalStringWasPresent();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalStructValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("optionalStructValue")
    @Nullable
    public native MTRUnitTestingClusterSimpleStruct optionalStructValue();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalStructWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("optionalStructWasPresent")
    @NotNull
    public native NSNumber optionalStructWasPresent();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableIntValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableIntValue:")
    public native void setNullableIntValue(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableIntWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableIntWasNull:")
    public native void setNullableIntWasNull(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableListValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableListValue:")
    public native void setNullableListValue(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableListWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableListWasNull:")
    public native void setNullableListWasNull(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalIntValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalIntValue:")
    public native void setNullableOptionalIntValue(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalIntWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalIntWasNull:")
    public native void setNullableOptionalIntWasNull(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalIntWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalIntWasPresent:")
    public native void setNullableOptionalIntWasPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalListValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalListValue:")
    public native void setNullableOptionalListValue(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalListWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalListWasNull:")
    public native void setNullableOptionalListWasNull(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalListWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalListWasPresent:")
    public native void setNullableOptionalListWasPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStringValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalStringValue:")
    public native void setNullableOptionalStringValue(@Nullable String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStringWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalStringWasNull:")
    public native void setNullableOptionalStringWasNull(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStringWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalStringWasPresent:")
    public native void setNullableOptionalStringWasPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStructValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalStructValue:")
    public native void setNullableOptionalStructValue(@Nullable MTRUnitTestingClusterSimpleStruct value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStructWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalStructWasNull:")
    public native void setNullableOptionalStructWasNull(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableOptionalStructWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalStructWasPresent:")
    public native void setNullableOptionalStructWasPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableStringValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableStringValue:")
    public native void setNullableStringValue(@Nullable String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableStringWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableStringWasNull:")
    public native void setNullableStringWasNull(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableStructValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableStructValue:")
    public native void setNullableStructValue(@Nullable MTRUnitTestingClusterSimpleStruct value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The nullableStructWasNull field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setNullableStructWasNull:")
    public native void setNullableStructWasNull(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalIntValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setOptionalIntValue:")
    public native void setOptionalIntValue(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalIntWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setOptionalIntWasPresent:")
    public native void setOptionalIntWasPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalListValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setOptionalListValue:")
    public native void setOptionalListValue(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalListWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setOptionalListWasPresent:")
    public native void setOptionalListWasPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalStringValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setOptionalStringValue:")
    public native void setOptionalStringValue(@Nullable String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalStringWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setOptionalStringWasPresent:")
    public native void setOptionalStringWasPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalStructValue field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setOptionalStructValue:")
    public native void setOptionalStructValue(@Nullable MTRUnitTestingClusterSimpleStruct value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: The optionalStructWasPresent field will be removed
     */
    @Generated
    @Deprecated
    @Selector("setOptionalStructWasPresent:")
    public native void setOptionalStructWasPresent(@NotNull NSNumber value);

    /**
     * Controls whether the command is a timed command (using Timed Invoke).
     * 
     * If nil (the default value), a regular invoke is done for commands that do
     * not require a timed invoke and a timed invoke with some default timed request
     * timeout is done for commands that require a timed invoke.
     * 
     * If not nil, a timed invoke is done, with the provided value used as the timed
     * request timeout. The value should be chosen small enough to provide the
     * desired security properties but large enough that it will allow a round-trip
     * from the sever to the client (for the status response and actual invoke
     * request) within the timeout window.
     * 
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Timed invoke does not make sense for server to client commands
     */
    @Generated
    @Deprecated
    @Selector("setTimedInvokeTimeoutMs:")
    public native void setTimedInvokeTimeoutMs(@Nullable NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Controls whether the command is a timed command (using Timed Invoke).
     * 
     * If nil (the default value), a regular invoke is done for commands that do
     * not require a timed invoke and a timed invoke with some default timed request
     * timeout is done for commands that require a timed invoke.
     * 
     * If not nil, a timed invoke is done, with the provided value used as the timed
     * request timeout. The value should be chosen small enough to provide the
     * desired security properties but large enough that it will allow a round-trip
     * from the sever to the client (for the status response and actual invoke
     * request) within the timeout window.
     * 
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Timed invoke does not make sense for server to client commands
     */
    @Generated
    @Deprecated
    @Selector("timedInvokeTimeoutMs")
    @Nullable
    public native NSNumber timedInvokeTimeoutMs();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}