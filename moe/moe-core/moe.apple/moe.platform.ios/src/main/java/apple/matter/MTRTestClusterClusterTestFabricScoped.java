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
 * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRTestClusterClusterTestFabricScoped extends MTRUnitTestingClusterTestFabricScoped {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRTestClusterClusterTestFabricScoped(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRTestClusterClusterTestFabricScoped alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRTestClusterClusterTestFabricScoped allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("fabricIndex")
    @NotNull
    public native NSNumber fabricIndex();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("fabricSensitiveCharString")
    @NotNull
    public native String fabricSensitiveCharString();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("fabricSensitiveInt8u")
    @NotNull
    public native NSNumber fabricSensitiveInt8u();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("fabricSensitiveInt8uList")
    @NotNull
    public native NSArray<?> fabricSensitiveInt8uList();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("fabricSensitiveStruct")
    @NotNull
    public native MTRTestClusterClusterSimpleStruct fabricSensitiveStruct();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRTestClusterClusterTestFabricScoped init();

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
    public static native MTRTestClusterClusterTestFabricScoped new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("nullableFabricSensitiveInt8u")
    @Nullable
    public native NSNumber nullableFabricSensitiveInt8u();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("nullableOptionalFabricSensitiveInt8u")
    @Nullable
    public native NSNumber nullableOptionalFabricSensitiveInt8u();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("optionalFabricSensitiveInt8u")
    @Nullable
    public native NSNumber optionalFabricSensitiveInt8u();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("setFabricIndex:")
    public native void setFabricIndex(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("setFabricSensitiveCharString:")
    public native void setFabricSensitiveCharString(@NotNull String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("setFabricSensitiveInt8u:")
    public native void setFabricSensitiveInt8u(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("setFabricSensitiveInt8uList:")
    public native void setFabricSensitiveInt8uList(@NotNull NSArray<?> value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("setFabricSensitiveStruct:")
    public native void setFabricSensitiveStruct(@NotNull MTRTestClusterClusterSimpleStruct value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("setNullableFabricSensitiveInt8u:")
    public native void setNullableFabricSensitiveInt8u(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("setNullableOptionalFabricSensitiveInt8u:")
    public native void setNullableOptionalFabricSensitiveInt8u(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRUnitTestingClusterTestFabricScoped
     */
    @Generated
    @Deprecated
    @Selector("setOptionalFabricSensitiveInt8u:")
    public native void setOptionalFabricSensitiveInt8u(@Nullable NSNumber value);

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