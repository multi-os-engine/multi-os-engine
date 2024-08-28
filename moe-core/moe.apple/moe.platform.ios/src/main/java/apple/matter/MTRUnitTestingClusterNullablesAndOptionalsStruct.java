package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRUnitTestingClusterNullablesAndOptionalsStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRUnitTestingClusterNullablesAndOptionalsStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRUnitTestingClusterNullablesAndOptionalsStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRUnitTestingClusterNullablesAndOptionalsStruct allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
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
    public native MTRUnitTestingClusterNullablesAndOptionalsStruct init();

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
    public static native MTRUnitTestingClusterNullablesAndOptionalsStruct new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nullableInt")
    @Nullable
    public native NSNumber nullableInt();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nullableList")
    @Nullable
    public native NSArray<?> nullableList();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nullableOptionalInt")
    @Nullable
    public native NSNumber nullableOptionalInt();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nullableOptionalList")
    @Nullable
    public native NSArray<?> nullableOptionalList();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nullableOptionalString")
    @Nullable
    public native String nullableOptionalString();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nullableOptionalStruct")
    @Nullable
    public native MTRUnitTestingClusterSimpleStruct nullableOptionalStruct();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nullableString")
    @Nullable
    public native String nullableString();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nullableStruct")
    @Nullable
    public native MTRUnitTestingClusterSimpleStruct nullableStruct();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("optionalInt")
    @Nullable
    public native NSNumber optionalInt();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("optionalList")
    @Nullable
    public native NSArray<?> optionalList();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("optionalString")
    @Nullable
    public native String optionalString();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("optionalStruct")
    @Nullable
    public native MTRUnitTestingClusterSimpleStruct optionalStruct();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNullableInt:")
    public native void setNullableInt(@Nullable NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNullableList:")
    public native void setNullableList(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNullableOptionalInt:")
    public native void setNullableOptionalInt(@Nullable NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNullableOptionalList:")
    public native void setNullableOptionalList(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNullableOptionalString:")
    public native void setNullableOptionalString(@Nullable String value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNullableOptionalStruct:")
    public native void setNullableOptionalStruct(@Nullable MTRUnitTestingClusterSimpleStruct value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNullableString:")
    public native void setNullableString(@Nullable String value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNullableStruct:")
    public native void setNullableStruct(@Nullable MTRUnitTestingClusterSimpleStruct value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setOptionalInt:")
    public native void setOptionalInt(@Nullable NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setOptionalList:")
    public native void setOptionalList(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setOptionalString:")
    public native void setOptionalString(@Nullable String value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setOptionalStruct:")
    public native void setOptionalStruct(@Nullable MTRUnitTestingClusterSimpleStruct value);

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