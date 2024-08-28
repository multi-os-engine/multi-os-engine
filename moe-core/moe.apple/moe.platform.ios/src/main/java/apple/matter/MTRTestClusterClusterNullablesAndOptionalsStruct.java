package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.general.ann.Runtime;
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
 * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRTestClusterClusterNullablesAndOptionalsStruct extends MTRUnitTestingClusterNullablesAndOptionalsStruct {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRTestClusterClusterNullablesAndOptionalsStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRTestClusterClusterNullablesAndOptionalsStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRTestClusterClusterNullablesAndOptionalsStruct allocWithZone(VoidPtr zone);

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
    public native MTRTestClusterClusterNullablesAndOptionalsStruct init();

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
    public static native MTRTestClusterClusterNullablesAndOptionalsStruct new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("nullableInt")
    @Nullable
    public native NSNumber nullableInt();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("nullableList")
    @Nullable
    public native NSArray<?> nullableList();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalInt")
    @Nullable
    public native NSNumber nullableOptionalInt();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalList")
    @Nullable
    public native NSArray<?> nullableOptionalList();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalString")
    @Nullable
    public native String nullableOptionalString();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalStruct")
    @Nullable
    public native MTRTestClusterClusterSimpleStruct nullableOptionalStruct();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("nullableString")
    @Nullable
    public native String nullableString();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("nullableStruct")
    @Nullable
    public native MTRTestClusterClusterSimpleStruct nullableStruct();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("optionalInt")
    @Nullable
    public native NSNumber optionalInt();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("optionalList")
    @Nullable
    public native NSArray<?> optionalList();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("optionalString")
    @Nullable
    public native String optionalString();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("optionalStruct")
    @Nullable
    public native MTRTestClusterClusterSimpleStruct optionalStruct();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setNullableInt:")
    public native void setNullableInt(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setNullableList:")
    public native void setNullableList(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalInt:")
    public native void setNullableOptionalInt(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalList:")
    public native void setNullableOptionalList(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalString:")
    public native void setNullableOptionalString(@Nullable String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalStruct:")
    public native void setNullableOptionalStruct(@Nullable MTRTestClusterClusterSimpleStruct value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setNullableString:")
    public native void setNullableString(@Nullable String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setNullableStruct:")
    public native void setNullableStruct(@Nullable MTRTestClusterClusterSimpleStruct value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setOptionalInt:")
    public native void setOptionalInt(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setOptionalList:")
    public native void setOptionalList(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setOptionalString:")
    public native void setOptionalString(@Nullable String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterNullablesAndOptionalsStruct
     */
    @Generated
    @Deprecated
    @Selector("setOptionalStruct:")
    public native void setOptionalStruct(@Nullable MTRTestClusterClusterSimpleStruct value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}